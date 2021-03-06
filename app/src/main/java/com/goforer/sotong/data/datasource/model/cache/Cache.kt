package com.goforer.sotong.data.datasource.model.cache

import androidx.room.Database
import androidx.room.RoomDatabase
import com.goforer.sotong.data.datasource.model.cache.entity.feed.Feed
import com.goforer.sotong.data.datasource.model.cache.entity.user.User
import com.goforer.sotong.data.datasource.model.dao.remote.feed.FeedDao
import com.goforer.sotong.data.datasource.model.dao.remote.profile.UserDao

/**
 * Main cache description.
 */
@Database(entities = [User::class, Feed::class], version = 1)
abstract class Cache: RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun feedDao(): FeedDao
}