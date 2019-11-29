package com.megazone.megatong.presentation.vm.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\u00a2\u0006\u0002\b\u0010J\r\u0010\u0018\u001a\u00020\u0019H\u0000\u00a2\u0006\u0002\b\u001aJ\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/megazone/megatong/presentation/vm/feed/FeedViewModel;", "Lcom/megazone/megatong/presentation/vm/BaseViewModel;", "Lcom/megazone/megatong/domain/usecase/Parameters;", "", "loadUseCase", "Lcom/megazone/megatong/domain/usecase/feed/LoadFeedUseCase;", "createUseCase", "Lcom/megazone/megatong/domain/usecase/feed/CreateFeedUseCase;", "updateFeedUseCase", "Lcom/megazone/megatong/domain/usecase/feed/UpdateFeedUseCase;", "deleteFeedUseCase", "Lcom/megazone/megatong/domain/usecase/feed/DeleteFeedUseCase;", "(Lcom/megazone/megatong/domain/usecase/feed/LoadFeedUseCase;Lcom/megazone/megatong/domain/usecase/feed/CreateFeedUseCase;Lcom/megazone/megatong/domain/usecase/feed/UpdateFeedUseCase;Lcom/megazone/megatong/domain/usecase/feed/DeleteFeedUseCase;)V", "feed", "Landroidx/lifecycle/LiveData;", "Lcom/megazone/megatong/data/datasource/network/response/Resource;", "getFeed$app_debug", "()Landroidx/lifecycle/LiveData;", "setFeed$app_debug", "(Landroidx/lifecycle/LiveData;)V", "getFeed", "Lcom/megazone/megatong/data/datasource/model/cache/entity/feed/Feed;", "feedId", "", "removeAll", "", "removeAll$app_debug", "setParam", "params", "app_debug"})
@javax.inject.Singleton()
public final class FeedViewModel extends com.megazone.megatong.presentation.vm.BaseViewModel<com.megazone.megatong.domain.usecase.Parameters, java.lang.Integer> {
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.Resource> feed;
    private final com.megazone.megatong.domain.usecase.feed.LoadFeedUseCase loadUseCase = null;
    private final com.megazone.megatong.domain.usecase.feed.CreateFeedUseCase createUseCase = null;
    private final com.megazone.megatong.domain.usecase.feed.UpdateFeedUseCase updateFeedUseCase = null;
    private final com.megazone.megatong.domain.usecase.feed.DeleteFeedUseCase deleteFeedUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.Resource> getFeed$app_debug() {
        return null;
    }
    
    public final void setFeed$app_debug(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.Resource> p0) {
    }
    
    @java.lang.Override()
    public void setParam(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.domain.usecase.Parameters params) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> getFeed$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String feedId) {
        return null;
    }
    
    public final void removeAll$app_debug() {
    }
    
    @javax.inject.Inject()
    public FeedViewModel(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.domain.usecase.feed.LoadFeedUseCase loadUseCase, @org.jetbrains.annotations.NotNull()
    com.megazone.megatong.domain.usecase.feed.CreateFeedUseCase createUseCase, @org.jetbrains.annotations.NotNull()
    com.megazone.megatong.domain.usecase.feed.UpdateFeedUseCase updateFeedUseCase, @org.jetbrains.annotations.NotNull()
    com.megazone.megatong.domain.usecase.feed.DeleteFeedUseCase deleteFeedUseCase) {
        super();
    }
}