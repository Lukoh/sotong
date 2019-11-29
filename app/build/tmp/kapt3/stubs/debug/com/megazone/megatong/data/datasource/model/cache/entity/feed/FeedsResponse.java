package com.megazone.megatong.data.datasource.model.cache.entity.feed;

import java.lang.System;

@androidx.room.Entity(primaryKeys = {"total"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b\u00a8\u0006\u001a"}, d2 = {"Lcom/megazone/megatong/data/datasource/model/cache/entity/feed/FeedsResponse;", "", "total", "", "pages", "perPage", "(III)V", "getPages", "()I", "getPerPage", "results", "", "Lcom/megazone/megatong/data/datasource/model/cache/entity/feed/Feed;", "getResults", "()Ljava/util/List;", "getTotal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class FeedsResponse {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private final java.util.List<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> results = null;
    private final int total = 0;
    @androidx.room.Embedded(prefix = "total_")
    private final int pages = 0;
    @androidx.room.Embedded(prefix = "per_")
    private final int perPage = 0;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> getResults() {
        return null;
    }
    
    public final int getTotal() {
        return 0;
    }
    
    public final int getPages() {
        return 0;
    }
    
    public final int getPerPage() {
        return 0;
    }
    
    public FeedsResponse(int total, int pages, int perPage) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.megazone.megatong.data.datasource.model.cache.entity.feed.FeedsResponse copy(int total, int pages, int perPage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}