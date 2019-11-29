package com.goforer.sotong.data.datasource.model.dao.remote.feed

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Query
import com.goforer.sotong.data.datasource.model.cache.entity.feed.Feed
import com.goforer.sotong.data.datasource.model.dao.BaseDao

@Dao
interface FeedDao: BaseDao<Feed> {
    @Query("SELECT * FROM Feeds")
    fun getFeeds(): DataSource.Factory<Int, Feed>

    @Query("SELECT * FROM Feeds ORDER BY createdAt DESC LIMIT 1")
    fun getLatestFeed(): LiveData<Feed>

    @Query("SELECT * FROM Feeds ORDER BY updatedAt  DESC LIMIT 1")
    fun getLatestUpdatedFeed(): LiveData<Feed>

    @Query("SELECT * FROM Feeds ORDER BY likes ASC")
    fun getFeedsOrderByLikes(): DataSource.Factory<Int, Feed>

    @Query("SELECT * FROM Feeds WHERE id = :feedId")
    fun getFeed(feedId: String):LiveData<Feed>

    @Query("DELETE FROM Feeds WHERE id = :feedId")
    suspend fun deleteByFeedId(feedId: String)

    @Query("DELETE FROM Feeds")
    suspend fun clearAll()
}