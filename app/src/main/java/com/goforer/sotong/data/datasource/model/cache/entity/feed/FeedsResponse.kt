package com.goforer.sotong.data.datasource.model.cache.entity.feed

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Ignore

@Entity(primaryKeys = ["total"])
data class FeedsResponse(val total: Int,
                         @field:Embedded(prefix = "total_") val pages: Int,
                         @field:Embedded(prefix = "per_") val perPage: Int) {
    @Ignore
    val results: List<Feed>? = null
}