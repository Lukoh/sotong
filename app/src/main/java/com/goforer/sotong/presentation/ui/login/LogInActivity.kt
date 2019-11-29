package com.goforer.sotong.presentation.ui.login

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.SignInButton
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.goforer.sotong.R
import com.goforer.base.common.utils.CommonUtils.showToastMessage
import com.goforer.sotong.presentation.common.SharedPreference
import com.goforer.base.ui.activity.BaseActivity
import com.goforer.sotong.data.datasource.model.cache.entity.Query
import com.goforer.sotong.data.datasource.model.cache.entity.user.User
import com.goforer.sotong.data.datasource.network.resource.NetworkBoundResource
import com.goforer.sotong.data.datasource.network.response.Status
import com.goforer.sotong.domain.usecase.Parameters
import com.goforer.sotong.presentation.caller.Caller
import com.goforer.sotong.presentation.vm.login.UserViewModel
import kotlinx.android.synthetic.main.activity_log_in.*
import kotlinx.coroutines.*
import timber.log.Timber
import javax.inject.Inject

class LogInActivity: BaseActivity() {
    private var auth: FirebaseAuth? = null

    /* Client used to interact with Google APIs. */
    private var googleApiClient: GoogleSignInClient? = null

    private val job = Job()

    private val mainScope = CoroutineScope(Dispatchers.Main + job)

    @field:Inject
    lateinit var userViewModel: UserViewModel

    companion object {
        internal const val SNS_NAME_GOOGLE = "GOOGLE"

        private const val RC_SIGN_IN = 9001
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (!isNetworkAvailable) {
            this@LogInActivity.disconnect_container.visibility = View.VISIBLE
            this@LogInActivity.iv_disconnect.visibility = View.VISIBLE
            this@LogInActivity.tv_notice1.visibility = View.VISIBLE
            this@LogInActivity.tv_notice2.visibility = View.VISIBLE

            return
        }

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        window.statusBarColor = Color.TRANSPARENT

        /* *************************************
         *              GOOGLE                 *
         ***************************************/
        auth = FirebaseAuth.getInstance()
    }

    override fun setContentView() {
        setContentView(R.layout.activity_log_in)

        /* *************************************
         *              GOOGLE                 *
         ***************************************/
        // Configure Google Sign In
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        /* Setup the Google API object to allow Google+ logins */
        googleApiClient = GoogleSignIn.getClient(this, gso)

    }

    override fun onStart() {
        super.onStart()

        /* *************************************
         *              GOOGLE                 *
         ***************************************/
        // Check if user is signed in (non-null) and update UI accordingly.
        /*
        val currentUser = auth?.currentUser
        currentUser?.let {
            goToHome(currentUser.uid)

            return
        }
         */
    }

    @ExperimentalCoroutinesApi
    override fun onDestroy() {
        super.onDestroy()

        mainScope.cancel()
        job.cancel()
    }

    override fun setViews(savedInstanceState: Bundle?) {
        /* *************************************
         *              GOOGLE                 *
         ***************************************/
        this@LogInActivity.sign_in_button.setSize(SignInButton.SIZE_STANDARD)
        this@LogInActivity.sign_in_button.setOnClickListener {
            SharedPreference.saveSharePreferenceSocialLogin(this, SNS_NAME_GOOGLE)
            signIn()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        /* *************************************
         *              GOOGLE                 *
         ***************************************/
        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)

            handleSignInResult(task)
        }
    }

    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account = completedTask.getResult(ApiException::class.java)

            account?.let {
                firebaseAuthWithGoogle(account)
            }
        } catch (e: ApiException) {
            showMessage(e.toString())
        }
    }

    private fun goToHome(userId: String) {
        finish()
        Caller.callHome(this, userId)
    }

    private fun showMessage(message: String) {
        showToastMessage(this, message, Toast.LENGTH_SHORT)
    }

    /* *************************************
     *              GOOGLE                 *
     ***************************************/
    private fun signIn() {
        val signInIntent = googleApiClient?.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }

    /* *************************************
     *              GOOGLE                 *
     ***************************************/
    private fun firebaseAuthWithGoogle(acct: GoogleSignInAccount) {
        val credential = GoogleAuthProvider.getCredential(acct.idToken, null)

        auth?.signInWithCredential(credential)
            ?.addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val user = auth?.currentUser

                    user?.let {
                        val phone = it.phoneNumber ?: " "
                        val userInfo = User(it.uid, it.email, it.isEmailVerified, it.displayName, it.providerId, phone, it.photoUrl!!.toString())
                        val query = doQuery(Query() , userInfo)

                        userViewModel.setParam(Parameters(query))
                        userViewModel.user.observe(this, Observer {resource ->
                            when (resource?.status) {
                                Status.SUCCESS -> {
                                    Timber.d("Debug: Get User Info")

                                    goToHome((resource.data as User).id)
                                }

                                Status.LOADING -> {  Timber.d("Login loading...") }

                                Status.ERROR -> { Timber.d("Debug: Failed - Getting User Info") }

                                else -> {
                                }
                            }
                        })
                    }
                } else {
                    // If sign in fails, display a message to the user.
                    showToastMessage(this@LogInActivity, "Authentication failed.",
                        Toast.LENGTH_SHORT)
                }
            }
    }

    private fun doQuery(query: Query, user: User): Query {
        query.firstParam = user
        query.secondParam = -1
        query.sortType = ""
        query.boundType = NetworkBoundResource.BOUND_BACKEND
        query.jobType = NetworkBoundResource.JOB_TYPE_ADD_USER

        return query
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
        return mainScope.launch {
            block()
        }
    }
}
