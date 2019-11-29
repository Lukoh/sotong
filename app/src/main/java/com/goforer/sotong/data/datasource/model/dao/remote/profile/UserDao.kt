package com.goforer.sotong.data.datasource.model.dao.remote.profile

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.goforer.sotong.data.datasource.model.cache.entity.user.User
import com.goforer.sotong.data.datasource.model.dao.BaseDao

@Dao
interface UserDao: BaseDao<User> {
    @Query("SELECT * FROM User")
    fun getUser(): LiveData<User>

    @Query("DELETE FROM User")
    suspend fun clearAll()

    @Query("DELETE FROM User WHERE id = :userId")
    fun deleteByUserId(userId: String)

    @Query("SELECT * FROM User")
    suspend fun loadUser(): User
}