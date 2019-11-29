package com.megazone.base.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b&\u0018\u0000 c*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002cdB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020\"H\u0004J\f\u0010(\u001a\u0006\u0012\u0002\b\u00030)H$J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020-H\u0014J\n\u0010.\u001a\u0004\u0018\u00010&H$J\b\u0010/\u001a\u000200H$J\b\u00101\u001a\u00020\"H\u0002J\b\u00102\u001a\u00020\u000eH&J\u0010\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u0007H\u0004J&\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010=\u001a\u00020\"2\u0006\u0010>\u001a\u00020\u0007H&J\u0010\u0010?\u001a\u00020\"2\u0006\u0010>\u001a\u00020\u0007H&J\b\u0010@\u001a\u00020\"H\u0016J\b\u0010A\u001a\u00020\"H\u0016J\u0016\u0010B\u001a\u00020\"2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000CH&J\u001a\u0010D\u001a\u00020\"2\u0006\u0010E\u001a\u0002062\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010F\u001a\u00020\"2\u0006\u0010G\u001a\u00020\u0007H\u0002J\b\u0010H\u001a\u00020\"H$J\u0010\u0010I\u001a\u00020\"2\u0006\u0010J\u001a\u00020\u000eH\u0004J\b\u0010K\u001a\u00020\"H\u0002J\u0010\u0010L\u001a\u00020\"2\u0006\u0010M\u001a\u00020\u000eH\u0002J\u0010\u0010N\u001a\u00020\"2\u0006\u0010O\u001a\u00020\u000eH$J\b\u0010P\u001a\u00020\"H\u0002J\b\u0010Q\u001a\u00020\"H\u0004J\u0010\u0010R\u001a\u00020\"2\u0006\u0010S\u001a\u00020\u000eH\u0004J\u0010\u0010T\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u0010U\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010V\u001a\u00020\"H\u0002J\b\u0010W\u001a\u00020\"H\u0002J\b\u0010X\u001a\u00020\"H\u0002J\u0010\u0010Y\u001a\u00020\"2\u0006\u0010Z\u001a\u00020[H\u0005J\b\u0010\\\u001a\u00020\"H\u0002J\u0010\u0010\\\u001a\u00020\"2\u0006\u0010]\u001a\u00020^H\u0007J\b\u0010_\u001a\u00020\"H\u0002J\u0010\u0010_\u001a\u00020\"2\u0006\u0010]\u001a\u00020^H\u0007J\u000e\u0010`\u001a\u00020\"2\u0006\u0010a\u001a\u00020\u000eJ\b\u0010b\u001a\u00020\"H$R\u0014\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00078DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007@DX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010 \u00a8\u0006e"}, d2 = {"Lcom/megazone/base/ui/fragment/RecyclerFragment;", "T", "Lcom/megazone/base/ui/fragment/BaseFragment;", "()V", "baseArrayAdapter", "Lcom/megazone/base/ui/adapter/BaseListAdapter;", "<set-?>", "", "currentPage", "getCurrentPage", "()I", "firstCompletelyVisibleItem", "getFirstCompletelyVisibleItem", "isLoading", "", "isUpdated", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "itemTouchHelperEnabled", "items", "Ljava/util/ArrayList;", "lastCompletelyVisibleItem", "getLastCompletelyVisibleItem", "lastVisibleItem", "getLastVisibleItem", "listener", "Lcom/megazone/base/ui/fragment/RecyclerFragment$OnProcessListener;", "onScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "totalPage", "getTotalPage", "setTotalPage", "(I)V", "addItemDecorations", "", "addItemTouchListener", "attachItemTouchHelperToRecyclerView", "callback", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "clear", "createAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "createItemAnimator", "Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;", "createItemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "createItemTouchHelper", "createLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "doScrollSateIdle", "isItemDecorationVisible", "isLastPage", "pageNum", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFirstVisibleItem", "position", "onLastVisibleItem", "onPause", "onResume", "onSorted", "", "onViewCreated", "view", "reachToEndPage", "page", "reachToLastPage", "refresh", "refreshed", "removeScrollListener", "request", "isRefreshed", "requestData", "isNew", "requestUpdate", "scrollToEndPage", "setItemHasFixedSize", "hasFixedSize", "setItemTouchHelper", "setOnProcessListener", "setScrollListener", "setViews", "setupSwipeLayout", "startDrag", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "stopLoading", "delayMillis", "", "stopMoreLoading", "stopRefreshing", "isPagedList", "updateData", "Companion", "OnProcessListener", "app_debug"})
public abstract class RecyclerFragment<T extends java.lang.Object> extends com.megazone.base.ui.fragment.BaseFragment {
    private com.megazone.base.ui.adapter.BaseListAdapter<?> baseArrayAdapter;
    private com.megazone.base.ui.fragment.RecyclerFragment.OnProcessListener listener;
    private androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper;
    private boolean itemTouchHelperEnabled;
    private boolean isLoading;
    private boolean isUpdated;
    
    /**
     * Set the total page count
     *
     * @param totalPage The total page count
     */
    private int totalPage;
    
    /**
     * Gets current page
     *
     * @return current page
     */
    private int currentPage;
    private final java.util.ArrayList<T> items = null;
    private androidx.recyclerview.widget.RecyclerView.OnScrollListener onScrollListener;
    private static final int FIRST_PAGE = 1;
    public static final long STOP_LOADING_TIME0UT = 600L;
    public static final long STOP_ADDING_TIMEOUT = 100L;
    public static final long STOP_REFRESHING_PROMPT_TIMEOUT = 1L;
    public static final long STOP_REFRESHING_TIMEOUT = 500L;
    public static final long STOP_UPDATE_TIMEOUT = 1000L;
    public static final long SCROLL_TO_FIRST_TIMEOUT = 1400L;
    public static final int LAYOUT_TYPE_LINEAR = 0;
    public static final int LAYOUT_TYPE_GRID = 1;
    public static final int LAYOUT_TYPE_STAGGEREDGRID = 2;
    public static final int MSG_TYPE_NO_RESULT = 0;
    public static final int MSG_TYPE_ERROR = 1;
    public static final com.megazone.base.ui.fragment.RecyclerFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    protected final int getTotalPage() {
        return 0;
    }
    
    protected final void setTotalPage(int totalPage) {
    }
    
    public final int getCurrentPage() {
        return 0;
    }
    
    protected final int getLastVisibleItem() {
        return 0;
    }
    
    private final int getFirstCompletelyVisibleItem() {
        return 0;
    }
    
    private final int getLastCompletelyVisibleItem() {
        return 0;
    }
    
    /**
     * Check if the DividerItemDecoration is visible.
     *
     *
     *
     * To check if the given page is the last page, you must override
     * This method is called in [.onViewCreated].
     *
     *
     * @return true if the ItemDecoration in [RecyclerView] must be visible
     */
    public abstract boolean isItemDecorationVisible();
    
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
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void setViews() {
    }
    
    private final void request(boolean isRefreshed) {
    }
    
    private final void requestUpdate() {
    }
    
    /**
     * An OnScrollListener can be set on a RecyclerView to receive messages
     * when a scrolling event has occurred on that RecyclerView.
     *
     * If you are planning to have several listeners at the same time, use
     * RecyclerView#addOnScrollListener. If there will be only one listener at the time and you
     * want your components to be able to easily replace the listener use
     * RecyclerView#setOnScrollListener.
     */
    private final void setScrollListener() {
    }
    
    /**
     * Notify when the page reach to the end of tha page
     *
     * @param page ther current page
     */
    private final void reachToEndPage(int page) {
    }
    
    private final void doScrollSateIdle() {
    }
    
    /**
     * Remove a listener that was notified of any changes in scroll state or position.
     */
    private final void removeScrollListener() {
    }
    
    /**
     * Set an ItemTouchHelper that will work with the given Callback
     *
     * @param callback This is the contract between ItemTouchHelper and your application.
     * It lets you control which touch behaviors are enabled per each ViewHolder
     * and also receive callbacks when user performs these actions.
     *
     * @see ItemTouchHelper.Callback
     */
    private final void setItemTouchHelper(androidx.recyclerview.widget.ItemTouchHelper.Callback callback) {
    }
    
    /**
     * Attaches the ItemTouchHelper to the provided RecyclerView. If TouchHelper is already
     * attached to a RecyclerView, it will first detach from the previous one. You can call this
     * method with `null` to detach it from the current RecyclerView.
     *
     * @param callback This is the contract between ItemTouchHelper and your application.
     * It lets you control which touch behaviors are enabled per each ViewHolder
     * and also receive callbacks when user performs these actions.
     *
     * @return the ItemTouchHelper for attaching to the provided RecyclerView
     *
     * @see ItemTouchHelper
     */
    private final androidx.recyclerview.widget.ItemTouchHelper attachItemTouchHelperToRecyclerView(androidx.recyclerview.widget.ItemTouchHelper.Callback callback) {
        return null;
    }
    
    /**
     * Check if the given page is the last page.
     * Return true if the given page is the last page
     *
     *
     * To check if the given page is the last page, you must override
     * This method is called whenever the swipe gesture triggers a refresh.
     *
     *
     * @param pageNum the current page number to check if given page is the last page
     */
    protected final boolean isLastPage(int pageNum) {
        return false;
    }
    
    /**
     * RecyclerView can perform several optimizations if it can know in advance that changes in
     * mainAdapter content cannot change the size of the RecyclerView itself.
     * If your use of RecyclerView falls into this category, set this to true.
     *
     * @param hasFixedSize true if mainAdapter changes cannot affect the size of the RecyclerView.
     * setItemHasFixedSize(true) means the RecyclerView has children (items)
     * that has fixed width and
     */
    protected final void setItemHasFixedSize(boolean hasFixedSize) {
    }
    
    /**
     * Add an [ItemDecoration] to this RecyclerView. SnapItem decorations can
     * affect both measurement and drawing of individual item views.
     *
     *
     * SnapItem decorations are ordered. Decorations placed earlier in the list will
     * be run/queried/drawn first for their effects on item views. Padding added to views
     * will be nested; a padding added by an earlier decoration will mean further
     * item decorations in the list will be asked to draw/pad within the previous decoration's
     * given area.
     */
    private final void addItemDecorations() {
    }
    
    /**
     * Add the touch listener on RecyclerView
     */
    private final void addItemTouchListener() {
    }
    
    /**
     * Sets the [SwipeRefreshLayout]'s setting that this RecyclerFragment will use.
     *
     *
     *
     * To set the [SwipeRefreshLayout]'s more setting, you must override
     */
    private final void setupSwipeLayout() {
    }
    
    /**
     * Create the [LayoutManager] that this RecyclerFragment will use.
     *
     *
     *
     * To set the [LayoutManager] to provide RecyclerFragment, you must override
     *
     *
     *
     * In contrast to other mainAdapter-backed views such as [android.widget.ListView]
     * or [android.widget.GridView], RecyclerFragment allows client code to provide custom
     * layout arrangements for child views. These arrangements are controlled by the
     * [LayoutManager]. A LayoutManager must be provided for RecyclerFragment to function.
     *
     *
     * Several default strategies are provided for common uses such as lists and grids.
     *
     * @return LayoutManager to use
     *
     * If you'd like to use GridLayout, you have to override this setLayoutManager method
     * in your fragment as below example:
     *
     * Example
     * @@Override
     * protected RecyclerView.LayoutManager setLayoutManager() {
     * return new GridLayoutManager(activity, 1);
     * }
     * or to use LinearLayout, you have to override this setLayoutManager method
     * in your fragment as below:
     *
     * @@Override
     * protected RecyclerView.LayoutManager setLayoutManager() {
     * return new LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
     * }
     */
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.recyclerview.widget.RecyclerView.LayoutManager createLayoutManager();
    
    /**
     * Create the ItemDecoration.
     *
     * An ItemDecoration allows the application to add a special drawing and layout offset
     * to specific item views from the mainAdapter's data set. This can be useful for drawing dividers
     * between items, highlights, visual grouping boundaries and more.
     *
     *
     * All ItemDecorations are drawn in the order item were added.
     */
    @org.jetbrains.annotations.NotNull()
    protected androidx.recyclerview.widget.RecyclerView.ItemDecoration createItemDecoration() {
        return null;
    }
    
    /**
     * Starts dragging the provided ViewHolder.
     *
     * @param viewHolder The ViewHolder to start dragging. It must be a direct child of
     * RecyclerView.
     */
    protected final void startDrag(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
    
    /**
     * This implementation of [RecyclerView.ItemAnimator] provides basic
     * animations on remove, add, and move events that happen to the items in
     * a RecyclerView. RecyclerView uses a DefaultItemAnimator by default.
     *
     * @return The ItemAnimator for the animations that take place on items as changes are made
     * to the mainAdapter.
     *
     * @see RecyclerView.setItemAnimator
     */
    private final androidx.recyclerview.widget.RecyclerView.ItemAnimator createItemAnimator() {
        return null;
    }
    
    /**
     * Create a new mainAdapter to provide child views on demand.
     *
     *
     * To set a new mainAdapter to provide child views on demand, you must override
     *
     *
     *
     * When mainAdapter is changed, all existing views are recycled back to the pool. If the pool has
     * only one mainAdapter, it will be cleared.
     *
     * @return The new mainAdapter to set, or null to set no mainAdapter.
     */
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.recyclerview.widget.RecyclerView.Adapter<?> createAdapter();
    
    /**
     * Attach an ItemTouchHelper to the provided RecyclerView.
     *
     *
     * To attach an ItemTouchHelper to the provided RecyclerView, you must override.
     *
     *
     * @return The callback which is the contract between ItemTouchHelper and your application.
     * It lets you control which touch behaviors are enabled per each ViewHolder
     * and also receive callbacks when user performs these actions.
     *
     * return null if you don't want to attach an ItemTouchHelper to provided RecyclerView.
     */
    @org.jetbrains.annotations.Nullable()
    protected abstract androidx.recyclerview.widget.ItemTouchHelper.Callback createItemTouchHelper();
    
    /**
     * RequestClient to get the information or images from server.
     *
     *
     * To request information or data to Web server, you must override
     * This method is called whenever the mainAdapter position of the last visible view is to last item on the list.
     *
     *
     * Don't implement any code in this overridden method if you don't like to request any information
     * or data to Web server.
     *
     * @param isNew set to true to request new information or images, or false
     */
    protected abstract void requestData(boolean isNew);
    
    /**
     * RequestClient to get the updated information or images from server.
     *
     *
     * To request information or data to Web server, you must override
     * This method is called whenever the swipe gesture triggers a refresh.
     */
    protected abstract void updateData();
    
    /**
     * Notify when the end of the page is reached
     */
    protected abstract void reachToLastPage();
    
    /**
     * Notify when the current items are sorted
     *
     * @param items the sorted items
     */
    public abstract void onSorted(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items);
    
    /**
     * Callback method to be invoked to notify the first visible position when RecyclerView's scroll
     * state is idle.
     *
     * @param position the mainAdapter position of the first fully visible item on RecyclerView
     */
    public abstract void onFirstVisibleItem(int position);
    
    /**
     * Callback method to be invoked to notify the last visible position when RecyclerView's scroll
     * state is idle.
     *
     * @param position the mainAdapter position of the last fully visible item on RecyclerView
     */
    public abstract void onLastVisibleItem(int position);
    
    /**
     * The information should be refreshed whenever the RecyclerFragment is created or
     * the user refresh the contents of a view via a vertical swipe gesture.
     *
     * <P> Must.
     * This method have to be called in override onViewCreated[.onViewCreated] method
     * to get the information from server.
     *   </P> *
     *
     *
     *
     * Be refreshed as a result of the gesture in case a vertical swipe gesture.
     * The information must be provided to allow refresh of the content wherever this gesture
     * is used in case of a vertical swipe gesture.
     */
    protected final void refresh(boolean refreshed) {
    }
    
    /**
     * Set the scrolling is reached to last
     */
    protected final void scrollToEndPage() {
    }
    
    protected final void clear() {
    }
    
    /**
     * Stop the data-parsing processing.
     */
    public final void stopRefreshing(boolean isPagedList) {
    }
    
    private final void stopLoading() {
    }
    
    private final void stopMoreLoading() {
    }
    
    @androidx.annotation.MainThread()
    public final void stopLoading(long delayMillis) {
    }
    
    @androidx.annotation.MainThread()
    public final void stopMoreLoading(long delayMillis) {
    }
    
    /**
     * Sets the listener to be notified when a process is completed
     */
    public final void setOnProcessListener(@org.jetbrains.annotations.NotNull()
    com.megazone.base.ui.fragment.RecyclerFragment.OnProcessListener listener) {
    }
    
    public RecyclerFragment() {
        super();
    }
    
    /**
     * Classes that wish to be notified when a process is completed should implement this interfaces.
     * An OnProcessListener allows the application to intercept the process events.
     *
     *
     * This can be useful for applications that wish to implement some module
     * after the process is done.
     * /p>
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH&J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH&J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH&\u00a8\u0006\u0011"}, d2 = {"Lcom/megazone/base/ui/fragment/RecyclerFragment$OnProcessListener;", "", "onError", "", "message", "", "onScrollIdle", "position", "", "onScrollSetting", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "onScrolledToLast", "onScrolling", "app_debug"})
    public static abstract interface OnProcessListener {
        
        /**
         * This listener method to be invoked when the RecyclerView has been scrolled to the last.
         * This will be called after the scroll has completed.
         *
         *
         * This listener method will also be called if visible item range changes after a layout
         * calculation. In that case, dx and dy will be 0.
         *
         * @param recyclerView The RecyclerView which scrolled.
         * @param dx The amount of horizontal scroll.
         * @param dy The amount of vertical scroll.
         */
        public abstract void onScrolledToLast(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy);
        
        /**
         * This listener method to be invoked when scrolling is doing.
         *
         * @param recyclerView The RecyclerView which scrolled.
         * @param dx The amount of horizontal scroll.
         * @param dy The amount of vertical scroll.
         */
        public abstract void onScrolling(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy);
        
        /**
         * This listener method to be invoked when scrolling state is currently idle.
         *
         * * @param position The current position.
         */
        public abstract void onScrollIdle(int position);
        
        /**
         * This listener method to be invoked when scrolling state is currently animating to a final
         * position while not under outside control.
         */
        public abstract void onScrollSetting();
        
        /**
         * This listener method to be invoked when scrolling is done.
         *
         * @param recyclerView The RecyclerView which scrolled.
         * @param dx The amount of horizontal scroll.
         * @param dy The amount of vertical scroll.
         */
        public abstract void onScrolled(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy);
        
        public abstract void onError(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/megazone/base/ui/fragment/RecyclerFragment$Companion;", "", "()V", "FIRST_PAGE", "", "LAYOUT_TYPE_GRID", "LAYOUT_TYPE_LINEAR", "LAYOUT_TYPE_STAGGEREDGRID", "MSG_TYPE_ERROR", "MSG_TYPE_NO_RESULT", "SCROLL_TO_FIRST_TIMEOUT", "", "STOP_ADDING_TIMEOUT", "STOP_LOADING_TIME0UT", "STOP_REFRESHING_PROMPT_TIMEOUT", "STOP_REFRESHING_TIMEOUT", "STOP_UPDATE_TIMEOUT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}