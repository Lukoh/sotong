package com.goforer.sotong.data.repository.paging.callback

import androidx.lifecycle.MutableLiveData
import androidx.paging.PagedList
import com.goforer.sotong.data.datasource.model.cache.entity.Query
import com.goforer.sotong.data.datasource.network.resource.NetworkBoundResource.Companion.BOUND_BACKEND
import com.goforer.sotong.data.datasource.network.resource.NetworkBoundResource.Companion.JOB_TYPE_LOAD_FEEDS
import com.goforer.sotong.presentation.ui.home.feed.fragment.HomeFeedFragment

class FeedPagedListBoundaryCallback<T>(private val liveData: MutableLiveData<Query>): PagedList.BoundaryCallback<T>() {
    private val query by lazy { Query() }

    companion object {
        private var requestPage = 0
    }

    override fun onZeroItemsLoaded() {
        requestPage = 1
        setQuery(query)
    }

    override fun onItemAtEndLoaded(itemAtEnd: T) {
        if ((liveData.value?.secondParam!! as Int) > requestPage) {
            requestPage++
            setQuery(query)
        }
    }

    private fun setQuery(query: Query) {
        query.firstParam = HomeFeedFragment.FEED_KEYWORD_ALL
        query.secondParam = requestPage
        query.jobType = JOB_TYPE_LOAD_FEEDS
        query.boundType = BOUND_BACKEND

        liveData.value = query

        val input = query.secondParam
        if (input == liveData.value?.secondParam) {
            return
        }

        liveData.value = query
    }
}