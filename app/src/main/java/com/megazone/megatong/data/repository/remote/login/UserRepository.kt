package com.megazone.megatong.data.repository.remote.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.megazone.megatong.data.datasource.model.cache.entity.Query
import com.megazone.megatong.data.datasource.model.cache.entity.user.User
import com.megazone.megatong.data.datasource.model.dao.remote.profile.UserDao
import com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource
import com.megazone.megatong.data.datasource.network.response.Resource
import com.megazone.megatong.data.repository.BaseRepository
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository
@Inject
constructor(private val dao: UserDao): BaseRepository<Query>() {
    override suspend fun work(liveData: MutableLiveData<Query>): LiveData<Resource> {
        return object: NetworkBoundResource<User, User, User>(liveData.value?.jobType!!, liveData.value?.boundType!!) {
            override suspend fun workToCache(item: User) = dao.insert(item)

            override suspend fun loadFromCache(isLatest: Boolean, itemCount: Int, pages: Int) = dao.getUser()

            override suspend fun doNetworkJob() = serviceAPI.sendUserInfo(liveData.value?.firstParam!! as User)

            override fun onNetworkError(errorMessage: String?, errorCode: Int) = Timber.e("Network-Error: $errorMessage")

            override fun onFetchFailed(failedMessage: String?) = Timber.e("Fetch-Failed: $failedMessage")

            override suspend fun clearCache() = dao.clearAll()
        }.getAsLiveData()
    }

    internal fun loadUserInfo() = dao.getUser()
}