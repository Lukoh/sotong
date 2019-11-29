package com.megazone.megatong.domain.usecase.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/megazone/megatong/domain/usecase/feed/UpdateFeedUseCase;", "Lcom/megazone/megatong/domain/usecase/BaseUseCase;", "Lcom/megazone/megatong/domain/usecase/Parameters;", "Lcom/megazone/megatong/data/datasource/network/response/Resource;", "editFeedRepository", "Lcom/megazone/megatong/data/repository/remote/feed/EditFeedRepository;", "(Lcom/megazone/megatong/data/repository/remote/feed/EditFeedRepository;)V", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/megazone/megatong/data/datasource/model/cache/entity/Query;", "getLiveData", "()Landroidx/lifecycle/MutableLiveData;", "liveData$delegate", "Lkotlin/Lazy;", "execute", "Landroidx/lifecycle/LiveData;", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "parameters", "getFeed", "Lcom/megazone/megatong/data/datasource/model/cache/entity/feed/Feed;", "feedId", "", "getFeed$app_debug", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setQuery", "", "app_debug"})
@javax.inject.Singleton()
public final class UpdateFeedUseCase extends com.megazone.megatong.domain.usecase.BaseUseCase<com.megazone.megatong.domain.usecase.Parameters, com.megazone.megatong.data.datasource.network.response.Resource> {
    private final kotlin.Lazy liveData$delegate = null;
    private final com.megazone.megatong.data.repository.remote.feed.EditFeedRepository editFeedRepository = null;
    
    private final androidx.lifecycle.MutableLiveData<com.megazone.megatong.data.datasource.model.cache.entity.Query> getLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.Resource> execute(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope viewModelScope, @org.jetbrains.annotations.NotNull()
    com.megazone.megatong.domain.usecase.Parameters parameters) {
        return null;
    }
    
    private final void setQuery(com.megazone.megatong.domain.usecase.Parameters parameters) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFeed$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String feedId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public UpdateFeedUseCase(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.data.repository.remote.feed.EditFeedRepository editFeedRepository) {
        super();
    }
}