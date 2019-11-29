package com.megazone.megatong.data.repository.remote.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.megazone.megatong.data.datasource.model.cache.entity.Query
import com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed
import com.megazone.megatong.data.datasource.model.cache.entity.feed.FeedsResponse
import com.megazone.megatong.data.datasource.model.dao.remote.feed.FeedDao
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource
import com.megazone.megatong.data.datasource.network.response.Resource
import com.megazone.megatong.data.repository.BaseRepository
import com.megazone.megatong.data.repository.paging.callback.FeedPagedListBoundaryCallback
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoadFeedRepository
@Inject
constructor(private val dao: FeedDao): BaseRepository<Query>() {
    override suspend fun work(liveData: MutableLiveData<Query>): LiveData<Resource> {
        return object: NetworkBoundResource<MutableList<Feed>, PagedList<Feed>, FeedsResponse>(liveData.value?.jobType!!, liveData.value?.boundType!!) {
            override suspend fun workToCache(item: MutableList<Feed>) = dao.insert(item)

            override suspend fun loadFromCache(isLatest: Boolean, itemCount: Int, pages: Int): LiveData<PagedList<Feed>> {
                val config = PagedList.Config.Builder()
                    .setInitialLoadSizeHint(20)
                    .setPageSize(itemCount)
                    .setPrefetchDistance(10)
                    .setEnablePlaceholders(true)
                    .build()

                return withContext(Dispatchers.IO) {
                    LivePagedListBuilder(dao.getFeeds(), /* PageList Config */ config)
                        .setBoundaryCallback(FeedPagedListBoundaryCallback<Feed>(liveData)).build()
                }
            }

            override suspend fun doNetworkJob() = serviceAPI.getFeeds(liveData.value?.firstParam as String, liveData.value?.secondParam as Int, PER_PAGE, liveData.value?.sortType!!)

            override fun onNetworkError(errorMessage: String?, errorCode: Int) = Timber.e("Network-Error: $errorMessage")

            override fun onFetchFailed(failedMessage: String?) = Timber.e("Fetch-Failed: $failedMessage")

            override suspend fun clearCache() = dao.clearAll()
        }.getAsLiveData()
    }
}