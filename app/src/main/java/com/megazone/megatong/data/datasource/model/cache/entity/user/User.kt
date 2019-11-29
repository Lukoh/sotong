package com.megazone.megatong.data.datasource.model.cache.entity.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.megazone.megatong.data.datasource.model.cache.entity.BaseData

@Entity(tableName = "User")
data class User(@field:PrimaryKey
                @field:ColumnInfo(name = "id") val id: String,
                @field:ColumnInfo(name = "email") val email: String?,
                @field:SerializedName("email_verified") val emailVerified: Boolean,
                @field:ColumnInfo(name = "name") val name: String?,
                @field:SerializedName("provider_id") val providerId: String?,
                @field:ColumnInfo(name = "phone") val phone: String?,
                @field:ColumnInfo(name = "photo") val photo: String?): BaseData()