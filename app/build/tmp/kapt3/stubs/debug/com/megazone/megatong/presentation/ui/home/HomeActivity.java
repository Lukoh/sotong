package com.megazone.megatong.presentation.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 T2\u00020\u0001:\u0001TB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0002J-\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0017H\u0000\u00a2\u0006\u0002\b&J\u001d\u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u0017H\u0000\u00a2\u0006\u0002\b*J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0002J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020.H\u0002J\u001a\u0010/\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020\u001dH\u0016J\u0012\u00103\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u000105H\u0014J\u0010\u00106\u001a\u00020.2\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020\u0006H\u0016J\"\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u00107\u001a\u000208H\u0016J\u0010\u0010=\u001a\u00020\u001d2\u0006\u00104\u001a\u000205H\u0014J\u0010\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u000205H\u0014J\u001d\u0010@\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u0017H\u0000\u00a2\u0006\u0002\bAJ\r\u0010B\u001a\u00020\u001dH\u0000\u00a2\u0006\u0002\bCJ\u001a\u0010D\u001a\u00020\u001d2\b\u0010E\u001a\u0004\u0018\u00010\u00062\u0006\u0010F\u001a\u00020\u0010H\u0002J\b\u0010G\u001a\u00020\u001dH\u0015J\b\u0010H\u001a\u00020\u001dH\u0014J\u0010\u0010I\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020JH\u0002J\u001f\u0010K\u001a\u00020\u001d2\b\u0010L\u001a\u0004\u0018\u00010\u00172\u0006\u0010(\u001a\u00020JH\u0000\u00a2\u0006\u0002\bMJ\u0012\u0010N\u001a\u00020\u001d2\b\u00104\u001a\u0004\u0018\u000105H\u0014J\u0015\u0010O\u001a\u00020\u001d2\u0006\u0010P\u001a\u00020QH\u0000\u00a2\u0006\u0002\bRJ\b\u0010S\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006U"}, d2 = {"Lcom/megazone/megatong/presentation/ui/home/HomeActivity;", "Lcom/megazone/base/ui/activity/BaseActivity;", "()V", "actionBar", "Landroidx/appcompat/app/ActionBar;", "bottomMenuItem", "Landroid/view/MenuItem;", "feedFragment", "Lcom/megazone/megatong/presentation/ui/home/feed/fragment/HomeFeedFragment;", "feedViewModel", "Lcom/megazone/megatong/presentation/vm/feed/FeedViewModel;", "getFeedViewModel$app_debug", "()Lcom/megazone/megatong/presentation/vm/feed/FeedViewModel;", "setFeedViewModel$app_debug", "(Lcom/megazone/megatong/presentation/vm/feed/FeedViewModel;)V", "itemId", "", "popFeedFragment", "Lcom/megazone/megatong/presentation/ui/home/feed/fragment/HomePopFeedFragment;", "resultCode", "sharedExitListener", "Lcom/megazone/megatong/presentation/common/effect/transition/TransitionCallback;", "userId", "", "getUserId$app_debug", "()Ljava/lang/String;", "setUserId$app_debug", "(Ljava/lang/String;)V", "deleteFeed", "", "feedId", "doQuery", "Lcom/megazone/megatong/data/datasource/model/cache/entity/Query;", "jobType", "firstParam", "", "secondParam", "sortType", "doQuery$app_debug", "edit", "view", "Landroid/view/View;", "edit$app_debug", "editFeed", "networkStatusVisible", "isVisible", "", "onActivityReenter", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "onPreparePanel", "featureId", "onRestoreInstanceState", "onSaveInstanceState", "outState", "remove", "remove$app_debug", "runUpdate", "runUpdate$app_debug", "selectItem", "menuItem", "id", "setActionBar", "setContentView", "setUnknownUserPic", "Lcom/mikepenz/materialdrawer/view/BezelImageView;", "setUserPic", "picPath", "setUserPic$app_debug", "setViews", "stopRefresh", "fragment", "Lcom/megazone/base/ui/fragment/BaseFragment;", "stopRefresh$app_debug", "transactMainFragment", "Companion", "app_debug"})
public final class HomeActivity extends com.megazone.base.ui.activity.BaseActivity {
    private int resultCode;
    private int itemId;
    private android.view.MenuItem bottomMenuItem;
    private com.megazone.megatong.presentation.ui.home.feed.fragment.HomeFeedFragment feedFragment;
    private com.megazone.megatong.presentation.ui.home.feed.fragment.HomePopFeedFragment popFeedFragment;
    private androidx.appcompat.app.ActionBar actionBar;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userId;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.megazone.megatong.presentation.vm.feed.FeedViewModel feedViewModel;
    private final com.megazone.megatong.presentation.common.effect.transition.TransitionCallback sharedExitListener = null;
    public static final int VISIBLE_UPTO_ITEMS = 10;
    public static final com.megazone.megatong.presentation.ui.home.HomeActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId$app_debug() {
        return null;
    }
    
    public final void setUserId$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.megazone.megatong.presentation.vm.feed.FeedViewModel getFeedViewModel$app_debug() {
        return null;
    }
    
    public final void setFeedViewModel$app_debug(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.presentation.vm.feed.FeedViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override()
    protected void setActionBar() {
    }
    
    @java.lang.Override()
    protected void setViews(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setContentView() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityReenter(int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPreparePanel(int featureId, @org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void transactMainFragment() {
    }
    
    private final void networkStatusVisible(boolean isVisible) {
    }
    
    private final void selectItem(android.view.MenuItem menuItem, int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.megazone.megatong.data.datasource.model.cache.entity.Query doQuery$app_debug(int jobType, @org.jetbrains.annotations.NotNull()
    java.lang.Object firstParam, @org.jetbrains.annotations.NotNull()
    java.lang.Object secondParam, @org.jetbrains.annotations.NotNull()
    java.lang.String sortType) {
        return null;
    }
    
    public final void remove$app_debug(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String feedId) {
    }
    
    public final void edit$app_debug(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String feedId) {
    }
    
    private final void setUnknownUserPic(com.mikepenz.materialdrawer.view.BezelImageView view) {
    }
    
    private final void deleteFeed(java.lang.String feedId) {
    }
    
    private final void editFeed(java.lang.String feedId) {
    }
    
    public final void setUserPic$app_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String picPath, @org.jetbrains.annotations.NotNull()
    com.mikepenz.materialdrawer.view.BezelImageView view) {
    }
    
    public final void runUpdate$app_debug() {
    }
    
    public final void stopRefresh$app_debug(@org.jetbrains.annotations.NotNull()
    com.megazone.base.ui.fragment.BaseFragment fragment) {
    }
    
    public HomeActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/megazone/megatong/presentation/ui/home/HomeActivity$Companion;", "", "()V", "VISIBLE_UPTO_ITEMS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}