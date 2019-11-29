package com.megazone.megatong.data.datasource.network.resource;

import java.lang.System;

/**
 * A generic class that can provide a resource backed by the network.
 * <p>
 * You can read more about it in the <a href="https://developer.android.com/arch">Architecture
 * Guide</a>.
 */
@kotlin.Suppress(names = {"UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000 1*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004:\u00011B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\r\u001a\u00020\u000eH\u00a5@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00120\u0011H\u00a5@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ0\u0010\u0013\u001a\u00020\u000e2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0012H\u0002J+\u0010\u0015\u001a\u00020\u000e2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\fJA\u0010\u0019\u001a\u00020\u000e2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\'\u0010\u001c\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJO\u0010\u001e\u001a\u00020\u000e2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ/\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u00a5@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0012\u0010&\u001a\u00020\u000e2\b\u0010\'\u001a\u0004\u0018\u00010(H$J\u001a\u0010)\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020\u0006H$J\'\u0010,\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u0019\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00028\u0000H\u00a5@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00062"}, d2 = {"Lcom/megazone/megatong/data/datasource/network/resource/NetworkBoundResource;", "WorkType", "ResultType", "RequestType", "", "jobType", "", "boundType", "(II)V", "resource", "Lcom/megazone/megatong/data/datasource/network/response/Resource;", "result", "Landroidx/lifecycle/MediatorLiveData;", "clearCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doNetworkJob", "Landroidx/lifecycle/LiveData;", "Lcom/megazone/megatong/data/datasource/network/response/ApiResponse;", "failed", "response", "fetchDataFromCache", "(Lcom/megazone/megatong/data/datasource/network/resource/NetworkBoundResource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFromLocal", "getAsLiveData", "handleDataFromNetwork", "cacheSource", "(Lcom/megazone/megatong/data/datasource/network/resource/NetworkBoundResource;Landroidx/lifecycle/MediatorLiveData;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleResult", "(Lcom/megazone/megatong/data/datasource/network/response/ApiResponse;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleResultAndReInit", "(Lcom/megazone/megatong/data/datasource/network/resource/NetworkBoundResource;Lcom/megazone/megatong/data/datasource/network/response/ApiResponse;Landroidx/lifecycle/MediatorLiveData;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromCache", "isLatest", "", "itemCount", "pages", "(ZIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFetchFailed", "failedMessage", "", "onNetworkError", "errorMessage", "errorCode", "runNetworkJob", "(Landroidx/lifecycle/MediatorLiveData;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "workToCache", "item", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract class NetworkBoundResource<WorkType extends java.lang.Object, ResultType extends java.lang.Object, RequestType extends java.lang.Object> {
    private final androidx.lifecycle.MediatorLiveData<com.megazone.megatong.data.datasource.network.response.Resource> result = null;
    private final com.megazone.megatong.data.datasource.network.response.Resource resource = null;
    private final int jobType = 0;
    public static final int BOUND_BACKEND = 0;
    public static final int BOUND_LOCAL = 1;
    public static final int JOB_TYPE_ADD_USER = 0;
    public static final int JOB_TYPE_LOAD_USER = 1;
    public static final int JOB_TYPE_LOAD_FEEDS = 2;
    public static final int JOB_TYPE_DELETE_FEED = 3;
    public static final int JOB_TYPE_FEED_UPDATE = 4;
    public static final int JOB_TYPE_FEED_POSTING = 5;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEED_SORT_LATEST = "latest";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEED_SORT_OLDEST = "oldest";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEED_SORT_POPULAR = "popular";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NONE_SORT = "none";
    private static final int NONE_ITEM_COUNT = 20;
    public static final com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource.Companion Companion = null;
    
    private final void failed(com.megazone.megatong.data.datasource.network.resource.NetworkBoundResource<WorkType, ResultType, RequestType> resource, com.megazone.megatong.data.datasource.network.response.ApiResponse<RequestType> response) {
    }
    
    protected abstract void onNetworkError(@org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage, int errorCode);
    
    protected abstract void onFetchFailed(@org.jetbrains.annotations.Nullable()
    java.lang.String failedMessage);
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.megazone.megatong.data.datasource.network.response.Resource> getAsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    protected abstract java.lang.Object workToCache(WorkType item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    protected abstract java.lang.Object loadFromCache(boolean isLatest, int itemCount, int pages, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<ResultType>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    protected abstract java.lang.Object doNetworkJob(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.ApiResponse<RequestType>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    protected abstract java.lang.Object clearCache(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @androidx.annotation.MainThread()
    public NetworkBoundResource(int jobType, int boundType) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/megazone/megatong/data/datasource/network/resource/NetworkBoundResource$Companion;", "", "()V", "BOUND_BACKEND", "", "BOUND_LOCAL", "FEED_SORT_LATEST", "", "FEED_SORT_OLDEST", "FEED_SORT_POPULAR", "JOB_TYPE_ADD_USER", "JOB_TYPE_DELETE_FEED", "JOB_TYPE_FEED_POSTING", "JOB_TYPE_FEED_UPDATE", "JOB_TYPE_LOAD_FEEDS", "JOB_TYPE_LOAD_USER", "NONE_ITEM_COUNT", "NONE_SORT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}