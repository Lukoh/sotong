package com.goforer.sotong.domain.usecase.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.switchMap
import com.goforer.sotong.data.datasource.model.cache.entity.Query
import com.goforer.sotong.data.datasource.network.response.Resource
import com.goforer.sotong.data.repository.remote.feed.DeleteFeedRepository
import com.goforer.sotong.domain.usecase.BaseUseCase
import com.goforer.sotong.domain.usecase.Parameters
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DeleteFeedUseCase
@Inject
constructor(private val deleteFeedRepository: DeleteFeedRepository): BaseUseCase<Parameters, Resource>() {
    private val liveData by lazy { MutableLiveData<Query>() }

    override fun execute(viewModelScope: CoroutineScope, parameters: Parameters): LiveData<Resource> {
        setQuery(parameters)

        return liveData.switchMap {
            liveData {
                emitSource(deleteFeedRepository.work(this@DeleteFeedUseCase.liveData))
            }
        }
    }

    private fun setQuery(parameters: Parameters) {
        liveData.value = parameters.query

        val input = parameters.query.secondParam
        if (input == liveData.value?.secondParam) return

        liveData.value = parameters.query
    }

    internal suspend fun removeAll() = deleteFeedRepository.removeAll()
}