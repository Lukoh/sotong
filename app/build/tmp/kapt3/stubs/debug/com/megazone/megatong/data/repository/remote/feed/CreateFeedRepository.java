package com.megazone.megatong.data.repository.remote.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/megazone/megatong/data/repository/remote/feed/CreateFeedRepository;", "Lcom/megazone/megatong/data/repository/BaseRepository;", "Lcom/megazone/megatong/data/datasource/model/cache/entity/Query;", "dao", "Lcom/megazone/megatong/data/datasource/model/dao/remote/feed/FeedDao;", "(Lcom/megazone/megatong/data/datasource/model/dao/remote/feed/FeedDao;)V", "work", "Landroidx/lifecycle/LiveData;", "Lcom/megazone/megatong/data/datasource/network/response/Resource;", "liveData", "Landroidx/lifecycle/MutableLiveData;", "(Landroidx/lifecycle/MutableLiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class CreateFeedRepository extends com.megazone.megatong.data.repository.BaseRepository<com.megazone.megatong.data.datasource.model.cache.entity.Query> {
    private final com.megazone.megatong.data.datasource.model.dao.remote.feed.FeedDao dao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object work(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.megazone.megatong.data.datasource.model.cache.entity.Query> liveData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.Resource>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public CreateFeedRepository(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.data.datasource.model.dao.remote.feed.FeedDao dao) {
        super();
    }
}