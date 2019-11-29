package com.goforer.sotong.presentation.ui.posting.workmanager

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.goforer.sotong.data.datasource.network.resource.NetworkBoundResource.Companion.JOB_TYPE_FEED_POSTING
import com.goforer.sotong.data.datasource.network.resource.NetworkBoundResource.Companion.JOB_TYPE_FEED_UPDATE
import com.goforer.sotong.presentation.caller.Caller.FEED_POSTING_CREATE_REQUEST
import com.goforer.sotong.presentation.caller.Caller.FEED_POSTING_UPDATE_REQUEST
import com.goforer.sotong.presentation.ui.posting.HomePostingActivity
import com.goforer.sotong.presentation.ui.posting.workmanager.FeedPostingWorker.FeedPostingObject.activity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import timber.log.Timber
import java.io.FileNotFoundException

class FeedPostingWorker(val context: Context, params: WorkerParameters): CoroutineWorker(context, params) {
    companion object {
        internal const val FEED_POSTING_WORK = "posting_work"
    }

    object FeedPostingObject {
        internal lateinit var activity: HomePostingActivity
    }

    override suspend fun doWork(): Result = coroutineScope {
        val type = inputData.getInt(FEED_POSTING_WORK, 0)

        withContext(this.coroutineContext + Dispatchers.IO) {
            when(type) {
                FEED_POSTING_CREATE_REQUEST -> {
                    activity.runWork(JOB_TYPE_FEED_POSTING)
                }

                FEED_POSTING_UPDATE_REQUEST -> {
                    activity.runWork(JOB_TYPE_FEED_UPDATE)
                }
            }
        }

        try {
            Result.success()
        } catch (e: FileNotFoundException) {
            Timber.e(e)
            Result.failure()
            throw RuntimeException("Failed to get the Feed posting uploaded ", e)
        } catch (throwable: Throwable) {
            Timber.e(throwable)
            Result.failure()
        }
    }
}