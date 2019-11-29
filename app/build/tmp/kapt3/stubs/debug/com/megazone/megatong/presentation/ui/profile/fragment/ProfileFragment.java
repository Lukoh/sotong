package com.megazone.megatong.presentation.ui.profile.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0000\u00a2\u0006\u0002\b&J \u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0002J\u0015\u0010-\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0000\u00a2\u0006\u0002\b.J\b\u0010/\u001a\u00020#H\u0002J\b\u00100\u001a\u00020#H\u0002J&\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020#H\u0017J\u001a\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010<\u001a\u00020#H\u0002J\u0015\u0010=\u001a\u00020#2\u0006\u0010;\u001a\u00020>H\u0000\u00a2\u0006\u0002\b?J\b\u0010@\u001a\u00020#H\u0002J\u0010\u0010A\u001a\u00020#2\u0006\u0010B\u001a\u00020CH\u0002J\r\u0010D\u001a\u00020#H\u0000\u00a2\u0006\u0002\bER\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006F"}, d2 = {"Lcom/megazone/megatong/presentation/ui/profile/fragment/ProfileFragment;", "Lcom/megazone/base/ui/fragment/BaseFragment;", "()V", "acvAdapter", "Lcom/megazone/base/common/utils/AutoClearedValue;", "Lcom/megazone/megatong/presentation/ui/profile/adapter/ProfileFeedAdapter;", "adapter", "feedPosition", "", "feedViewModel", "Lcom/megazone/megatong/presentation/vm/feed/FeedViewModel;", "getFeedViewModel", "()Lcom/megazone/megatong/presentation/vm/feed/FeedViewModel;", "setFeedViewModel", "(Lcom/megazone/megatong/presentation/vm/feed/FeedViewModel;)V", "isOverFirst", "", "lastVisibleItem", "getLastVisibleItem", "()I", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "profileActivity", "Lcom/megazone/megatong/presentation/ui/profile/ProfileActivity;", "getProfileActivity$app_debug", "()Lcom/megazone/megatong/presentation/ui/profile/ProfileActivity;", "profileActivity$delegate", "Lkotlin/Lazy;", "userViewModel", "Lcom/megazone/megatong/presentation/vm/login/UserViewModel;", "getUserViewModel", "()Lcom/megazone/megatong/presentation/vm/login/UserViewModel;", "setUserViewModel", "(Lcom/megazone/megatong/presentation/vm/login/UserViewModel;)V", "deleteFeed", "", "feedId", "", "deleteFeed$app_debug", "doQuery", "Lcom/megazone/megatong/data/datasource/model/cache/entity/Query;", "workType", "firstParam", "", "secondParam", "editFeed", "editFeed$app_debug", "getFeeds", "getUser", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "runUpdate", "setUserPic", "Lcom/mikepenz/materialdrawer/view/BezelImageView;", "setUserPic$app_debug", "setupSwipeLayout", "stopFeed", "resource", "Lcom/megazone/megatong/data/datasource/network/response/Resource;", "stopRefresh", "stopRefresh$app_debug", "app_debug"})
public final class ProfileFragment extends com.megazone.base.ui.fragment.BaseFragment {
    private com.megazone.megatong.presentation.ui.profile.adapter.ProfileFeedAdapter adapter;
    private com.megazone.base.common.utils.AutoClearedValue<com.megazone.megatong.presentation.ui.profile.adapter.ProfileFeedAdapter> acvAdapter;
    private androidx.recyclerview.widget.LinearLayoutManager layoutManager;
    private boolean isOverFirst;
    private int feedPosition;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy profileActivity$delegate = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.megazone.megatong.presentation.vm.feed.FeedViewModel feedViewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.megazone.megatong.presentation.vm.login.UserViewModel userViewModel;
    private java.util.HashMap _$_findViewCache;
    
    private final int getLastVisibleItem() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.megazone.megatong.presentation.ui.profile.ProfileActivity getProfileActivity$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.megazone.megatong.presentation.vm.feed.FeedViewModel getFeedViewModel() {
        return null;
    }
    
    public final void setFeedViewModel(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.presentation.vm.feed.FeedViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.megazone.megatong.presentation.vm.login.UserViewModel getUserViewModel() {
        return null;
    }
    
    public final void setUserViewModel(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.presentation.vm.login.UserViewModel p0) {
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
    
    private final void getUser() {
    }
    
    private final void getFeeds() {
    }
    
    private final com.megazone.megatong.data.datasource.model.cache.entity.Query doQuery(int workType, java.lang.Object firstParam, java.lang.Object secondParam) {
        return null;
    }
    
    private final void stopFeed(com.megazone.megatong.data.datasource.network.response.Resource resource) {
    }
    
    private final void setupSwipeLayout() {
    }
    
    private final void runUpdate() {
    }
    
    public final void deleteFeed$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String feedId) {
    }
    
    public final void editFeed$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String feedId) {
    }
    
    public final void setUserPic$app_debug(@org.jetbrains.annotations.NotNull()
    com.mikepenz.materialdrawer.view.BezelImageView view) {
    }
    
    public final void stopRefresh$app_debug() {
    }
    
    public ProfileFragment() {
        super();
    }
}