package com.megazone.base.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 C*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003CDEB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00028\u0000H\u0007\u00a2\u0006\u0002\u0010%J&\u0010&\u001a\u00020#2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\fH\u0007J\u001d\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00028\u00002\u0006\u0010+\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010,J\u001d\u0010-\u001a\u00020\f2\u0006\u0010*\u001a\u00028\u00002\u0006\u0010+\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010,J\u000e\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\u0004J\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u000202H$J\b\u00103\u001a\u00020\u0004H\u0016J\u0010\u00104\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018H\u0016J\u0016\u00105\u001a\u00020\f2\u0006\u00106\u001a\u0002072\u0006\u0010/\u001a\u00020\u0004J \u00108\u001a\u00020#2\u0006\u0010\'\u001a\u00020\u00042\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018H\u0002J\u0018\u00109\u001a\u00020#2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001eH$J\u001e\u0010:\u001a\u00020#2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010/\u001a\u00020\u0004H\u0016J\u0018\u0010=\u001a\u00020#2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001eH$J \u0010>\u001a\u00020#2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00182\u0006\u0010\'\u001a\u00020\u0004H\u0002J\u0010\u0010?\u001a\u00020#2\u0006\u0010!\u001a\u00020\fH\u0004J\u0016\u0010@\u001a\u00020#2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002J\u001c\u0010A\u001a\u00020#2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010(\u001a\u00020\fJ\u0006\u0010B\u001a\u00020\fR\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR$\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR.\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Lcom/megazone/base/ui/adapter/BaseListAdapter;", "T", "Lcom/megazone/base/ui/adapter/BaseAdapter;", "layoutResId", "", "mFragment", "Lcom/megazone/base/ui/fragment/RecyclerFragment;", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(ILcom/megazone/base/ui/fragment/RecyclerFragment;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "dataVersion", "isEmptyItems", "", "()Z", "setEmptyItems", "(Z)V", "isLoadingItems", "setLoadingItems", "isReachedToLastItem", "setReachedToLastItem", "isReachedToLast", "isReachedToLastPage", "setReachedToLastPage", "items", "", "getItems$app_debug", "()Ljava/util/List;", "setItems$app_debug", "(Ljava/util/List;)V", "<set-?>", "", "lastItems", "getLastItems", "usedLoadingImage", "addItem", "", "item", "(Ljava/lang/Object;)V", "addItems", "type", "isSorted", "areContentsTheSame", "oldItem", "newItem", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areItemsTheSame", "deleteItem", "position", "dispatchUpdates", "diffResult", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "getItemCount", "getItems", "moveSelectedPosition", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "notifyItems", "onAddItems", "onBindViewHolder", "holder", "Lcom/megazone/base/ui/holder/BaseViewHolder;", "onUpdateItems", "putItems", "setUsedLoadingImage", "update", "updateItems", "usedLoadImage", "Companion", "InsertDiff", "UpdateDiff", "app_debug"})
public abstract class BaseListAdapter<T extends java.lang.Object> extends com.megazone.base.ui.adapter.BaseAdapter<T> {
    
    /**
     * Set true if the item is reached to the last.
     *
     * @param isReachedToLast true if the item is reached to the last
     */
    private boolean isReachedToLastItem;
    
    /**
     * Set true if the page is reached to the last and notify any registered observers that the item
     * reflected at last item in last page has been newly inserted for last footer.
     *
     * @param isReachedToLast true if the page is reached to the last
     */
    private boolean isReachedToLastPage;
    
    /**
     * Set true if the items is empty.
     *
     * @param isEmptyItems true if the items is empty
     */
    private boolean isEmptyItems;
    
    /**
     * Set true if the items is loading.
     *
     * @param isLoadingItems true if the items is loading
     */
    private boolean isLoadingItems;
    private boolean usedLoadingImage;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<T> items;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends T> lastItems;
    private int dataVersion;
    private final com.megazone.base.ui.fragment.RecyclerFragment<T> mFragment = null;
    public static final int TYPE_FOR_MORE_ITEMS = 1;
    public static final int TYPE_FOR_PINNEDUP_ITEMS = 2;
    public static final int TYPE_FOR_SEARCH_KEYWORD = 3;
    private static final int TYPE_NONE = -1;
    private static final int TYPE_FOR_ONE_ITEM = 0;
    private static final int MINIMUM_ITEM_COUNT = 7;
    public static final com.megazone.base.ui.adapter.BaseListAdapter.Companion Companion = null;
    
    public final boolean isReachedToLastItem() {
        return false;
    }
    
    public final void setReachedToLastItem(boolean p0) {
    }
    
    public final boolean isReachedToLastPage() {
        return false;
    }
    
    public final void setReachedToLastPage(boolean isReachedToLast) {
    }
    
    public final boolean isEmptyItems() {
        return false;
    }
    
    public final void setEmptyItems(boolean p0) {
    }
    
    public final boolean isLoadingItems() {
        return false;
    }
    
    public final void setLoadingItems(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<T> getItems$app_debug() {
        return null;
    }
    
    public final void setItems$app_debug(@org.jetbrains.annotations.Nullable()
    java.util.List<T> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<T> getLastItems() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.megazone.base.ui.holder.BaseViewHolder<T> holder, int position) {
    }
    
    @androidx.annotation.MainThread()
    public final void addItem(T item) {
    }
    
    @androidx.annotation.MainThread()
    public final void addItems(@org.jetbrains.annotations.NotNull()
    java.util.List<T> items, int type, boolean isSorted) {
    }
    
    public final void updateItems(@org.jetbrains.annotations.NotNull()
    java.util.List<T> items, boolean isSorted) {
    }
    
    /**
     * Delete an item selected on the list of downloaded photo
     */
    public final void deleteItem(int position) {
    }
    
    /**
     * Scroll to the specified mainAdapter position.
     * Actual position of the item on the screen depends on the LayoutManager implementation.
     *
     * @param layoutManager The currently bound LayoutManager
     * @param position Scroll to this mainAdapter position
     */
    public final boolean moveSelectedPosition(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int position) {
        return false;
    }
    
    /**
     * Check if the loading image is used to the list as an item.
     *
     * @return true if the loading image is used
     */
    public final boolean usedLoadImage() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.util.List<T> getItems() {
        return null;
    }
    
    private final void putItems(java.util.List<T> items, int type) {
    }
    
    private final void notifyItems(int type, java.util.List<T> items) {
    }
    
    private final void update(java.util.List<T> items) {
    }
    
    /**
     * Set true if the loading image is used.
     *
     * @param usedLoadingImage true if the loading image is used
     */
    protected final void setUsedLoadingImage(boolean usedLoadingImage) {
    }
    
    protected abstract boolean areItemsTheSame(T oldItem, T newItem);
    
    protected abstract boolean areContentsTheSame(T oldItem, T newItem);
    
    protected abstract void dispatchUpdates(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.DiffResult diffResult);
    
    protected abstract void onAddItems(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> items);
    
    protected abstract void onUpdateItems(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> items);
    
    public BaseListAdapter(int layoutResId, @org.jetbrains.annotations.NotNull()
    com.megazone.base.ui.fragment.RecyclerFragment<T> mFragment, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> DIFF_CALLBACK) {
        super(0, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B=\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ!\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0011\"\u00020\u0003H\u0014\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/megazone/base/ui/adapter/BaseListAdapter$InsertDiff;", "T", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "mAdapter", "Lcom/megazone/base/ui/adapter/BaseListAdapter;", "mOldItems", "", "mNewItems", "mStartVersion", "", "(Lcom/megazone/base/ui/adapter/BaseListAdapter;Ljava/util/List;Ljava/util/List;I)V", "mLoaderWeakRef", "Ljava/lang/ref/WeakReference;", "doInBackground", "voids", "", "([Ljava/lang/Void;)Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "onPostExecute", "", "diffResult", "app_debug"})
    static final class InsertDiff<T extends java.lang.Object> extends android.os.AsyncTask<java.lang.Void, java.lang.Void, androidx.recyclerview.widget.DiffUtil.DiffResult> {
        private final java.lang.ref.WeakReference<com.megazone.base.ui.adapter.BaseListAdapter<T>> mLoaderWeakRef = null;
        private final com.megazone.base.ui.adapter.BaseListAdapter<T> mAdapter = null;
        private final java.util.List<T> mOldItems = null;
        private final java.util.List<T> mNewItems = null;
        private final int mStartVersion = 0;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected androidx.recyclerview.widget.DiffUtil.DiffResult doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... voids) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.DiffUtil.DiffResult diffResult) {
        }
        
        public InsertDiff(@org.jetbrains.annotations.NotNull()
        com.megazone.base.ui.adapter.BaseListAdapter<T> mAdapter, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends T> mOldItems, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends T> mNewItems, int mStartVersion) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B;\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ!\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0014\"\u00020\u0003H\u0014\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u000fX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/megazone/base/ui/adapter/BaseListAdapter$UpdateDiff;", "T", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "mAdapter", "Lcom/megazone/base/ui/adapter/BaseListAdapter;", "mOldItems", "", "mNewItems", "", "mStartVersion", "", "(Lcom/megazone/base/ui/adapter/BaseListAdapter;Ljava/util/List;Ljava/util/List;I)V", "mLoaderWeakRef", "Ljava/lang/ref/WeakReference;", "getMLoaderWeakRef$app_debug", "()Ljava/lang/ref/WeakReference;", "doInBackground", "voids", "", "([Ljava/lang/Void;)Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "onPostExecute", "", "diffResult", "app_debug"})
    static final class UpdateDiff<T extends java.lang.Object> extends android.os.AsyncTask<java.lang.Void, java.lang.Void, androidx.recyclerview.widget.DiffUtil.DiffResult> {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.ref.WeakReference<com.megazone.base.ui.adapter.BaseListAdapter<T>> mLoaderWeakRef = null;
        private final com.megazone.base.ui.adapter.BaseListAdapter<T> mAdapter = null;
        private final java.util.List<T> mOldItems = null;
        private final java.util.List<T> mNewItems = null;
        private final int mStartVersion = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.ref.WeakReference<com.megazone.base.ui.adapter.BaseListAdapter<T>> getMLoaderWeakRef$app_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected androidx.recyclerview.widget.DiffUtil.DiffResult doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... voids) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.DiffUtil.DiffResult diffResult) {
        }
        
        public UpdateDiff(@org.jetbrains.annotations.NotNull()
        com.megazone.base.ui.adapter.BaseListAdapter<T> mAdapter, @org.jetbrains.annotations.Nullable()
        java.util.List<? extends T> mOldItems, @org.jetbrains.annotations.NotNull()
        java.util.List<T> mNewItems, int mStartVersion) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/megazone/base/ui/adapter/BaseListAdapter$Companion;", "", "()V", "MINIMUM_ITEM_COUNT", "", "TYPE_FOR_MORE_ITEMS", "TYPE_FOR_ONE_ITEM", "TYPE_FOR_PINNEDUP_ITEMS", "TYPE_FOR_SEARCH_KEYWORD", "TYPE_NONE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}