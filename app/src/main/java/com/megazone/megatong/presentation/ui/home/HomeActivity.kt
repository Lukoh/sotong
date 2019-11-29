package com.megazone.megatong.presentation.ui.home

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.transition.Transition
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.ActionBar
import androidx.core.app.ActivityCompat
import androidx.core.app.SharedElementCallback
import androidx.core.content.ContextCompat
import com.megazone.base.common.utils.CommonUtils.withDelay
import com.megazone.megatong.R
import com.megazone.megatong.presentation.caller.Caller.EXTRA_HOME_BOTTOM_MENU_ID
import com.megazone.megatong.presentation.common.effect.transition.TransitionCallback
import com.megazone.base.ui.activity.BaseActivity
import com.megazone.base.ui.fragment.BaseFragment
import com.megazone.base.ui.view.helper.BottomNavigationViewHelper
import com.megazone.megatong.data.datasource.model.cache.entity.Query
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource.Companion.BOUND_BACKEND
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource.Companion.FEED_SORT_POPULAR
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource.Companion.JOB_TYPE_DELETE_FEED
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource.Companion.JOB_TYPE_LOAD_FEEDS
import com.megazone.megatong.domain.usecase.Parameters
import com.megazone.megatong.presentation.caller.Caller
import com.megazone.megatong.presentation.caller.Caller.EXTRA_USER_ID
import com.megazone.megatong.presentation.caller.Caller.FEED_POSTING_CREATED_RESULT
import com.megazone.megatong.presentation.caller.Caller.FEED_POSTING_CREATE_REQUEST
import com.megazone.megatong.presentation.caller.Caller.FEED_POSTING_UPDATED_RESULT
import com.megazone.megatong.presentation.ui.home.feed.fragment.HomeFeedFragment
import com.megazone.megatong.presentation.ui.home.feed.fragment.HomePopFeedFragment
import com.megazone.megatong.presentation.vm.feed.FeedViewModel
import com.mikepenz.materialdrawer.view.BezelImageView
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.recycler_view_container.*
import java.util.*
import javax.inject.Inject
import kotlin.system.exitProcess

class HomeActivity: BaseActivity() {
    private var resultCode = 0
    private var itemId = 0

    private lateinit var bottomMenuItem: MenuItem

    private lateinit var feedFragment: HomeFeedFragment
    private lateinit var popFeedFragment: HomePopFeedFragment

    private lateinit var actionBar: ActionBar

    internal var userId = ""

    @field:Inject
    internal lateinit var feedViewModel: FeedViewModel

    companion object {
        internal const val VISIBLE_UPTO_ITEMS = 10
    }

    private val sharedExitListener = object : TransitionCallback() {
        override fun onTransitionEnd(transition: Transition) {
            removeCallback()
        }

        override fun onTransitionCancel(transition: Transition) {
            removeCallback()
        }

        private fun removeCallback() {
            window.sharedElementExitTransition.removeListener(this)
            setExitSharedElementCallback(null as SharedElementCallback?)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (isNetworkAvailable) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = getColor(R.color.colorPrimaryDark)
            networkStatusVisible(true)
            savedInstanceState ?: transactMainFragment()
            savedInstanceState?.let {
                itemId = savedInstanceState.getInt(EXTRA_HOME_BOTTOM_MENU_ID, 0)
                userId = savedInstanceState.getString(EXTRA_USER_ID).toString()
                bottomMenuItem = this@HomeActivity.bottom_navigation_view.menu.findItem(this@HomeActivity.bottom_navigation_view.selectedItemId)
                selectItem(bottomMenuItem, itemId)
            }

            this@HomeActivity.bottom_navigation_view.setOnNavigationItemSelectedListener {
                bottomMenuItem = it
                itemId = it.itemId
                selectItem(bottomMenuItem, it.itemId)

                false
            }

            BottomNavigationViewHelper.setupView(this@HomeActivity.bottom_navigation_view)
        } else {
            networkStatusVisible(false)
        }
    }

    override fun onBackPressed() {
        ActivityCompat.finishAffinity(this)
        exitProcess(0)
    }

    @SuppressLint("RestrictedApi")
    override fun setActionBar() {
        setSupportActionBar(this@HomeActivity.toolbar)

        actionBar = supportActionBar!!

        actionBar.let {
            actionBar.displayOptions = ActionBar.DISPLAY_SHOW_HOME or ActionBar.DISPLAY_USE_LOGO
            actionBar.setDisplayShowTitleEnabled(true)
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeButtonEnabled(true)
            actionBar.elevation = 0f
        }

        this@HomeActivity.toolbar.hideOverflowMenu()
    }

    override fun setViews(savedInstanceState: Bundle?) {
        this@HomeActivity.appbar_layout.outlineProvider = null
    }

    override fun setContentView() {
        setContentView(R.layout.activity_home)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt(EXTRA_HOME_BOTTOM_MENU_ID, itemId)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        itemId = savedInstanceState.getInt(EXTRA_HOME_BOTTOM_MENU_ID, 0)
    }

    override fun onActivityReenter(resultCode: Int, data: Intent?) {
        super.onActivityReenter(resultCode, data)

        this.resultCode = resultCode
        when(resultCode) {
            FEED_POSTING_CREATED_RESULT, FEED_POSTING_UPDATED_RESULT -> {
                runUpdate()
            }

            else -> { }
        }

        // Listener to reset shared element exit transition callbacks.
        window.sharedElementExitTransition.addListener(sharedExitListener)
        supportPostponeEnterTransition()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_home, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onPreparePanel(featureId: Int, view: View?, menu: Menu): Boolean {
        if (menu.javaClass.simpleName == "MenuBuilder") {
            try {
                @SuppressLint("PrivateApi")
                val method = menu.javaClass.getDeclaredMethod("setOptionalIconsVisible", java.lang.Boolean.TYPE)
                method.isAccessible = true
                method.invoke(menu, true)
            } catch (e: NoSuchMethodException) {
                System.err.println(e.message)
                e.printStackTrace()
            } catch (e: Exception) {
                throw RuntimeException(e)
            }
        }

        return super.onPreparePanel(featureId, view, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_profile -> {
                Caller.callProfile(this, userId)

                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun transactMainFragment() {
        itemId = 0
        userId = intent?.getStringExtra(EXTRA_USER_ID)!!
        feedFragment = transactFragment(HomeFeedFragment::class.java, R.id.home_container) as HomeFeedFragment
    }

    private fun networkStatusVisible(isVisible: Boolean) = if (isVisible) {
        this@HomeActivity.iv_disconnect_home.visibility = View.GONE
        this@HomeActivity.tv_notice1_home.visibility = View.GONE
        this@HomeActivity.tv_notice2_home.visibility = View.GONE
    } else {
        this@HomeActivity.iv_disconnect_home.visibility = View.VISIBLE
        this@HomeActivity.tv_notice1_home.visibility = View.VISIBLE
        this@HomeActivity.tv_notice2_home.visibility = View.VISIBLE
    }

    private fun selectItem(menuItem: MenuItem?, id: Int) {
        menuItem?.let {
            it.isChecked = true
        }

        this@HomeActivity.toolbar.background = ColorDrawable(ContextCompat.getColor(this, R.color.colorPrimary))
        when (id) {
            R.id.navigation_home_feed -> {
                feedFragment = transactFragment(HomeFeedFragment::class.java, R.id.home_container) as HomeFeedFragment
            }

            R.id.navigation_pop_feed -> {
                popFeedFragment = transactFragment(HomePopFeedFragment::class.java, R.id.home_container) as HomePopFeedFragment
            }

            R.id.navigation_posting -> {
                menuItem?.isEnabled = false
                Caller.callFeedPosting(this, userId, "", FEED_POSTING_CREATE_REQUEST)
                withDelay(200L) {
                    menuItem?.isEnabled = true
                }
            }
        }
    }

    internal fun doQuery(jobType: Int, firstParam: Any, secondParam: Any, sortType: String) = Query().apply {
        this.firstParam = firstParam
        this.secondParam = secondParam
        this.sortType = sortType
        boundType = BOUND_BACKEND
        this.jobType = jobType
    }

    internal fun remove(view: View, feedId: String) {
        view.setOnClickListener {
            deleteFeed(feedId)
        }
    }

    internal fun edit(view: View, feedId: String) {
        view.setOnClickListener {
            editFeed(feedId)
        }
    }

    private fun setUnknownUserPic(view: BezelImageView) {
        val num = Random().nextInt(10)

        if (num % 2 ==0) {
            view.setImageDrawable(getDrawable(R.drawable.ic_unknown_g))
        } else {
            view.setImageDrawable(getDrawable(R.drawable.ic_unknown_y))
        }
    }

    private fun deleteFeed(feedId: String) {
        val query = doQuery(JOB_TYPE_DELETE_FEED, feedId, -1, FEED_SORT_POPULAR)

        feedViewModel.setParam(Parameters(query))
    }

    private fun editFeed(feedId: String) {
        Caller.callFeedPosting(this, "", feedId, Caller.FEED_POSTING_UPDATE_REQUEST)
    }

    internal fun setUserPic(picPath: String?, view: BezelImageView) {
        picPath ?: setUnknownUserPic(view)
        picPath?.let {
            if (picPath == "") {
                setUnknownUserPic(view)
            } else {
                setImageDraw(view, it)
            }
        }
    }

    internal fun runUpdate() {
        val query = doQuery(JOB_TYPE_LOAD_FEEDS, userId, 1, FEED_SORT_POPULAR)

        feedViewModel.setParam(Parameters(query))
    }

    internal fun stopRefresh(fragment: BaseFragment) {
        when(fragment) {
            is HomeFeedFragment -> {
                fragment.swipe_layout?.let {
                    if (it.isRefreshing) {
                        it.isRefreshing = false
                    }
                }
            }

            is HomePopFeedFragment -> {
                fragment.swipe_layout?.let {
                    if (it.isRefreshing) {
                        it.isRefreshing = false
                    }
                }
            }
        }
    }
}