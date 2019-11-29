package com.megazone.megatong.presentation.ui.home.feed.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import androidx.recyclerview.widget.*
import com.google.android.material.snackbar.Snackbar
import com.megazone.megatong.R
import com.megazone.base.common.utils.AutoClearedValue
import com.megazone.base.common.utils.GeneralFunctions
import com.megazone.base.ui.decoration.FeedItemDecoration
import com.megazone.base.ui.fragment.BaseFragment
import com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource.Companion.FEED_SORT_LATEST
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource.Companion.JOB_TYPE_LOAD_FEEDS
import com.megazone.megatong.presentation.ui.home.HomeActivity
import com.megazone.megatong.presentation.ui.home.feed.adapter.HomeFeedAdapter
import com.megazone.megatong.data.datasource.network.response.Resource
import com.megazone.megatong.data.datasource.network.response.Status
import com.megazone.megatong.domain.usecase.Parameters
import im.ene.toro.PlayerSelector
import im.ene.toro.widget.PressablePlayerSelector
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.recycler_view_container.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import timber.log.Timber
import kotlin.math.max
import kotlin.math.min

class HomeFeedFragment: BaseFragment() {
    private lateinit var adapter: HomeFeedAdapter
    private lateinit var acvAdapter: AutoClearedValue<HomeFeedAdapter>

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
        internal const val FEED_KEYWORD_ALL = "all"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val acvView = AutoClearedValue(this, inflater.inflate(R.layout.fragment_home_feed, container, false))

        return acvView.get()?.rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupSwipeLayout()
        feedPosition = 0
        this@HomeFeedFragment.recycler_view.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                when (newState) {
                    RecyclerView.SCROLL_STATE_IDLE -> {
                        if (lastVisibleItem >= HomeActivity.VISIBLE_UPTO_ITEMS) {
                            isOverFirst = true
                        }
                    }

                    RecyclerView.SCROLL_STATE_DRAGGING -> { }

                    RecyclerView.SCROLL_STATE_SETTLING -> {}

                    else -> { }
                }
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                val vnView = homeActivity.bottom_navigation_view

                vnView.translationY = max(0f, min(vnView.height.toFloat(), vnView.translationY + dy))
                this@HomeFeedFragment.recycler_view.invalidateItemDecorations()
            }
        })

        this@HomeFeedFragment.swipe_layout?.setColorSchemeResources(R.color.redLight)
        this@HomeFeedFragment.recycler_view.setHasFixedSize(true)
        this@HomeFeedFragment.recycler_view.setItemViewCacheSize(10)
        this@HomeFeedFragment.recycler_view.isNestedScrollingEnabled = false
        this@HomeFeedFragment.recycler_view.isVerticalScrollBarEnabled = false
        this@HomeFeedFragment.recycler_view.playerSelector = PlayerSelector.DEFAULT
        layoutManager =  LinearLayoutManager(this.context.applicationContext, RecyclerView.VERTICAL, false)
        this@HomeFeedFragment.recycler_view.layoutManager = layoutManager
        this@HomeFeedFragment.recycler_view.addItemDecoration(FeedItemDecoration(resources.getColor(R.color.whiteHard, null)))
        selector = PressablePlayerSelector(this@HomeFeedFragment.recycler_view)
        this@HomeFeedFragment.recycler_view.playerSelector = selector
        adapter = HomeFeedAdapter(this, selector)
        acvAdapter = AutoClearedValue(this, adapter)
        acvAdapter.get()?.setHasStableIds(true)
        this@HomeFeedFragment.recycler_view.adapter = acvAdapter.get()
        this@HomeFeedFragment.recycler_view.cacheManager = acvAdapter.get()

        getFeeds()
    }

    @ExperimentalCoroutinesApi
    override fun onDestroyView() {
        super.onDestroyView()

        this@HomeFeedFragment.recycler_view.playerSelector = null
    }

    private fun getFeeds() {
        val query = homeActivity.doQuery(JOB_TYPE_LOAD_FEEDS, FEED_KEYWORD_ALL, 1, FEED_SORT_LATEST)

        homeActivity.feedViewModel.setParam(Parameters(query))
        homeActivity.feedViewModel.feed.observe(this.viewLifecycleOwner, Observer { resource ->
            when (resource?.status) {
                Status.SUCCESS -> {
                    resource.data ?: stopFeed(resource)
                    resource.data?.let { list ->
                        @Suppress("UNCHECKED_CAST")
                        val feeds = list as? PagedList<Feed>?
                        when {
                            feeds?.size!! > 0 -> acvAdapter.get()?.submitList(feeds)
                            resource.message != null -> stopFeed(resource)
                            else -> Timber.d("None Feed")
                        }
                    }
                }

                Status.LOADING -> {
                    this@HomeFeedFragment.swipe_layout?.post {
                        this@HomeFeedFragment.swipe_layout.visibility = View.VISIBLE
                        this@HomeFeedFragment.swipe_layout?.isRefreshing = true
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
        this@HomeFeedFragment.swipe_layout?.setColorSchemeResources(R.color.colorPrimary)
        this@HomeFeedFragment.swipe_layout?.setOnRefreshListener {
            homeActivity.runUpdate()
        }
    }
}