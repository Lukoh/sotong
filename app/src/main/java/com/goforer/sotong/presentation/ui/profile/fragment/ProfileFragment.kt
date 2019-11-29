package com.goforer.sotong.presentation.ui.profile.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.goforer.base.common.utils.AutoClearedValue
import com.goforer.base.common.utils.GeneralFunctions
import com.goforer.base.ui.activity.BaseActivity.Companion.FONT_TYPE_MEDIUM
import com.goforer.base.ui.activity.BaseActivity.Companion.FONT_TYPE_REGULAR
import com.goforer.base.ui.decoration.FeedItemDecoration
import com.goforer.base.ui.fragment.BaseFragment
import com.goforer.sotong.R
import com.goforer.sotong.data.datasource.model.cache.entity.Query
import com.goforer.sotong.data.datasource.model.cache.entity.feed.Feed
import com.goforer.sotong.data.datasource.network.resource.NetworkBoundResource
import com.goforer.sotong.data.datasource.network.resource.NetworkBoundResource.Companion.BOUND_BACKEND
import com.goforer.sotong.data.datasource.network.resource.NetworkBoundResource.Companion.NONE_SORT
import com.goforer.sotong.data.datasource.network.response.Resource
import com.goforer.sotong.data.datasource.network.response.Status
import com.goforer.sotong.domain.usecase.Parameters
import com.goforer.sotong.presentation.caller.Caller
import com.goforer.sotong.presentation.caller.Caller.FEED_POSTING_UPDATE_REQUEST
import com.goforer.sotong.presentation.ui.home.HomeActivity
import com.goforer.sotong.presentation.ui.profile.ProfileActivity
import com.goforer.sotong.presentation.ui.profile.adapter.ProfileFeedAdapter
import com.goforer.sotong.presentation.vm.feed.FeedViewModel
import com.goforer.sotong.presentation.vm.login.UserViewModel
import com.mikepenz.materialdrawer.view.BezelImageView
import im.ene.toro.PlayerSelector
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.recycler_view_container.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import timber.log.Timber
import java.util.*
import javax.inject.Inject
import kotlin.math.max
import kotlin.math.min

class ProfileFragment: BaseFragment() {
    private lateinit var adapter: ProfileFeedAdapter
    private lateinit var acvAdapter: AutoClearedValue<ProfileFeedAdapter>

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

    internal val profileActivity: ProfileActivity by lazy {
        activity as ProfileActivity
    }


    @field:Inject
    lateinit var feedViewModel: FeedViewModel

    @field:Inject
    lateinit var userViewModel: UserViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val acvView = AutoClearedValue(this, inflater.inflate(R.layout.fragment_profile, container, false))

        return acvView.get()?.rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupSwipeLayout()
        feedPosition = 0
        this@ProfileFragment.recycler_view.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                when (newState) {
                    RecyclerView.SCROLL_STATE_IDLE -> {
                        if (lastVisibleItem >= HomeActivity.VISIBLE_UPTO_ITEMS) {
                            isOverFirst = true
                        }
                    }

                    RecyclerView.SCROLL_STATE_DRAGGING -> {}

                    RecyclerView.SCROLL_STATE_SETTLING -> {}

                    else -> {
                    }
                }
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                val vnView = profileActivity.bottom_navigation_view

                vnView.translationY = max(0f, min(vnView.height.toFloat(), vnView.translationY + dy))
                this@ProfileFragment.recycler_view.invalidateItemDecorations()
            }
        })

        this@ProfileFragment.recycler_view.setHasFixedSize(true)
        this@ProfileFragment.recycler_view.setItemViewCacheSize(10)
        this@ProfileFragment.recycler_view.isNestedScrollingEnabled = false
        this@ProfileFragment.recycler_view.isVerticalScrollBarEnabled = false
        this@ProfileFragment.recycler_view.playerSelector = PlayerSelector.DEFAULT
        layoutManager =  LinearLayoutManager(this.context.applicationContext, RecyclerView.VERTICAL, false)
        this@ProfileFragment.recycler_view.addItemDecoration(
            FeedItemDecoration(resources.getColor(
                R.color.whiteHard, null))
        )

        adapter = ProfileFeedAdapter(this)
        acvAdapter = AutoClearedValue(this, adapter)
        acvAdapter.get()?.setHasStableIds(true)
        this@ProfileFragment.recycler_view.adapter = acvAdapter.get()

        getUser()
        getFeeds()
    }

    @ExperimentalCoroutinesApi
    override fun onDestroyView() {
        super.onDestroyView()

        feedViewModel.removeAll()
        this@ProfileFragment.recycler_view.playerSelector = null
    }

    private fun getUser() {
        profileActivity.setFontTypeface(tv_profile_item_user_name, FONT_TYPE_MEDIUM)
        profileActivity.setFontTypeface(tv_profile_item_user_name, FONT_TYPE_REGULAR)
        userViewModel.loadUser().observe(this.viewLifecycleOwner, Observer {
            it.photo ?: setUserPic(iv_profile_photo_item_user)
            it.photo?.let { photo ->
                if (photo == "") {
                    setUserPic(iv_profile_photo_item_user)
                } else {
                    profileActivity.setImageDraw(iv_profile_photo_item_user, photo)
                }
            }

            tv_profile_item_user_name.text = it.name
            tv_profile_item_email_id.text = it.email
       })
    }

    private fun getFeeds() {
        val query = doQuery(NetworkBoundResource.JOB_TYPE_LOAD_FEEDS, profileActivity.userId, 1)
        feedViewModel.setParam(Parameters(query))
        feedViewModel.feed.observe(this.viewLifecycleOwner, Observer { resource ->
            when (resource?.status) {
                Status.SUCCESS -> {
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
                    this@ProfileFragment.swipe_layout?.post {
                        this@ProfileFragment.swipe_layout.visibility = View.VISIBLE
                        this@ProfileFragment.swipe_layout?.isRefreshing = true
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

    private fun doQuery(workType: Int, firstParam: Any, secondParam: Any) = Query().apply {
        this.firstParam = firstParam
        this.secondParam = secondParam
        sortType = NONE_SORT
        boundType = BOUND_BACKEND
        jobType = workType
    }

    private fun stopFeed(resource: Resource) {
        stopRefresh()

        when(resource.errorCode) {
            in 400..499 -> {
                Snackbar.make(profileActivity.coordinator_home_layout, getString(R.string.phrase_client_wrong_request), Snackbar.LENGTH_LONG).show()
            }

            in 500..599 -> {
                Snackbar.make(profileActivity.coordinator_home_layout, getString(R.string.phrase_server_wrong_response), Snackbar.LENGTH_LONG).show()
            }

            else -> {
                Snackbar.make(profileActivity.coordinator_home_layout, resource.message.toString(), Snackbar.LENGTH_LONG).show()
            }
        }
    }

    private fun setupSwipeLayout() {
        this@ProfileFragment.swipe_layout?.setColorSchemeResources(R.color.colorPrimary)
        this@ProfileFragment.swipe_layout?.setOnRefreshListener {
            runUpdate()
        }
    }

    private fun runUpdate() {
        val query = doQuery(NetworkBoundResource.JOB_TYPE_LOAD_FEEDS, profileActivity.userId, 1)

        feedViewModel.setParam(Parameters(query))
    }

    internal fun deleteFeed(feedId: String) {
        val query = doQuery(NetworkBoundResource.JOB_TYPE_DELETE_FEED, feedId, -1)

        feedViewModel.setParam(Parameters(query))
    }

    internal fun editFeed(feedId: String) {
        Caller.callFeedPosting(this.profileActivity, "", feedId, FEED_POSTING_UPDATE_REQUEST)
    }

    internal fun setUserPic(view: BezelImageView) {
        val num = Random().nextInt(10)

        if (num % 2 == 0) {
            view.setImageDrawable(context.applicationContext.getDrawable(R.drawable.ic_unknown_g))
        } else {
            view.setImageDrawable(context.applicationContext.getDrawable(R.drawable.ic_unknown_y))
        }
    }

    internal fun stopRefresh() {
        this@ProfileFragment.swipe_layout?.let {
            if (it.isRefreshing) {
                it.isRefreshing = false
            }
        }
    }
}