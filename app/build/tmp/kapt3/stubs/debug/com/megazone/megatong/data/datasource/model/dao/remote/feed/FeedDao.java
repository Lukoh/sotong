package com.megazone.megatong.data.datasource.model.dao.remote.feed;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0003\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\'J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\rH\'J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\rH\'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\'J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/megazone/megatong/data/datasource/model/dao/remote/feed/FeedDao;", "Lcom/megazone/megatong/data/datasource/model/dao/BaseDao;", "Lcom/megazone/megatong/data/datasource/model/cache/entity/feed/Feed;", "clearAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteByFeedId", "feedId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeed", "Landroidx/lifecycle/LiveData;", "getFeeds", "Landroidx/paging/DataSource$Factory;", "", "getFeedsOrderByLikes", "getLatestFeed", "getLatestUpdatedFeed", "app_debug"})
public abstract interface FeedDao extends com.megazone.megatong.data.datasource.model.dao.BaseDao<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Feeds")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> getFeeds();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Feeds ORDER BY createdAt DESC LIMIT 1")
    public abstract androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> getLatestFeed();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Feeds ORDER BY updatedAt  DESC LIMIT 1")
    public abstract androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> getLatestUpdatedFeed();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Feeds ORDER BY likes ASC")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> getFeedsOrderByLikes();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Feeds WHERE id = :feedId")
    public abstract androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> getFeed(@org.jetbrains.annotations.NotNull()
    java.lang.String feedId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM Feeds WHERE id = :feedId")
    public abstract java.lang.Object deleteByFeedId(@org.jetbrains.annotations.NotNull()
    java.lang.String feedId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM Feeds")
    public abstract java.lang.Object clearAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
}