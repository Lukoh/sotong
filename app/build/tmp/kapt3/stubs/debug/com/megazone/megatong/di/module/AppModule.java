package com.megazone.megatong.di.module;

import java.lang.System;

/**
 * A module for Android-specific dependencies which require a [Context] or
 * [android.app.Application] to create.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\rH\u0001\u00a2\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/megazone/megatong/di/module/AppModule;", "", "()V", "provideCache", "Lcom/megazone/megatong/data/datasource/model/cache/Cache;", "app", "Landroid/app/Application;", "provideCache$app_debug", "provideFeedDao", "Lcom/megazone/megatong/data/datasource/model/dao/remote/feed/FeedDao;", "cache", "provideFeedDao$app_debug", "provideServiceAPI", "Lcom/megazone/megatong/data/datasource/network/rest/ServiceAPI;", "provideServiceAPI$app_debug", "provideUserDao", "Lcom/megazone/megatong/data/datasource/model/dao/remote/profile/UserDao;", "provideUserDao$app_debug", "Companion", "app_debug"})
@dagger.Module()
public final class AppModule {
    private static final long READ_TIME_OUT = 5L;
    private static final long WRITE_TIME_OUT = 5L;
    private static final long CONNECT_TIME_OUT = 5L;
    private static final java.lang.String BASE_URL = "https://api.megattong.com/";
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String rawResponseBody;
    public static final com.megazone.megatong.di.module.AppModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.megazone.megatong.data.datasource.network.rest.ServiceAPI provideServiceAPI$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.megazone.megatong.data.datasource.model.cache.Cache provideCache$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.megazone.megatong.data.datasource.model.dao.remote.profile.UserDao provideUserDao$app_debug(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.data.datasource.model.cache.Cache cache) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.megazone.megatong.data.datasource.model.dao.remote.feed.FeedDao provideFeedDao$app_debug(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.data.datasource.model.cache.Cache cache) {
        return null;
    }
    
    public AppModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/megazone/megatong/di/module/AppModule$Companion;", "", "()V", "BASE_URL", "", "CONNECT_TIME_OUT", "", "READ_TIME_OUT", "WRITE_TIME_OUT", "<set-?>", "rawResponseBody", "getRawResponseBody", "()Ljava/lang/String;", "setRawResponseBody", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRawResponseBody() {
            return null;
        }
        
        private final void setRawResponseBody(java.lang.String p0) {
        }
        
        private Companion() {
            super();
        }
    }
}