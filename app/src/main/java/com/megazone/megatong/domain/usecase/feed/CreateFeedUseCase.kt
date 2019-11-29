package com.megazone.megatong.domain.usecase.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.switchMap
import com.megazone.megatong.data.datasource.model.cache.entity.Query
import com.megazone.megatong.data.datasource.network.response.Resource
import com.megazone.megatong.data.repository.remote.feed.CreateFeedRepository
import com.megazone.megatong.domain.usecase.BaseUseCase
import com.megazone.megatong.domain.usecase.Parameters
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CreateFeedUseCase
@Inject
constructor(private val postingFeedRepository: CreateFeedRepository): BaseUseCase<Parameters, Resource>() {
    private val liveData by lazy { MutableLiveData<Query>() }

    override fun execute(viewModelScope: CoroutineScope, parameters: Parameters): LiveData<Resource> {
        viewModelScope.launch {
            setQuery(parameters)
        }

        return liveData.switchMap {
            liveData(context = viewModelScope.coroutineContext + Dispatchers.IO) {
                emitSource(postingFeedRepository.work(this@CreateFeedUseCase.liveData))
            }
        }
    }

    private fun setQuery(parameters: Parameters) {
        liveData.value = parameters.query

        val input = parameters.query.secondParam
        if (input == liveData.value?.secondParam) return

        liveData.value = parameters.query
    }
}