package com.megazone.megatong.data.repository.remote.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000\u00a2\u0006\u0002\b\tJ%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/megazone/megatong/data/repository/remote/login/UserRepository;", "Lcom/megazone/megatong/data/repository/BaseRepository;", "Lcom/megazone/megatong/data/datasource/model/cache/entity/Query;", "dao", "Lcom/megazone/megatong/data/datasource/model/dao/remote/profile/UserDao;", "(Lcom/megazone/megatong/data/datasource/model/dao/remote/profile/UserDao;)V", "loadUserInfo", "Landroidx/lifecycle/LiveData;", "Lcom/megazone/megatong/data/datasource/model/cache/entity/user/User;", "loadUserInfo$app_debug", "work", "Lcom/megazone/megatong/data/datasource/network/response/Resource;", "liveData", "Landroidx/lifecycle/MutableLiveData;", "(Landroidx/lifecycle/MutableLiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class UserRepository extends com.megazone.megatong.data.repository.BaseRepository<com.megazone.megatong.data.datasource.model.cache.entity.Query> {
    private final com.megazone.megatong.data.datasource.model.dao.remote.profile.UserDao dao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object work(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.megazone.megatong.data.datasource.model.cache.entity.Query> liveData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.Resource>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.model.cache.entity.user.User> loadUserInfo$app_debug() {
        return null;
    }
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.data.datasource.model.dao.remote.profile.UserDao dao) {
        super();
    }
}