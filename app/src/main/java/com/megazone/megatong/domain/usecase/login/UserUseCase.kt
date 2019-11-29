package com.megazone.megatong.domain.usecase.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.switchMap
import com.megazone.megatong.data.datasource.model.cache.entity.Query
import com.megazone.megatong.data.datasource.model.cache.entity.user.User
import com.megazone.megatong.data.datasource.network.response.Resource
import com.megazone.megatong.data.repository.remote.login.UserRepository
import com.megazone.megatong.domain.usecase.BaseUseCase
import com.megazone.megatong.domain.usecase.Parameters
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserUseCase
@Inject
constructor(private val repository: UserRepository): BaseUseCase<Parameters, Resource>() {
    private val liveData by lazy { MutableLiveData<Query>() }

    override fun execute(viewModelScope: CoroutineScope, parameters: Parameters): LiveData<Resource> {
        setQuery(parameters)

        return liveData.switchMap {
            liveData {
                emitSource((repository).work(this@UserUseCase.liveData))
            }
        }
    }

    private fun setQuery(parameters: Parameters) {
        liveData.value = parameters.query

        val input = parameters.query.secondParam
        if (input == liveData.value?.secondParam) return

        liveData.value = parameters.query
    }

    internal fun loadUser(): LiveData<User> = repository.loadUserInfo()
}