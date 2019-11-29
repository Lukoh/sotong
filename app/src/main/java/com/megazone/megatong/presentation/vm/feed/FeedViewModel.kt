package com.megazone.megatong.presentation.vm.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource.Companion.JOB_TYPE_DELETE_FEED
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource.Companion.JOB_TYPE_FEED_POSTING
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource.Companion.JOB_TYPE_FEED_UPDATE
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource.Companion.JOB_TYPE_LOAD_FEEDS
import com.megazone.megatong.domain.usecase.Parameters
import com.megazone.megatong.domain.usecase.feed.LoadFeedUseCase
import com.megazone.megatong.presentation.vm.BaseViewModel
import com.megazone.megatong.data.datasource.network.response.Resource
import com.megazone.megatong.domain.usecase.feed.CreateFeedUseCase
import com.megazone.megatong.domain.usecase.feed.DeleteFeedUseCase
import com.megazone.megatong.domain.usecase.feed.UpdateFeedUseCase
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FeedViewModel
@Inject
constructor(private val loadUseCase: LoadFeedUseCase, private val createUseCase: CreateFeedUseCase,
            private val updateFeedUseCase: UpdateFeedUseCase, private val deleteFeedUseCase: DeleteFeedUseCase): BaseViewModel<Parameters, Int>() {
    internal lateinit var feed: LiveData<Resource>

    override fun setParam(params: Parameters) {
        feed = when (params.query.jobType) {
            JOB_TYPE_LOAD_FEEDS -> loadUseCase.execute(viewModelScope, params)
            JOB_TYPE_FEED_POSTING -> createUseCase.execute(viewModelScope, params)
            JOB_TYPE_FEED_UPDATE -> updateFeedUseCase.execute(viewModelScope, params)
            JOB_TYPE_DELETE_FEED ->  deleteFeedUseCase.execute(viewModelScope, params)
            else -> loadUseCase.execute(viewModelScope, params)
        }

    }

    internal fun getFeed(feedId: String) = liveData {
        emitSource(updateFeedUseCase.getFeed(feedId)) }

    internal fun removeAll() {
        viewModelScope.launch { deleteFeedUseCase.removeAll() }
        viewModelScope.coroutineContext.cancelChildren()
    }
}