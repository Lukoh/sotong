package com.megazone.megatong.data.datasource.model.cache.entity.feed

import androidx.room.*
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken
import com.megazone.megatong.data.datasource.model.cache.entity.BaseData
import com.megazone.megatong.data.datasource.model.cache.entity.user.User

@Entity(tableName = "Feeds")
data class Feed(@field:PrimaryKey
                @field:ColumnInfo(name = "id") val id: String,
                @field:SerializedName("created_at") val createdAt: Long,
                @field:SerializedName("updated_at") val updatedAt: Long,
                @field:ColumnInfo(name = "media") val media: String,
                @field:ColumnInfo(name = "likes") val likes: Int,
                @field:ColumnInfo(name = "ranking") val ranking: Int,
                @field:ColumnInfo(name = "description") val description: String,
                @field:Embedded(prefix = "user") val user: User,
                @field:Embedded(prefix = "video") val video: Video): BaseData() {
    @Ignore
    @TypeConverters(PhotosTypeConverters::class) val photos: List<Photo>? = null

    class PhotosTypeConverters {
        @TypeConverter
        fun stringToPhotos(json: String): List<Photo>? {
            val type = object : TypeToken<List<Photo>>() {}.type

            return gson().fromJson<List<Photo>>(json, type)
        }

        @TypeConverter
        fun photosToString(list: List<Photo>): String {
            val type = object : TypeToken<List<Photo>>() {}.type

            return gson().toJson(list, type)
        }
    }

    data class Photo(@field:ColumnInfo(name= "id") val id: String,
                     @field:ColumnInfo(name = "photo") val photo: String)

    data class Video(@field:ColumnInfo(name= "id") val id: String,
                     @field:ColumnInfo(name = "url") val url: String)

}