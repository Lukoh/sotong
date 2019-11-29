package com.megazone.megatong.data.datasource.network.rest

import androidx.lifecycle.LiveData
import com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed
import com.megazone.megatong.data.datasource.model.cache.entity.feed.FeedsResponse
import com.megazone.megatong.data.datasource.model.cache.entity.user.User
import com.megazone.megatong.data.datasource.network.response.ApiResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.*

interface ServiceAPI {
    /**
     * @POST declares an HTTP POST request
     */
    @POST("v1/me")
    fun sendUserInfo(@Body user: User): LiveData<ApiResponse<User>>

    /**
     * @GET declares an HTTP GET request
     * @Query("") annotation on the parameters marks it as a
     * replacement for the placeholder in the @GET query
     */
    @GET("v1/feeds")
    fun getFeeds(@Query("id") id: String,
                 @Query("page") page: Int,
                 @Query("per_page") perPage: Int,
                 @Query("order_by") orderBy: String
    ): LiveData<ApiResponse<FeedsResponse>>

    @POST("v1/feed/{id}/like")
    fun doLike(@Path("id") id: String): LiveData<ApiResponse<Feed>>

    @Multipart
    @POST("v1/feed")
    fun sendFeed(@PartMap info: MutableMap<String, @JvmSuppressWildcards RequestBody>,
                 @Part photos: ArrayList<MultipartBody.Part>): LiveData<ApiResponse<Feed>>


    @Multipart
    @PUT("v1/feed/{id}")
    fun updateFeed(@Path("id") id: String,
                   @FieldMap info: MutableMap<String, String>): LiveData<ApiResponse<Feed>>

    @DELETE("v1/feed/{id}")
    fun deleteFeed(@Path("id") id: String): LiveData<ApiResponse<Feed>>
}