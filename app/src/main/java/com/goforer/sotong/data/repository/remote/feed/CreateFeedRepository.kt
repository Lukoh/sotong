package com.goforer.sotong.data.repository.remote.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.goforer.sotong.data.datasource.model.cache.entity.Query
import com.goforer.sotong.data.datasource.model.cache.entity.feed.Feed
import com.goforer.sotong.data.datasource.model.dao.remote.feed.FeedDao
import com.goforer.sotong.data.datasource.network.resource.NetworkBoundResource
import com.goforer.sotong.data.datasource.network.response.Resource
import com.goforer.sotong.data.repository.BaseRepository
import okhttp3.MultipartBody
import okhttp3.RequestBody
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CreateFeedRepository
@Inject
constructor(private val dao: FeedDao): BaseRepository<Query>() {
    override suspend fun work(liveData: MutableLiveData<Query>): LiveData<Resource> {
        return object: NetworkBoundResource<Feed, Feed, Feed>(liveData.value?.jobType!!, liveData.value?.boundType!!) {
            override suspend fun workToCache(item: Feed) = dao.insert(item)

            override suspend fun loadFromCache(isLatest: Boolean, itemCount: Int, pages: Int) = dao.getLatestFeed()

            @Suppress("UNCHECKED_CAST")
            override suspend fun doNetworkJob() = serviceAPI.sendFeed(liveData.value?.firstParam as MutableMap<String, @kotlin.jvm.JvmSuppressWildcards RequestBody>,
                                                                      liveData.value?.secondParam as ArrayList<MultipartBody.Part>)

            override fun onNetworkError(errorMessage: String?, errorCode: Int) = Timber.e("Network-Error: $errorMessage")

            override fun onFetchFailed(failedMessage: String?) = Timber.e("Fetch-Failed: $failedMessage")

            override suspend fun clearCache() = dao.clearAll()
        }.getAsLiveData()
    }
}