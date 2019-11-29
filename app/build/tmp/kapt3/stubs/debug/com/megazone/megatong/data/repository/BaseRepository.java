package com.megazone.megatong.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/megazone/megatong/data/repository/BaseRepository;", "T", "", "()V", "serviceAPI", "Lcom/megazone/megatong/data/datasource/network/rest/ServiceAPI;", "getServiceAPI", "()Lcom/megazone/megatong/data/datasource/network/rest/ServiceAPI;", "setServiceAPI", "(Lcom/megazone/megatong/data/datasource/network/rest/ServiceAPI;)V", "work", "Landroidx/lifecycle/LiveData;", "Lcom/megazone/megatong/data/datasource/network/response/Resource;", "liveData", "Landroidx/lifecycle/MutableLiveData;", "(Landroidx/lifecycle/MutableLiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
@javax.inject.Singleton()
public abstract class BaseRepository<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.megazone.megatong.data.datasource.network.rest.ServiceAPI serviceAPI;
    public static final int PER_PAGE = 20;
    public static final int INDEX = 1;
    public static final com.megazone.megatong.data.repository.BaseRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.megazone.megatong.data.datasource.network.rest.ServiceAPI getServiceAPI() {
        return null;
    }
    
    public final void setServiceAPI(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.data.datasource.network.rest.ServiceAPI p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object work(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<T> liveData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.Resource>> p1);
    
    public BaseRepository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/megazone/megatong/data/repository/BaseRepository$Companion;", "", "()V", "INDEX", "", "PER_PAGE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}