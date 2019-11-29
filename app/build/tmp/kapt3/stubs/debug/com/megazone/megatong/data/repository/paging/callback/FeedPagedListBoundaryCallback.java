package com.megazone.megatong.data.repository.paging.callback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0012B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/megazone/megatong/data/repository/paging/callback/FeedPagedListBoundaryCallback;", "T", "Landroidx/paging/PagedList$BoundaryCallback;", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/megazone/megatong/data/datasource/model/cache/entity/Query;", "(Landroidx/lifecycle/MutableLiveData;)V", "query", "getQuery", "()Lcom/megazone/megatong/data/datasource/model/cache/entity/Query;", "query$delegate", "Lkotlin/Lazy;", "onItemAtEndLoaded", "", "itemAtEnd", "(Ljava/lang/Object;)V", "onZeroItemsLoaded", "setQuery", "Companion", "app_debug"})
public final class FeedPagedListBoundaryCallback<T extends java.lang.Object> extends androidx.paging.PagedList.BoundaryCallback<T> {
    private final kotlin.Lazy query$delegate = null;
    private final androidx.lifecycle.MutableLiveData<com.megazone.megatong.data.datasource.model.cache.entity.Query> liveData = null;
    private static int requestPage;
    public static final com.megazone.megatong.data.repository.paging.callback.FeedPagedListBoundaryCallback.Companion Companion = null;
    
    private final com.megazone.megatong.data.datasource.model.cache.entity.Query getQuery() {
        return null;
    }
    
    @java.lang.Override()
    public void onZeroItemsLoaded() {
    }
    
    @java.lang.Override()
    public void onItemAtEndLoaded(T itemAtEnd) {
    }
    
    private final void setQuery(com.megazone.megatong.data.datasource.model.cache.entity.Query query) {
    }
    
    public FeedPagedListBoundaryCallback(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.megazone.megatong.data.datasource.model.cache.entity.Query> liveData) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/megazone/megatong/data/repository/paging/callback/FeedPagedListBoundaryCallback$Companion;", "", "()V", "requestPage", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}