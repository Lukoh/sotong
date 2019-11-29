/*
 * Copyright 2019 Lukoh Nam, goForer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.
 * If not, see <http://www.gnu.org/licenses/>.
 */

package com.goforer.sotong.data.datasource.network.resource

import androidx.annotation.MainThread
import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.goforer.sotong.data.datasource.model.cache.entity.feed.FeedsResponse
import com.goforer.sotong.data.datasource.network.response.ApiResponse
import com.goforer.sotong.data.datasource.network.response.Resource
import com.goforer.sotong.data.repository.BaseRepository.Companion.PER_PAGE
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

/**
 * A generic class that can provide a resource backed by the network.
 * <p>
 * You can read more about it in the <a href="https://developer.android.com/arch">Architecture
 * Guide</a>.
 */
@Suppress("UNCHECKED_CAST")
abstract class NetworkBoundResource<WorkType, ResultType, RequestType>
@MainThread constructor(private val jobType: Int, boundType: Int) {
    companion object {
        internal const val BOUND_BACKEND = 0
        internal const val BOUND_LOCAL = 1

        internal const val JOB_TYPE_ADD_USER = 0
        internal const val JOB_TYPE_LOAD_USER = 1
        internal const val JOB_TYPE_LOAD_FEEDS = 2
        internal const val JOB_TYPE_DELETE_FEED = 3
        internal const val JOB_TYPE_FEED_UPDATE = 4
        internal const val JOB_TYPE_FEED_POSTING = 5

        internal const val FEED_SORT_LATEST = "latest"
        internal const val FEED_SORT_OLDEST = "oldest"
        internal const val FEED_SORT_POPULAR = "popular"
        internal const val NONE_SORT = "none"

        private const val NONE_ITEM_COUNT = 20
    }

    private val result = MediatorLiveData<Resource>()

    private val resource = Resource()

    init {
        resource.loading(null)
        runBlocking {
            when(boundType) {
                BOUND_BACKEND -> {
                    runNetworkJob(MediatorLiveData(), jobType)
                }

                BOUND_LOCAL -> {
                    fetchFromLocal()
                }
            }
        }
    }

    private suspend fun fetchFromLocal() {
        fetchDataFromCache(this)
    }

    private suspend fun runNetworkJob(cacheSource: MediatorLiveData<WorkType>, jobType: Int) {
        handleDataFromNetwork(this, cacheSource, jobType)
    }

    private suspend fun fetchDataFromCache(resource: NetworkBoundResource<WorkType, ResultType, RequestType>) {
        val cacheData = withContext(Dispatchers.IO) {
            resource.loadFromCache(false, NONE_ITEM_COUNT, 0)
        }

        resource.result.addSource(cacheData) {
            resource.result.removeSource(cacheData)
            resource.result.addSource(cacheData) { updatedData
                -> resource.result.postValue(resource.resource.success(updatedData, 0)) }
        }
    }

    private suspend fun handleDataFromNetwork(resource: NetworkBoundResource<WorkType, ResultType, RequestType>,
                                             cacheSource: MediatorLiveData<WorkType>, jobType: Int) {
        val responseData = resource.doNetworkJob()

        // we re-attach cacheSource as a new source, it will dispatch its latest value quickly
        if (jobType != JOB_TYPE_ADD_USER) {
            resource.result.postValue(resource.resource.loading("loading"))
        }

        resource.result.addSource(responseData) { response ->
            resource.result.removeSource(responseData)
            resource.result.removeSource(cacheSource)
            //no inspection ConstantConditions
            response?.let {
                response.body?.let {
                    if (response.isSuccessful) {
                        runBlocking {
                            resource.handleResult(response, jobType)
                        }
                    } else {
                        failed(resource, response)
                    }
                } ?: {
                    failed(resource, response)
                } ()
            }

            response ?: failed(resource, response)
        }
    }

    @WorkerThread
    private suspend fun handleResult(response: ApiResponse<RequestType>, jobType: Int) {
        handleResultAndReInit(this, response, result, jobType)
    }

    private fun failed(resource: NetworkBoundResource<WorkType, ResultType, RequestType>,
                       response: ApiResponse<RequestType>) {
        resource.result.postValue(resource.resource.error(response.errorMessage, response.code))
        resource.onNetworkError(response.errorMessage, response.code)
    }

    protected abstract fun onNetworkError(errorMessage: String?, errorCode: Int)

    protected abstract fun onFetchFailed(failedMessage: String?)

    fun getAsLiveData(): MediatorLiveData<Resource> {
        return result
    }

    @WorkerThread
    protected abstract suspend fun workToCache(item: WorkType)

    @WorkerThread
    protected abstract suspend fun loadFromCache(isLatest: Boolean, itemCount: Int, pages: Int): LiveData<ResultType>

    @WorkerThread
    protected abstract suspend fun doNetworkJob(): LiveData<ApiResponse<RequestType>>

    @WorkerThread
    protected abstract suspend fun clearCache()

    private suspend fun handleResultAndReInit(resource: NetworkBoundResource<WorkType, ResultType, RequestType>,
                                            response: ApiResponse<RequestType>, result: MediatorLiveData<Resource>, jobType: Int) {
        var pages = 0

        val cacheData = withContext(Dispatchers.IO) {
            when (jobType) {
                JOB_TYPE_LOAD_FEEDS -> {
                    response.body ?: resource.onFetchFailed("There is no the feed data.")
                    response.body?.let {
                        pages = (response.body as FeedsResponse).pages
                        resource.workToCache((response.body as FeedsResponse).results as WorkType)
                    }
                }

                else -> {
                    response.body ?: resource.onFetchFailed("There is no the body data.")
                    response.body?.let {
                        pages = -1
                        resource.workToCache(response.body as WorkType)
                    }
                }
            }

            response.body?.let {
                resource.loadFromCache(false, PER_PAGE, pages)
            }
        }

        // Make sure the NetworkResource is not null before doing anything on it because the destroyed
        // NetworkResource could be null.
        // we specially request a new live data,
        // otherwise we will get immediately last cached value,
        // which may not be updated with latest results received from network.
        cacheData?.let {
            result.addSource<ResultType>(it) { newData ->
                result.postValue(resource.resource.success(newData, 0))
            }
        }
    }
}