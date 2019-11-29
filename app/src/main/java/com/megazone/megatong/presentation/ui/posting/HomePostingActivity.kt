package com.megazone.megatong.presentation.ui.posting

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.ActionBar
import com.megazone.base.ui.activity.BaseActivity
import kotlinx.android.synthetic.main.activity_feed_posting.*
import kotlinx.android.synthetic.main.activity_home.appbar_layout
import kotlinx.android.synthetic.main.activity_home.iv_disconnect_home
import kotlinx.android.synthetic.main.activity_home.toolbar
import kotlinx.android.synthetic.main.activity_home.tv_notice1_home
import kotlinx.android.synthetic.main.activity_home.tv_notice2_home
import android.content.Intent
import android.content.pm.ActivityInfo
import com.megazone.megatong.R
import android.net.Uri
import android.text.Editable
import android.text.Spannable
import android.text.TextWatcher
import android.text.style.ForegroundColorSpan
import androidx.lifecycle.Observer
import androidx.work.Data
import androidx.work.ExistingWorkPolicy.KEEP
import androidx.work.ListenableWorker
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import com.google.android.material.snackbar.Snackbar
import okhttp3.RequestBody
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.asRequestBody
import com.megazone.base.common.utils.CommonUtils
import com.megazone.base.common.utils.CommonUtils.withDelay
import com.megazone.megatong.data.datasource.model.cache.entity.Query
import com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource.Companion.BOUND_BACKEND
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource.Companion.JOB_TYPE_FEED_POSTING
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource.Companion.NONE_SORT
import com.megazone.megatong.data.datasource.network.response.Status
import com.megazone.megatong.domain.usecase.Parameters
import com.megazone.megatong.presentation.caller.Caller.EXTRA_FEED_ID
import com.megazone.megatong.presentation.caller.Caller.EXTRA_FEED_POSTING_START_TYPE
import com.megazone.megatong.presentation.caller.Caller.EXTRA_USER_ID
import com.megazone.megatong.presentation.caller.Caller.FEED_POSTING_CREATED_RESULT
import com.megazone.megatong.presentation.caller.Caller.FEED_POSTING_CREATE_REQUEST
import com.megazone.megatong.presentation.caller.Caller.FEED_POSTING_NONE_RESULT
import com.megazone.megatong.presentation.caller.Caller.FEED_POSTING_UPDATED_RESULT
import com.megazone.megatong.presentation.caller.Caller.REQUEST_NONE
import com.megazone.megatong.presentation.ui.home.HomeActivity
import com.megazone.megatong.presentation.ui.posting.glideengine.GlideV4Engine
import com.megazone.megatong.presentation.ui.posting.workmanager.FeedPostingWorker
import com.megazone.megatong.presentation.ui.posting.workmanager.FeedPostingWorker.FeedPostingObject
import com.megazone.megatong.presentation.ui.posting.workmanager.FeedPostingWorker.Companion.FEED_POSTING_WORK
import com.megazone.megatong.presentation.vm.feed.FeedViewModel
import com.zhihu.matisse.Matisse
import com.zhihu.matisse.MimeType
import kotlinx.coroutines.*
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.File
import java.util.concurrent.TimeUnit
import java.util.regex.Pattern
import javax.inject.Inject

class HomePostingActivity: BaseActivity() {
    private var files = arrayListOf<Uri>()

    private var userId = ""
    private var feedId = ""

    private var openType = 0
    private var reenterResultCode = REQUEST_NONE

    private val job = Job()

    private val mainScope = CoroutineScope(Dispatchers.Main + job)

    @field:Inject
    lateinit var feedViewModel: FeedViewModel

    companion object {
        private const val REQUEST_CODE_CHOOSE = 1

        private const val RATIO_WIDTH = 98
        private const val RATIO_HEIGHT = 98

        private const val DELAY_TIME_OUT = 300L

        private const val USER_ID_KEY_VALUE = "userId"
        private const val DESCRIPTION_KEY_VALUE = "description"
        private const val MEDIA_TYPE_KEY_VALUE = "media"

        private const val MEDIA_TYPE_TEXT_PLAIN = "text/plain"
        private const val MEDIA_TYPE_IMAGE_DATA = "image/jpeg"

        private const val MEDIA_TYPE_PHOTO = "photo"
        private const val MEDIA_TYPE_VIDEO = "video"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (isNetworkAvailable) {
            window.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = getColor(R.color.colorPrimaryDark)
            networkStatusVisible(true)
            getIntentData()

            if (openType == FEED_POSTING_CREATE_REQUEST) {
                openChooser()
            } else {
                feedViewModel.getFeed(feedId).observe(this, Observer {
                    fillFeedInfo(it)
                })
            }

            setFontTypeface()
            this@HomePostingActivity.tv_feed_posting_description.addTextChangedListener(object :
                TextWatcher {
                override fun afterTextChanged(s: Editable) {
                    val fcs = ForegroundColorSpan(getColor(R.color.colorHashTag))

                    val pattern = Pattern.compile("#\\s*(\\w+)")
                    val matcher = pattern.matcher(s.toString())

                    // keeps on searching unless there is no more function string found
                    while (matcher.find()) {
                        s.setSpan(
                            fcs,
                            matcher.start(),
                            matcher.end(),
                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                        )
                    }
                }

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            })
        } else {
            networkStatusVisible(false)
        }
    }

    @ExperimentalCoroutinesApi
    override fun onDestroy() {
        super.onDestroy()

        mainScope.cancel()
        job.cancel()
    }

    override fun onBackPressed() {
        finishAfterTransition()

        super.onBackPressed()
    }

    @SuppressLint("RestrictedApi")
    override fun setActionBar() {
        setSupportActionBar(this@HomePostingActivity.toolbar)

        val actionBar = supportActionBar

        actionBar?.let {
            it.displayOptions = ActionBar.DISPLAY_SHOW_HOME or ActionBar.DISPLAY_USE_LOGO
            it.setHomeAsUpIndicator(R.drawable.ic_arrow_back)
            it.setDisplayShowTitleEnabled(true)
            it.setDisplayHomeAsUpEnabled(true)
            it.setHomeButtonEnabled(true)
            it.setDisplayShowTitleEnabled(true)
            it.elevation = 0f
        }

        this@HomePostingActivity.toolbar.hideOverflowMenu()
    }

    override fun setViews(savedInstanceState: Bundle?) {
        this@HomePostingActivity.appbar_layout.outlineProvider = null
    }

    override fun setContentView() {
        setContentView(R.layout.activity_feed_posting)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString(EXTRA_USER_ID, userId)
        outState.putString(EXTRA_FEED_ID, feedId)
        outState.putInt(EXTRA_FEED_POSTING_START_TYPE, openType)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        userId = savedInstanceState.getString(EXTRA_USER_ID)!!
        feedId = savedInstanceState.getString(EXTRA_FEED_ID)!!
        openType = savedInstanceState.getInt(EXTRA_FEED_POSTING_START_TYPE)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_feed_posting, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onPreparePanel(featureId: Int, view: View?, menu: Menu): Boolean {
        if (menu.javaClass.simpleName == "MenuBuilder") {
            try {
                @SuppressLint("PrivateApi")
                val method = menu.javaClass.getDeclaredMethod(
                    "setOptionalIconsVisible",
                    java.lang.Boolean.TYPE
                )
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
            R.id.action_confirm -> {
                if (this@HomePostingActivity.tv_feed_posting_description.text.toString() == "") {
                    Snackbar.make(
                        this@HomePostingActivity.coordinator_feed_posting_layout,
                        getString(R.string.phrase_client_wrong_request),
                        Snackbar.LENGTH_LONG
                    ).show()
                } else {
                    val oneTimeWorkRequest =
                        OneTimeWorkRequest.Builder(FeedPostingWorker::class.java)
                            .setInputData(createInputData(openType))
                            .setInitialDelay(1, TimeUnit.SECONDS).build()

                    WorkManager.getInstance(this)
                        .beginUniqueWork(FEED_POSTING_WORK, KEEP, oneTimeWorkRequest).enqueue()
                    item.isEnabled = false
                }

                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        FeedPostingObject.activity = this
        if (requestCode == REQUEST_CODE_CHOOSE && resultCode == RESULT_OK) {
            val selectedPhotos = Matisse.obtainResult(data)

            if (selectedPhotos.size == 0) {
                reenterResultCode = FEED_POSTING_NONE_RESULT
                onBackPressed()

                return
            }

            for (i in 0 until selectedPhotos.size) {
                files.add(selectedPhotos[i])
            }

            setFixedImageSize(RATIO_WIDTH, RATIO_HEIGHT)
            setImageDraw(
                this@HomePostingActivity.iv_feed_posting_photo,
                this@HomePostingActivity.feed_posting_photo_constraintLayoutContainer,
                CommonUtils.getBitmapFromUri(this, files[selectedPhotos.size - 1]),
                false
            )

            this@HomePostingActivity.iv_cascade.visibility = View.VISIBLE

        } else {
            reenterResultCode = FEED_POSTING_NONE_RESULT
            onBackPressed()
        }
    }

    override fun finishAfterTransition() {
        supportPostponeEnterTransition()
        val intent = Intent(this, HomeActivity::class.java)

        setResult(reenterResultCode, intent)

        super.finishAfterTransition()
    }

    private fun networkStatusVisible(isVisible: Boolean) = if (isVisible) {
        this@HomePostingActivity.iv_disconnect_home.visibility = View.GONE
        this@HomePostingActivity.tv_notice1_home.visibility = View.GONE
        this@HomePostingActivity.tv_notice2_home.visibility = View.GONE
    } else {
        this@HomePostingActivity.iv_disconnect_home.visibility = View.VISIBLE
        this@HomePostingActivity.tv_notice1_home.visibility = View.VISIBLE
        this@HomePostingActivity.tv_notice2_home.visibility = View.VISIBLE
    }

    private fun getIntentData() {
        userId = intent.getStringExtra(EXTRA_USER_ID)!!
        feedId = intent.getStringExtra(EXTRA_FEED_ID)!!
        openType = intent.getIntExtra(EXTRA_FEED_POSTING_START_TYPE, REQUEST_NONE)
    }

    private fun setFontTypeface() {
        setFontTypeface(this@HomePostingActivity.tv_feed_posting_description, FONT_TYPE_REGULAR)
        setFontTypeface(this@HomePostingActivity.tv_title_name, FONT_TYPE_MEDIUM)
        setFontTypeface(this@HomePostingActivity.tv_uploading, FONT_TYPE_MEDIUM)
    }

    private fun openChooser() {
        Matisse.from(this)
            .choose(MimeType.ofImage())
            .countable(true)
            .maxSelectable(4)
            .restrictOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED)
            .thumbnailScale(0.85f)
            .imageEngine(GlideV4Engine())
            .forResult(REQUEST_CODE_CHOOSE)

    }

    private fun doQuery(type: Int, mediaType: String) = Query().apply {
        val metaPhotoData: MutableMap<String, RequestBody> = HashMap()
        val fileList = ArrayList<MultipartBody.Part>()

        metaPhotoData[USER_ID_KEY_VALUE] = userId.toRequestBody(MEDIA_TYPE_TEXT_PLAIN.toMediaTypeOrNull())
        metaPhotoData[DESCRIPTION_KEY_VALUE] = tv_feed_posting_description.text.toString().toRequestBody(MEDIA_TYPE_TEXT_PLAIN.toMediaTypeOrNull())
        metaPhotoData[MEDIA_TYPE_KEY_VALUE] = mediaType.toRequestBody(MEDIA_TYPE_TEXT_PLAIN.toMediaTypeOrNull())

        if (type == JOB_TYPE_FEED_POSTING) {
            for (pos in 0 until files.size) {
                val path = CommonUtils.getPathFromUri(applicationContext, files[pos])

                path ?: handleError()
                path?.let {
                    val file = File(path)
                    val photo = MultipartBody.Part.createFormData("photos" + (pos + 1).toString(), file.name, file.asRequestBody(MEDIA_TYPE_IMAGE_DATA.toMediaTypeOrNull()))

                    fileList.add(photo)
                }
            }

            this.firstParam = metaPhotoData
            this.secondParam = fileList

            reenterResultCode = FEED_POSTING_CREATED_RESULT
        } else {
            this.firstParam = feedId
            this.secondParam = metaPhotoData
            reenterResultCode = FEED_POSTING_UPDATED_RESULT
        }

        sortType = NONE_SORT
        boundType = BOUND_BACKEND
        jobType = type
    }

    private fun handleError() {
        Snackbar.make(coordinator_feed_posting_layout, getString(R.string.phrase_no_media_file), Snackbar.LENGTH_LONG).show()

        return
    }

    private fun createInputData(type: Int): Data {
        val builder = Data.Builder()

        builder.putInt(FEED_POSTING_WORK, type)

        return builder.build()
    }

    private fun fillFeedInfo(feed: Feed) {
        setFixedImageSize(RATIO_HEIGHT, RATIO_WIDTH)
        setImageDraw(
            iv_feed_posting_photo, feed_posting_photo_constraintLayoutContainer,
            feed.photos?.get(feed.photos.size - 1)?.photo!!, false
        )

        setSpan(this, tv_feed_posting_description, feed.description)
    }

    private fun showWorkInProgress() {
        card_feed_posting_holder.alpha = 0.5f

        container_progress_upload.visibility = View.VISIBLE
    }

    private fun showWorkIsFinished() {
        card_feed_posting_holder.alpha = 1f
        container_progress_upload.visibility = View.GONE
    }

    private fun showMessage(isSucceeded: Boolean) {
        if (isSucceeded) {
            CommonUtils.makeStatusNotification(this, getString(R.string.phrase_posting_success))
        } else {
            CommonUtils.makeStatusNotification(this, getString(R.string.phrase_posting_failed))
        }

        withDelay(DELAY_TIME_OUT) {
            // 피드 포스팅 업로드가 끝나고 나서 홈 화면으로 돌아가면 바로 업데이트 되게 해야함..... (후에 체크필요)
            finishAfterTransition()
        }
    }

    internal fun runWork(type: Int) {
        feedViewModel.setParam(Parameters(doQuery(type, MEDIA_TYPE_PHOTO)))
        launchWork {
            feedViewModel.feed.observe(this, Observer { resource ->
                when (resource?.status) {
                    Status.SUCCESS -> {
                        showWorkIsFinished()
                        ListenableWorker.Result.success()
                        showMessage(true)
                    }

                    Status.LOADING -> {
                        /*로딩 이미지 구현 필요*/
                        showWorkInProgress()
                    }

                    Status.ERROR -> {
                        showWorkIsFinished()
                        ListenableWorker.Result.failure()
                        showMessage(false)
                    }

                    else -> {
                        showWorkIsFinished()
                        ListenableWorker.Result.failure()
                        showMessage(false)
                    }
                }
            })
        }
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