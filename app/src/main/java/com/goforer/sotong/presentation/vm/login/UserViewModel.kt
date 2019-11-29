package com.goforer.sotong.presentation.vm.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.goforer.sotong.data.datasource.network.response.Resource
import com.goforer.sotong.domain.usecase.Parameters
import com.goforer.sotong.domain.usecase.login.UserUseCase
import com.goforer.sotong.presentation.vm.BaseViewModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserViewModel
@Inject
constructor(private val useCase: UserUseCase): BaseViewModel<Parameters, Int>() {
    internal lateinit var user: LiveData<Resource>

    override fun setParam(params: Parameters) {
        user = useCase.execute(viewModelScope, params)
    }

    internal fun loadUser() = liveData { emitSource(useCase.loadUser()) }
}