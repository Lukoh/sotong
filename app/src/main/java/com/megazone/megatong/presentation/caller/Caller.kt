package com.megazone.megatong.presentation.caller

import android.app.Activity
import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.util.Pair
import android.view.View
import com.megazone.megatong.presentation.ui.home.HomeActivity
import com.megazone.megatong.presentation.ui.posting.HomePostingActivity
import com.megazone.megatong.presentation.ui.login.LogInActivity
import com.megazone.megatong.presentation.ui.profile.ProfileActivity

object Caller {
    const val EXTRA_HOME_BOTTOM_MENU_ID = "megatong:home_bottom_menu_id"
    const val EXTRA_USER_ID = "megatong:userid"
    const val EXTRA_FEED_POSTING_START_TYPE = "megatong:posting_type"
    const val EXTRA_FEED_ID = "megatong:feedid"

    const val REQUEST_NONE = -1
    const val FEED_POSTING_CREATE_REQUEST = 1000
    const val FEED_POSTING_UPDATE_REQUEST = 1001

    const val FEED_POSTING_CREATED_RESULT = 2000
    const val FEED_POSTING_UPDATED_RESULT = 2001
    const val FEED_POSTING_NONE_RESULT = 2002

    private fun createIntent(context: Context?, cls: Class<*>, isNewTask: Boolean): Intent {
        val intent = Intent(context, cls)

        if (isNewTask && context !is Activity) {
            intent.flags = (Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
        }

        intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP

        return intent
    }

    fun callLogIn(context: Context) {
        val intent = createIntent(context, LogInActivity::class.java, true)

        context.startActivity(intent)
    }

    fun callHome(context: Context, userId: String) {
        val intent = createIntent(context, HomeActivity::class.java, true)

        intent.putExtra(EXTRA_USER_ID, userId)
        context.startActivity(intent)
    }

    fun callFeedPosting(context: Context, userId: String, feedId: String, requestCode: Int) {
        val intent = createIntent(context, HomePostingActivity::class.java, true)

        intent.putExtra(EXTRA_USER_ID, userId)
        intent.putExtra(EXTRA_FEED_POSTING_START_TYPE, requestCode)
        intent.putExtra(EXTRA_FEED_ID, feedId)
        (context as HomeActivity).startActivityForResult(intent, requestCode)
    }

    fun callProfile(context: Context, userId: String) {
        val intent = createIntent(context, ProfileActivity::class.java, true)

        intent.putExtra(EXTRA_USER_ID, userId)
        context.startActivity(intent)
    }
}