/*
 * Copyright (C) 2019 Lukoh Nam, goForer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.megazone.megatong.di.module

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.google.gson.GsonBuilder
import com.megazone.megatong.data.datasource.model.cache.Cache
import com.megazone.megatong.data.datasource.network.factory.LiveDataCallAdapterFactory
import com.megazone.megatong.data.datasource.network.factory.NullOnEmptyConverterFactory
import com.megazone.megatong.data.datasource.network.rest.ServiceAPI
import dagger.Module
import dagger.Provides
import okhttp3.JavaNetCookieJar
import okhttp3.OkHttpClient
import okhttp3.ResponseBody.Companion.toResponseBody
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.CookieManager
import java.net.CookiePolicy
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * A module for Android-specific dependencies which require a [Context] or
 * [android.app.Application] to create.
 */
@Module
class AppModule {
    companion object {
        private const val READ_TIME_OUT: Long = 5
        private const val WRITE_TIME_OUT: Long = 5
        private const val CONNECT_TIME_OUT: Long = 5

        private const val BASE_URL = "https://api.megattong.com/"

        var rawResponseBody: String? = null
            private set
    }

    @Singleton
    @Provides
    internal fun provideServiceAPI(): ServiceAPI {
        val cookieManager = CookieManager()

        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL)

        val cookieJar = JavaNetCookieJar(cookieManager)
        val okHttpClient = OkHttpClient.Builder()
            .cookieJar(cookieJar)
            .readTimeout(READ_TIME_OUT, TimeUnit.SECONDS)
            .writeTimeout(WRITE_TIME_OUT, TimeUnit.SECONDS)
            .connectTimeout(CONNECT_TIME_OUT, TimeUnit.SECONDS)

        okHttpClient.addInterceptor { chain ->
            val original = chain.request()

            val builder = original.newBuilder()

            val request = builder
                .header("Connection", "keep-alive")
                .method(original.method, original.body)
                .build()

            val response = chain.proceed(request)

            rawResponseBody = response.body?.string()

            response.newBuilder().body(
                rawResponseBody!!.toResponseBody(response.body?.contentType())).build()
        }

        val gson = GsonBuilder().setLenient().create()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient.build())
            .addConverterFactory(NullOnEmptyConverterFactory())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .build()
            .create(ServiceAPI::class.java)
    }

    @Singleton
    @Provides
    internal fun provideCache(app: Application) = Room.databaseBuilder(app, Cache::class.java, "megatong.db").build()

    @Singleton
    @Provides
    internal fun provideUserDao(cache: Cache) = cache.userDao()

    @Singleton
    @Provides
    internal fun provideFeedDao(cache: Cache) = cache.feedDao()
}