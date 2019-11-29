package com.goforer.sotong.presentation.ui.home.feed.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import androidx.recyclerview.widget.*
import com.google.android.material.snackbar.Snackbar
import com.goforer.sotong.R
import com.goforer.base.common.utils.AutoClearedValue
import com.goforer.base.common.utils.GeneralFunctions
import com.goforer.base.ui.decoration.FeedItemDecoration
import com.goforer.base.ui.fragment.BaseFragment
import com.goforer.sotong.data.datasource.model.cache.entity.feed.Feed
import com.goforer.sotong.data.datasource.network.resource.NetworkBoundResource
import com.goforer.sotong.data.datasource.network.resource.NetworkBoundResource.Companion.FEED_SORT_POPULAR
import com.goforer.sotong.presentation.ui.home.HomeActivity
import com.goforer.sotong.presentation.ui.home.feed.adapter.HomePopFeedAdapter
import com.goforer.sotong.data.datasource.network.response.Resource
import com.goforer.sotong.data.datasource.network.response.Status
import com.goforer.sotong.domain.usecase.Parameters
import im.ene.toro.PlayerSelector
import im.ene.toro.widget.PressablePlayerSelector
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.recycler_view_container.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import timber.log.Timber
import kotlin.math.max
import kotlin.math.min

class HomePopFeedFragment: BaseFragment() {
    private lateinit var adapter: HomePopFeedAdapter
    private lateinit var acvAdapter: AutoClearedValue<HomePopFeedAdapter>

    private lateinit var layoutManager: LinearLayoutManager

    private var isOverFirst = false

    private var feedPosition = 0

    private val lastVisibleItem: Int
        get() {
            return when (val layoutManager= recycler_view?.layoutManager) {
                is LinearLayoutManager -> (layoutManager as? LinearLayoutManager)?.findLastVisibleItemPosition() ?: 0
                is StaggeredGridLayoutManager -> GeneralFunctions.getLastVisibleItem(
                    layoutManager.findLastVisibleItemPositions(null))
                else -> (layoutManager as? GridLayoutManager)?.findLastVisibleItemPosition() ?: 0
            }

        }

    private lateinit var selector: PressablePlayerSelector

    internal val homeActivity: HomeActivity by lazy {
        activity as HomeActivity
    }

    companion object {
        private const val FEED_KEYWORD_ALL = "all"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val acvView = AutoClearedValue(this, inflater.inflate(R.layout.fragment_home_pop_feed, container, false))

        return acvView.get()?.rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupSwipeLayout()
        feedPosition = 0
        this@HomePopFeedFragment.recycler_view.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                when (newState) {
                    RecyclerView.SCROLL_STATE_IDLE -> {
                        if (lastVisibleItem >= HomeActivity.VISIBLE_UPTO_ITEMS) {
                            isOverFirst = true
                        }
                    }

                    RecyclerView.SCROLL_STATE_DRAGGING -> {}

                    RecyclerView.SCROLL_STATE_SETTLING -> {}

                    else -> { }
                }
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                val vnView = homeActivity.bottom_navigation_view

                vnView.translationY = max(0f, min(vnView.height.toFloat(), vnView.translationY + dy))
                this@HomePopFeedFragment.recycler_view.invalidateItemDecorations()
            }
        })

        this@HomePopFeedFragment.recycler_view.setHasFixedSize(true)
        this@HomePopFeedFragment.recycler_view.setItemViewCacheSize(10)
        this@HomePopFeedFragment.recycler_view.isNestedScrollingEnabled = false
        this@HomePopFeedFragment.recycler_view.isVerticalScrollBarEnabled = false
        this@HomePopFeedFragment.recycler_view.playerSelector = PlayerSelector.DEFAULT
        layoutManager =  LinearLayoutManager(this.context.applicationContext, RecyclerView.VERTICAL, false)
        this@HomePopFeedFragment.recycler_view.layoutManager = layoutManager
        this@HomePopFeedFragment.recycler_view.addItemDecoration(FeedItemDecoration(resources.getColor(R.color.whiteHard, null)))
        selector = PressablePlayerSelector(this@HomePopFeedFragment.recycler_view)
        adapter = HomePopFeedAdapter(this, selector)
        acvAdapter = AutoClearedValue(this, adapter)
        acvAdapter.get()?.setHasStableIds(true)
        this@HomePopFeedFragment.recycler_view.adapter = acvAdapter.get()
        this@HomePopFeedFragment.recycler_view.cacheManager = acvAdapter.get()

        getFeeds()
    }

    @ExperimentalCoroutinesApi
    override fun onDestroyView() {
        super.onDestroyView()

        this@HomePopFeedFragment.recycler_view.playerSelector = null
    }

    private fun getFeeds() {
        val query = homeActivity.doQuery(NetworkBoundResource.JOB_TYPE_LOAD_FEEDS, FEED_KEYWORD_ALL, 1, FEED_SORT_POPULAR)

        homeActivity.feedViewModel.setParam(Parameters(query))
        homeActivity.feedViewModel.feed.observe(this.viewLifecycleOwner, Observer { resource ->
            when (resource?.status) {
                Status.SUCCESS -> {
                    resource.data ?: stopFeed(resource)
                    resource.data?.let { feed ->
                        @Suppress("UNCHECKED_CAST")
                        val feeds = feed as? PagedList<Feed>?
                        when {
                            feeds?.size!! > 0 -> acvAdapter.get()?.submitList(feeds)
                            resource.message != null -> stopFeed(resource)
                            else -> Timber.d("None Feed")
                        }
                    }
                }

                Status.LOADING -> {
                    this@HomePopFeedFragment.swipe_layout?.post {
                        this@HomePopFeedFragment.swipe_layout.visibility = View.VISIBLE
                        this@HomePopFeedFragment.swipe_layout?.isRefreshing = true
                    }
                }

                Status.ERROR -> {
                    stopFeed(resource)
                }

                else -> {
                    stopFeed(resource)
                }
            }
        })
    }

    private fun stopFeed(resource: Resource) {
        homeActivity.stopRefresh(this)

        when(resource.errorCode) {
            in 400..499 -> {
                Snackbar.make(homeActivity.coordinator_home_layout, getString(R.string.phrase_client_wrong_request), Snackbar.LENGTH_LONG).show()
            }

            in 500..599 -> {
                Snackbar.make(homeActivity.coordinator_home_layout, getString(R.string.phrase_server_wrong_response), Snackbar.LENGTH_LONG).show()
            }

            else -> {
                Snackbar.make(homeActivity.coordinator_home_layout, resource.message.toString(), Snackbar.LENGTH_LONG).show()
            }
        }
    }

    private fun setupSwipeLayout() {
        this@HomePopFeedFragment.swipe_layout?.setColorSchemeResources(R.color.colorPrimary)
        this@HomePopFeedFragment.swipe_layout?.setOnRefreshListener {
            homeActivity.runUpdate()
        }
    }
}