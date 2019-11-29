package com.megazone.megatong.presentation.ui.profile

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.ActionBar
import com.megazone.base.ui.activity.BaseActivity
import com.megazone.megatong.R
import com.megazone.megatong.presentation.caller.Caller.EXTRA_USER_ID
import com.megazone.megatong.presentation.ui.profile.fragment.ProfileFragment
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity: BaseActivity() {
    private lateinit var profileFragment: ProfileFragment

    internal var userId = ""

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
                userId = savedInstanceState.getString(EXTRA_USER_ID).toString()
            }
        } else {
            networkStatusVisible(false)
        }
    }

    override fun onBackPressed() {
        finishAfterTransition()

        super.onBackPressed()
    }

    @SuppressLint("RestrictedApi")
    override fun setActionBar() {
        setSupportActionBar(this@ProfileActivity.toolbar)

        val actionBar = supportActionBar!!

        actionBar.let {
            actionBar.displayOptions = ActionBar.DISPLAY_SHOW_HOME or ActionBar.DISPLAY_USE_LOGO
            actionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_back)
            actionBar.setDisplayShowTitleEnabled(true)
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeButtonEnabled(true)
            actionBar.elevation = 0f
            setFontTypeface(tv_profile_toolbar_title, FONT_TYPE_BOLD)
        }

        this@ProfileActivity.toolbar?.setNavigationOnClickListener{
            finishAfterTransition()
        }

        this@ProfileActivity.toolbar.hideOverflowMenu()
    }

    override fun setViews(savedInstanceState: Bundle?) {
        this@ProfileActivity.appbar_layout.outlineProvider = null
    }

    override fun setContentView() {
        setContentView(R.layout.activity_profile)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString(EXTRA_USER_ID, userId)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        userId = savedInstanceState.getString(EXTRA_USER_ID)!!
    }

    private fun networkStatusVisible(isVisible: Boolean) = if (isVisible) {
        this@ProfileActivity.iv_disconnect_home.visibility = View.GONE
        this@ProfileActivity.tv_notice1_home.visibility = View.GONE
        this@ProfileActivity.tv_notice2_home.visibility = View.GONE
    } else {
        this@ProfileActivity.iv_disconnect_home.visibility = View.VISIBLE
        this@ProfileActivity.tv_notice1_home.visibility = View.VISIBLE
        this@ProfileActivity.tv_notice2_home.visibility = View.VISIBLE
    }

    private fun transactMainFragment() {
        userId = intent?.getStringExtra(EXTRA_USER_ID)!!
        profileFragment = transactFragment(ProfileFragment::class.java, R.id.profile_container) as ProfileFragment
    }
}