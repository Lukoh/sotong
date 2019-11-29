package com.megazone.megatong.presentation.ui.splash

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.google.firebase.auth.FirebaseAuth
import com.megazone.megatong.Megatong
import com.megazone.megatong.R
import com.megazone.megatong.presentation.common.SharedPreference
import com.megazone.base.ui.activity.BaseActivity
import com.megazone.megatong.presentation.caller.Caller
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.coroutines.*

@SuppressLint("Registered")
class SplashActivity: BaseActivity() {
    private var splashStart: Long = 0

    private var auth: FirebaseAuth? = null

    private val job = Job()

    private val defaultScope = CoroutineScope(Dispatchers.Default + job)

    private val permissions = arrayOf(
        Manifest.permission.READ_CONTACTS,
        Manifest.permission.CAMERA,
        Manifest.permission.WRITE_CONTACTS, Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.CAMERA)

    companion object {
        private const val MIN_SPLASH_TIME = 1500
        private const val REQUEST_ID_MULTIPLE_PERMISSIONS = 1

        fun hasPermissions(context: Context?, vararg permissions: String): Boolean {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N && context != null) {
                for (permission in permissions) {
                    if (ActivityCompat.checkSelfPermission(context, permission)
                        != PackageManager.PERMISSION_GRANTED) {
                        return false
                    }
                }
            }

            return true
        }
    }

    override fun setContentView() {
        setContentView(R.layout.activity_splash)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (!isNetworkAvailable) {
            this@SplashActivity.disconnect_container.visibility = View.VISIBLE

            return
        }

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        window.statusBarColor = Color.TRANSPARENT

        /* *************************************
         *              GOOGLE                 *
         ***************************************/
        auth = FirebaseAuth.getInstance()
        splashStart = System.currentTimeMillis()
        setFontTypeface()
    }

    override fun onResume() {
        super.onResume()

        if (!isNetworkAvailable) {
            return
        }

        if (!hasPermissions(this, *permissions)) {
            ActivityCompat.requestPermissions(this, permissions, REQUEST_ID_MULTIPLE_PERMISSIONS)
        } else {
            onWait(SharedPreference.getSharedPreferenceSocialLogin(this))
        }
    }

    @ExperimentalCoroutinesApi
    override fun onDestroy() {
        super.onDestroy()

        defaultScope.cancel()
        job.cancel()
    }

    @SuppressLint("CheckResult")
    override fun setViews(savedInstanceState: Bundle?) {
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>,
                                            grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        // Note: If request is cancelled, the result arrays are empty.
        if (grantResults.isNotEmpty()) {
            when (requestCode) {
                REQUEST_ID_MULTIPLE_PERMISSIONS -> {
                    if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        onWait(SharedPreference.getSharedPreferenceSocialLogin(this))
                    }
                }
            }
        } else {
            Toast.makeText(applicationContext, getString(R.string.phrase_permission_cancel), Toast.LENGTH_SHORT).show()
            launchWork {
                delay(Toast.LENGTH_SHORT.toLong())
                this.close()
            }
        }
    }

    private fun setFontTypeface() {
        val krRegularTypeface = Typeface.createFromAsset(applicationContext?.assets, NOTO_SANS_KR_MEDIUM)

        tv_title.typeface = krRegularTypeface
    }

    private fun onWait(snsName: String) = launchWork {
        val elapsed = System.currentTimeMillis() - splashStart
        val moreSplash = if (MIN_SPLASH_TIME <= elapsed) 0 else MIN_SPLASH_TIME - elapsed

        delay(moreSplash)
        auth?.currentUser ?: moveToLogIn()
        auth?.currentUser?.apply {
            goToHome(this.uid)

            return@launchWork
        }
    }

    private fun moveToLogIn() {
        Caller.callLogIn(this)
        this@SplashActivity.finish()
    }

    private fun goToHome(id: String) {
        Caller.callHome(this, id)
        this@SplashActivity.finish()
    }

    private fun close() {
        Megatong.exitApplication(this)
    }

    /**
     * Helper function to call something doing function
     *
     * By marking `block` as `suspend` this creates a suspend lambda which can call suspend
     * functions.
     *
     * @param block lambda to actually do some work. It is called in the defaultScope.
     *              lambda the some work will do
     */
    private inline fun launchWork(crossinline block: suspend () -> Unit): Job {
        return defaultScope.launch {
            block()
        }
    }

}