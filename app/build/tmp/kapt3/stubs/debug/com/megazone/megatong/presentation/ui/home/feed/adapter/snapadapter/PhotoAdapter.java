package com.megazone.megatong.presentation.ui.home.feed.adapter.snapadapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\t\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000\u00a2\u0006\u0002\b\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/megazone/megatong/presentation/ui/home/feed/adapter/snapadapter/PhotoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/megazone/megatong/presentation/ui/home/feed/adapter/snapadapter/PhotoAdapter$ViewHolder;", "activity", "Lcom/megazone/base/ui/activity/BaseActivity;", "(Lcom/megazone/base/ui/activity/BaseActivity;)V", "items", "", "Lcom/megazone/megatong/data/datasource/model/cache/entity/feed/Feed$Photo;", "addItem", "", "addItem$app_debug", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_debug"})
public final class PhotoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.megazone.megatong.presentation.ui.home.feed.adapter.snapadapter.PhotoAdapter.ViewHolder> {
    private java.util.List<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed.Photo> items;
    private final com.megazone.base.ui.activity.BaseActivity activity = null;
    private static final int PHOTO_RATIO_WIDTH = 344;
    private static final int PHOTO_RATIO_HEIGHT = 192;
    public static final com.megazone.megatong.presentation.ui.home.feed.adapter.snapadapter.PhotoAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.megazone.megatong.presentation.ui.home.feed.adapter.snapadapter.PhotoAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.presentation.ui.home.feed.adapter.snapadapter.PhotoAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    public final void addItem$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed.Photo> items) {
    }
    
    public PhotoAdapter(@org.jetbrains.annotations.NotNull()
    com.megazone.base.ui.activity.BaseActivity activity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ&\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/megazone/megatong/presentation/ui/home/feed/adapter/snapadapter/PhotoAdapter$ViewHolder;", "Lcom/megazone/base/ui/holder/BaseViewHolder;", "Lcom/megazone/megatong/data/datasource/model/cache/entity/feed/Feed$Photo;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "activity", "Lcom/megazone/base/ui/activity/BaseActivity;", "(Landroid/view/View;Lcom/megazone/base/ui/activity/BaseActivity;)V", "getContainerView", "()Landroid/view/View;", "bindItemHolder", "", "holder", "item", "position", "", "onItemClear", "onItemSelected", "app_debug"})
    public static final class ViewHolder extends com.megazone.base.ui.holder.BaseViewHolder<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed.Photo> implements kotlinx.android.extensions.LayoutContainer {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        private final com.megazone.base.ui.activity.BaseActivity activity = null;
        private java.util.HashMap _$_findViewCache;
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        @java.lang.Override()
        public void bindItemHolder(@org.jetbrains.annotations.NotNull()
        com.megazone.base.ui.holder.BaseViewHolder<com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed.Photo> holder, @org.jetbrains.annotations.NotNull()
        com.megazone.megatong.data.datasource.model.cache.entity.feed.Feed.Photo item, int position) {
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
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView, @org.jetbrains.annotations.NotNull()
        com.megazone.base.ui.activity.BaseActivity activity) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/megazone/megatong/presentation/ui/home/feed/adapter/snapadapter/PhotoAdapter$Companion;", "", "()V", "PHOTO_RATIO_HEIGHT", "", "PHOTO_RATIO_WIDTH", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}