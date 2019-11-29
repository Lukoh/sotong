package com.megazone.megatong.presentation.ui.home.feed.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0017J\u001a\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010%\u001a\u00020\u0019H\u0002J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020(H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/megazone/megatong/presentation/ui/home/feed/fragment/HomeFeedFragment;", "Lcom/megazone/base/ui/fragment/BaseFragment;", "()V", "acvAdapter", "Lcom/megazone/base/common/utils/AutoClearedValue;", "Lcom/megazone/megatong/presentation/ui/home/feed/adapter/HomeFeedAdapter;", "adapter", "feedPosition", "", "homeActivity", "Lcom/megazone/megatong/presentation/ui/home/HomeActivity;", "getHomeActivity$app_debug", "()Lcom/megazone/megatong/presentation/ui/home/HomeActivity;", "homeActivity$delegate", "Lkotlin/Lazy;", "isOverFirst", "", "lastVisibleItem", "getLastVisibleItem", "()I", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "selector", "Lim/ene/toro/widget/PressablePlayerSelector;", "getFeeds", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setupSwipeLayout", "stopFeed", "resource", "Lcom/megazone/megatong/data/datasource/network/response/Resource;", "Companion", "app_debug"})
public final class HomeFeedFragment extends com.megazone.base.ui.fragment.BaseFragment {
    private com.megazone.megatong.presentation.ui.home.feed.adapter.HomeFeedAdapter adapter;
    private com.megazone.base.common.utils.AutoClearedValue<com.megazone.megatong.presentation.ui.home.feed.adapter.HomeFeedAdapter> acvAdapter;
    private androidx.recyclerview.widget.LinearLayoutManager layoutManager;
    private boolean isOverFirst;
    private int feedPosition;
    private im.ene.toro.widget.PressablePlayerSelector selector;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy homeActivity$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEED_KEYWORD_ALL = "all";
    public static final com.megazone.megatong.presentation.ui.home.feed.fragment.HomeFeedFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final int getLastVisibleItem() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.megazone.megatong.presentation.ui.home.HomeActivity getHomeActivity$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void getFeeds() {
    }
    
    private final void stopFeed(com.megazone.megatong.data.datasource.network.response.Resource resource) {
    }
    
    private final void setupSwipeLayout() {
    }
    
    public HomeFeedFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/megazone/megatong/presentation/ui/home/feed/fragment/HomeFeedFragment$Companion;", "", "()V", "FEED_KEYWORD_ALL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}