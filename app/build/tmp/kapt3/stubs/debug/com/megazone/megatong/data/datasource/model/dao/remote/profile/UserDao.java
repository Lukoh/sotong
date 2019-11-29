package com.megazone.megatong.data.datasource.model.dao.remote.profile;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0003\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\'J\u0011\u0010\u000b\u001a\u00020\u0002H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/megazone/megatong/data/datasource/model/dao/remote/profile/UserDao;", "Lcom/megazone/megatong/data/datasource/model/dao/BaseDao;", "Lcom/megazone/megatong/data/datasource/model/cache/entity/user/User;", "clearAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteByUserId", "userId", "", "getUser", "Landroidx/lifecycle/LiveData;", "loadUser", "app_debug"})
public abstract interface UserDao extends com.megazone.megatong.data.datasource.model.dao.BaseDao<com.megazone.megatong.data.datasource.model.cache.entity.user.User> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM User")
    public abstract androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.model.cache.entity.user.User> getUser();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM User")
    public abstract java.lang.Object clearAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @androidx.room.Query(value = "DELETE FROM User WHERE id = :userId")
    public abstract void deleteByUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM User")
    public abstract java.lang.Object loadUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.megazone.megatong.data.datasource.model.cache.entity.user.User> p0);
}