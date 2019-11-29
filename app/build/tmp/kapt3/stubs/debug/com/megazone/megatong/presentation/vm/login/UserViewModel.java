package com.megazone.megatong.presentation.vm.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0000\u00a2\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/megazone/megatong/presentation/vm/login/UserViewModel;", "Lcom/megazone/megatong/presentation/vm/BaseViewModel;", "Lcom/megazone/megatong/domain/usecase/Parameters;", "", "useCase", "Lcom/megazone/megatong/domain/usecase/login/UserUseCase;", "(Lcom/megazone/megatong/domain/usecase/login/UserUseCase;)V", "user", "Landroidx/lifecycle/LiveData;", "Lcom/megazone/megatong/data/datasource/network/response/Resource;", "getUser$app_debug", "()Landroidx/lifecycle/LiveData;", "setUser$app_debug", "(Landroidx/lifecycle/LiveData;)V", "loadUser", "Lcom/megazone/megatong/data/datasource/model/cache/entity/user/User;", "loadUser$app_debug", "setParam", "", "params", "app_debug"})
@javax.inject.Singleton()
public final class UserViewModel extends com.megazone.megatong.presentation.vm.BaseViewModel<com.megazone.megatong.domain.usecase.Parameters, java.lang.Integer> {
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.Resource> user;
    private final com.megazone.megatong.domain.usecase.login.UserUseCase useCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.Resource> getUser$app_debug() {
        return null;
    }
    
    public final void setUser$app_debug(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.Resource> p0) {
    }
    
    @java.lang.Override()
    public void setParam(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.domain.usecase.Parameters params) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.model.cache.entity.user.User> loadUser$app_debug() {
        return null;
    }
    
    @javax.inject.Inject()
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.domain.usecase.login.UserUseCase useCase) {
        super();
    }
}