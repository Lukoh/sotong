package com.megazone.megatong.data.datasource.model.cache;

import java.lang.System;

/**
 * Main cache description.
 */
@androidx.room.Database(entities = {com.megazone.megatong.data.datasource.model.cache.entity.user.User.class, com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/megazone/megatong/data/datasource/model/cache/Cache;", "Landroidx/room/RoomDatabase;", "()V", "feedDao", "Lcom/megazone/megatong/data/datasource/model/dao/remote/feed/FeedDao;", "userDao", "Lcom/megazone/megatong/data/datasource/model/dao/remote/profile/UserDao;", "app_debug"})
public abstract class Cache extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.megazone.megatong.data.datasource.model.dao.remote.profile.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.megazone.megatong.data.datasource.model.dao.remote.feed.FeedDao feedDao();
    
    public Cache() {
        super();
    }
}