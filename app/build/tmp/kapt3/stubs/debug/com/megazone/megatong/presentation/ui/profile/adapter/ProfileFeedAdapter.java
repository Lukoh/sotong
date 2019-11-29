package com.megazone.megatong.presentation.ui.profile.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u00012\u00020\u0004:\u0004)*+,B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u00a2\u0006\u0002\b\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u0014\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001d\u0010\u001b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u00a2\u0006\u0002\b\u001cJ\u001f\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u001fH\u0000\u00a2\u0006\u0002\b J5\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\'H\u0000\u00a2\u0006\u0002\b(R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/megazone/megatong/presentation/ui/profile/adapter/ProfileFeedAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/megazone/megatong/data/datasource/model/cache/entity/feed/Feed;", "Lcom/megazone/base/ui/holder/BaseViewHolder;", "Lcom/github/rubensousa/gravitysnaphelper/GravitySnapHelper$SnapListener;", "fragment", "Lcom/megazone/megatong/presentation/ui/profile/fragment/ProfileFragment;", "(Lcom/megazone/megatong/presentation/ui/profile/fragment/ProfileFragment;)V", "edit", "", "view", "Landroid/view/View;", "feedId", "", "edit$app_debug", "getItemId", "", "position", "", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onSnap", "remove", "remove$app_debug", "setUserPic", "picPath", "Lcom/mikepenz/materialdrawer/view/BezelImageView;", "setUserPic$app_debug", "setVisible", "view1", "view2", "view3", "view4", "isVisible", "", "setVisible$app_debug", "Companion", "HomeVideoFeedHolder", "ProfilePhotoFeedHolder", "ProfilePlainFeedHolder", "app_debug"})
public final class ProfileFeedAdapter extends androidx.paging.PagedListAdapter<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed, com.megazone.base.ui.holder.BaseViewHolder<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed>> implements com.github.rubensousa.gravitysnaphelper.GravitySnapHelper.SnapListener {
    private final com.megazone.megatong.presentation.ui.profile.fragment.ProfileFragment fragment = null;
    private static final java.lang.String MEDIA_PHOTO_TYPE = "photo";
    private static final java.lang.String MEDIA_VIDEO_TYPE = "video";
    private static final int PLAIN_TYPE = 0;
    private static final int PHOTO_TYPE = 1;
    private static final int VIDEO_TYPE = 2;
    private static final int FEED_RANKING_NONE = 0;
    private static final int FEED_RANKING_FIRST = 1;
    private static final int FEED_RANKING_SECOND = 2;
    private static final int FEED_RANKING_THIRD = 3;
    private static final java.lang.Object PAYLOAD_TITLE = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> DIFF_CALLBACK = null;
    public static final com.megazone.megatong.presentation.ui.profile.adapter.ProfileFeedAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.megazone.base.ui.holder.BaseViewHolder<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.megazone.base.ui.holder.BaseViewHolder<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public void onSnap(int position) {
    }
    
    public final void setVisible$app_debug(@org.jetbrains.annotations.NotNull()
    android.view.View view1, @org.jetbrains.annotations.NotNull()
    android.view.View view2, @org.jetbrains.annotations.NotNull()
    android.view.View view3, @org.jetbrains.annotations.NotNull()
    android.view.View view4, boolean isVisible) {
    }
    
    public final void remove$app_debug(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String feedId) {
    }
    
    public final void edit$app_debug(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String feedId) {
    }
    
    public final void setUserPic$app_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String picPath, @org.jetbrains.annotations.NotNull()
    com.mikepenz.materialdrawer.view.BezelImageView view) {
    }
    
    public ProfileFeedAdapter(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.presentation.ui.profile.fragment.ProfileFragment fragment) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/megazone/megatong/presentation/ui/profile/adapter/ProfileFeedAdapter$ProfilePhotoFeedHolder;", "Lcom/megazone/base/ui/holder/BaseViewHolder;", "Lcom/megazone/megatong/data/datasource/model/cache/entity/feed/Feed;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "adapter", "Lcom/megazone/megatong/presentation/ui/profile/adapter/ProfileFeedAdapter;", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "(Landroid/view/View;Lcom/megazone/megatong/presentation/ui/profile/adapter/ProfileFeedAdapter;Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "getContainerView", "()Landroid/view/View;", "attachToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "bindItemHolder", "holder", "item", "position", "", "onItemClear", "onItemSelected", "app_debug"})
    public static final class ProfilePhotoFeedHolder extends com.megazone.base.ui.holder.BaseViewHolder<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> implements kotlinx.android.extensions.LayoutContainer {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        private final com.megazone.megatong.presentation.ui.profile.adapter.ProfileFeedAdapter adapter = null;
        private final androidx.recyclerview.widget.RecyclerView.RecycledViewPool viewPool = null;
        private java.util.HashMap _$_findViewCache;
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        @java.lang.Override()
        public void bindItemHolder(@org.jetbrains.annotations.NotNull()
        com.megazone.base.ui.holder.BaseViewHolder<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> holder, @org.jetbrains.annotations.NotNull()
        com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed item, int position) {
        }
        
        @java.lang.Override()
        public void onItemSelected() {
        }
        
        @java.lang.Override()
        public void onItemClear() {
        }
        
        private final void attachToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public ProfilePhotoFeedHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView, @org.jetbrains.annotations.NotNull()
        com.megazone.megatong.presentation.ui.profile.adapter.ProfileFeedAdapter adapter, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.RecycledViewPool viewPool) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ&\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/megazone/megatong/presentation/ui/profile/adapter/ProfileFeedAdapter$ProfilePlainFeedHolder;", "Lcom/megazone/base/ui/holder/BaseViewHolder;", "Lcom/megazone/megatong/data/datasource/model/cache/entity/feed/Feed;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "adapter", "Lcom/megazone/megatong/presentation/ui/profile/adapter/ProfileFeedAdapter;", "(Landroid/view/View;Lcom/megazone/megatong/presentation/ui/profile/adapter/ProfileFeedAdapter;)V", "getContainerView", "()Landroid/view/View;", "bindItemHolder", "", "holder", "item", "position", "", "onItemClear", "onItemSelected", "app_debug"})
    public static final class ProfilePlainFeedHolder extends com.megazone.base.ui.holder.BaseViewHolder<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> implements kotlinx.android.extensions.LayoutContainer {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        private final com.megazone.megatong.presentation.ui.profile.adapter.ProfileFeedAdapter adapter = null;
        private java.util.HashMap _$_findViewCache;
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        @java.lang.Override()
        public void bindItemHolder(@org.jetbrains.annotations.NotNull()
        com.megazone.base.ui.holder.BaseViewHolder<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> holder, @org.jetbrains.annotations.NotNull()
        com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed item, int position) {
        }
        
        @java.lang.Override()
        public void onItemSelected() {
        }
        
        @java.lang.Override()
        public void onItemClear() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public ProfilePlainFeedHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView, @org.jetbrains.annotations.NotNull()
        com.megazone.megatong.presentation.ui.profile.adapter.ProfileFeedAdapter adapter) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ&\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\u0010H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016J\b\u0010#\u001a\u00020\u0010H\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/megazone/megatong/presentation/ui/profile/adapter/ProfileFeedAdapter$HomeVideoFeedHolder;", "Lcom/megazone/base/ui/holder/BaseViewHolder;", "Lcom/megazone/megatong/data/datasource/model/cache/entity/feed/Feed;", "Lkotlinx/android/extensions/LayoutContainer;", "Lim/ene/toro/ToroPlayer;", "containerView", "Landroid/view/View;", "adapter", "Lcom/megazone/megatong/presentation/ui/profile/adapter/ProfileFeedAdapter;", "(Landroid/view/View;Lcom/megazone/megatong/presentation/ui/profile/adapter/ProfileFeedAdapter;)V", "getContainerView", "()Landroid/view/View;", "feed", "helper", "Lim/ene/toro/exoplayer/ExoPlayerViewHelper;", "bindItemHolder", "", "holder", "item", "position", "", "getCurrentPlaybackInfo", "Lim/ene/toro/media/PlaybackInfo;", "getPlayerOrder", "getPlayerView", "initialize", "container", "Lim/ene/toro/widget/Container;", "playbackInfo", "isPlaying", "", "onItemClear", "onItemSelected", "pause", "play", "release", "wantsToPlay", "app_debug"})
    public static final class HomeVideoFeedHolder extends com.megazone.base.ui.holder.BaseViewHolder<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> implements kotlinx.android.extensions.LayoutContainer, im.ene.toro.ToroPlayer {
        private im.ene.toro.exoplayer.ExoPlayerViewHelper helper;
        private com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed feed;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        private final com.megazone.megatong.presentation.ui.profile.adapter.ProfileFeedAdapter adapter = null;
        private java.util.HashMap _$_findViewCache;
        
        @java.lang.Override()
        public boolean isPlaying() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"PLUGIN_WARNING"})
        @java.lang.Override()
        public android.view.View getPlayerView() {
            return null;
        }
        
        @java.lang.Override()
        public void pause() {
        }
        
        @java.lang.Override()
        public boolean wantsToPlay() {
            return false;
        }
        
        @java.lang.Override()
        public void play() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public im.ene.toro.media.PlaybackInfo getCurrentPlaybackInfo() {
            return null;
        }
        
        @java.lang.Override()
        public void release() {
        }
        
        @java.lang.Override()
        public void initialize(@org.jetbrains.annotations.NotNull()
        im.ene.toro.widget.Container container, @org.jetbrains.annotations.NotNull()
        im.ene.toro.media.PlaybackInfo playbackInfo) {
        }
        
        @java.lang.Override()
        public int getPlayerOrder() {
            return 0;
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        @java.lang.Override()
        public void bindItemHolder(@org.jetbrains.annotations.NotNull()
        com.megazone.base.ui.holder.BaseViewHolder<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed> holder, @org.jetbrains.annotations.NotNull()
        com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed item, int position) {
        }
        
        @java.lang.Override()
        public void onItemSelected() {
        }
        
        @java.lang.Override()
        public void onItemClear() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public HomeVideoFeedHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView, @org.jetbrains.annotations.NotNull()
        com.megazone.megatong.presentation.ui.profile.adapter.ProfileFeedAdapter adapter) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/megazone/megatong/presentation/ui/profile/adapter/ProfileFeedAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/megazone/megatong/data/datasource/model/cache/entity/feed/Feed;", "FEED_RANKING_FIRST", "", "FEED_RANKING_NONE", "FEED_RANKING_SECOND", "FEED_RANKING_THIRD", "MEDIA_PHOTO_TYPE", "", "MEDIA_VIDEO_TYPE", "PAYLOAD_TITLE", "PHOTO_TYPE", "PLAIN_TYPE", "VIDEO_TYPE", "sameExceptTitle", "", "oldFeed", "newFeed", "app_debug"})
    public static final class Companion {
        
        private final boolean sameExceptTitle(com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed oldFeed, com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed newFeed) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}