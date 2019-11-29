package com.megazone.base.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002:\u0001\u0017B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H$J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/megazone/base/ui/adapter/BaseAdapter;", "T", "Landroidx/paging/PagedListAdapter;", "Lcom/megazone/base/ui/holder/BaseViewHolder;", "layoutResId", "", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(ILandroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "lastAnimatedPosition", "createViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "type", "onCreateViewHolder", "parent", "resetAnimation", "", "setAnimateViewIfNecessary", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Companion", "app_debug"})
public abstract class BaseAdapter<T extends java.lang.Object> extends androidx.paging.PagedListAdapter<T, com.megazone.base.ui.holder.BaseViewHolder<T>> {
    private int lastAnimatedPosition;
    private final int layoutResId = 0;
    private static final float VIEW_VERTICAL_POSITION = 100.0F;
    private static final float ANIMATED_VALUE = 0.0F;
    private static final long ANIMATION_DURATION = 250L;
    private static final float ANIMATION_DEGREE = 1.0F;
    public static final int VIEW_TYPE_HEADER = 10000;
    public static final int VIEW_TYPE_FOOTER = 10001;
    public static final int VIEW_TYPE_LOADING = 10002;
    public static final int VIEW_TYPE_ITEM = 10003;
    public static final int VIEW_TYPE_NONE_COMMENT = 10004;
    public static final com.megazone.base.ui.adapter.BaseAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.megazone.base.ui.holder.BaseViewHolder<T> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int type) {
        return null;
    }
    
    /**
     * Create a ViewHolder when BaseAdapter needs a new ViewHolder of the given type to represent
     * an item.
     *
     *
     * This new ViewHolder should be constructed with a new View that can represent the items
     * of the given type. You can either create a new View manually or inflate it from an XML
     * layout file.
     *
     *
     *
     * @param viewGroup The ViewGroup into which the new View will be added after it is bound to
     * an mainAdapter position.
     * @param view The view this LayoutManager is bound to
     * @param type The view type of the new View.
     * @return A new ViewHolder that holds a View of the given view type
     */
    @org.jetbrains.annotations.NotNull()
    protected abstract com.megazone.base.ui.holder.BaseViewHolder<T> createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, @org.jetbrains.annotations.NotNull()
    android.view.View view, int type);
    
    public final void resetAnimation() {
    }
    
    /**
     * Set animation ViewHolder's item if need be.
     *
     * @param viewHolder the ViewHolder to set animation ViewHolder's item
     */
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    public final void setAnimateViewIfNecessary(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
    
    public BaseAdapter(int layoutResId, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> DIFF_CALLBACK) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/megazone/base/ui/adapter/BaseAdapter$Companion;", "", "()V", "ANIMATED_VALUE", "", "ANIMATION_DEGREE", "ANIMATION_DURATION", "", "VIEW_TYPE_FOOTER", "", "VIEW_TYPE_HEADER", "VIEW_TYPE_ITEM", "VIEW_TYPE_LOADING", "VIEW_TYPE_NONE_COMMENT", "VIEW_VERTICAL_POSITION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}