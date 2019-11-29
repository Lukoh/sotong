package com.megazone.megatong.data.datasource.network.rest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J<\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\u0007H\'JI\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0019\b\u0001\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0012\u00a2\u0006\u0002\b\u00130\u00112\u0018\b\u0001\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017H\'J\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\'J4\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0011H\'\u00a8\u0006\u001c"}, d2 = {"Lcom/megazone/megatong/data/datasource/network/rest/ServiceAPI;", "", "deleteFeed", "Landroidx/lifecycle/LiveData;", "Lcom/megazone/megatong/data/datasource/network/response/ApiResponse;", "Lcom/megazone/megatong/data/datasource/model/cache/entity/feed/Feed;", "id", "", "doLike", "getFeeds", "Lcom/megazone/megatong/data/datasource/model/cache/entity/feed/FeedsResponse;", "page", "", "perPage", "orderBy", "sendFeed", "info", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "photos", "Ljava/util/ArrayList;", "Lokhttp3/MultipartBody$Part;", "Lkotlin/collections/ArrayList;", "sendUserInfo", "Lcom/megazone/megatong/data/datasource/model/cache/entity/user/User;", "user", "updateFeed", "app_debug"})
public abstract interface ServiceAPI {
    
    /**
     * @POST declares an HTTP POST request
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "v1/me")
    public abstract androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.ApiResponse<com.megazone.megatong.data.datasource.model.cache.entity.user.User>> sendUserInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.megazone.megatong.data.datasource.model.cache.entity.user.User user);
    
    /**
     * @GET declares an HTTP GET request
     * @Query("") annotation on the parameters marks it as a
     * replacement for the placeholder in the @GET query
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "v1/feeds")
    public abstract androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.ApiResponse<com.megazone.megatong.data.datasource.model.cache.entity.feed.FeedsResponse>> getFeeds(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "id")
    java.lang.String id, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "per_page")
    int perPage, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "order_by")
    java.lang.String orderBy);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "v1/feed/{id}/like")
    public abstract androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.ApiResponse<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed>> doLike(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "v1/feed")
    @retrofit2.http.Multipart()
    public abstract androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.ApiResponse<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed>> sendFeed(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> info, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    java.util.ArrayList<okhttp3.MultipartBody.Part> photos);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "v1/feed/{id}")
    @retrofit2.http.Multipart()
    public abstract androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.ApiResponse<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed>> updateFeed(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FieldMap()
    java.util.Map<java.lang.String, java.lang.String> info);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "v1/feed/{id}")
    public abstract androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.ApiResponse<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed>> deleteFeed(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id);
}