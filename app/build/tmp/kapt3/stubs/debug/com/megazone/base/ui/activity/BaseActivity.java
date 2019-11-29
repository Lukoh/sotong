package com.megazone.base.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001]B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0016\u0010+\u001a\u0004\u0018\u00010\u00052\n\u0010,\u001a\u0006\u0012\u0002\b\u00030-H\u0004J\u0012\u0010+\u001a\u0004\u0018\u00010\u00052\u0006\u0010.\u001a\u00020/H\u0004J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0014J\b\u00104\u001a\u000201H\u0014J\u0010\u00105\u001a\u0002012\u0006\u00106\u001a\u000207H\u0017J\u0010\u00108\u001a\u00020\u00142\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u000201H\u0014J\b\u0010<\u001a\u000201H\u0014J\b\u0010=\u001a\u000201H\u0016J\u0006\u0010>\u001a\u00020\u0014J\b\u0010?\u001a\u000201H\u0014J\b\u0010@\u001a\u000201H$J\u001d\u0010A\u001a\u0002012\u0006\u0010)\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u00a2\u0006\u0002\bBJ\u001d\u0010C\u001a\u0002012\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0012H\u0000\u00a2\u0006\u0002\bGJ\u001d\u0010C\u001a\u0002012\u0006\u0010D\u001a\u00020H2\u0006\u0010F\u001a\u00020\u0012H\u0000\u00a2\u0006\u0002\bGJ\u001d\u0010C\u001a\u0002012\u0006\u0010D\u001a\u00020I2\u0006\u0010F\u001a\u00020\u0012H\u0000\u00a2\u0006\u0002\bGJ-\u0010J\u001a\u0002012\u0006\u0010D\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u001c2\u0006\u0010O\u001a\u00020\u0014H\u0000\u00a2\u0006\u0002\bPJ-\u0010J\u001a\u0002012\u0006\u0010D\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010Q\u001a\u00020/2\u0006\u0010O\u001a\u00020\u0014H\u0000\u00a2\u0006\u0002\bPJ\u001d\u0010J\u001a\u0002012\u0006\u0010D\u001a\u00020K2\u0006\u0010R\u001a\u00020/H\u0000\u00a2\u0006\u0002\bPJ%\u0010S\u001a\u0002012\u0006\u0010T\u001a\u00020\u00002\u0006\u0010U\u001a\u00020E2\u0006\u0010V\u001a\u00020/H\u0000\u00a2\u0006\u0002\bWJ\u0012\u0010X\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0014J \u0010Y\u001a\u0004\u0018\u00010\u00052\n\u0010,\u001a\u0006\u0012\u0002\b\u00030-2\b\b\u0001\u0010Z\u001a\u00020\u0012H\u0004J+\u0010Y\u001a\u0002012\n\u0010,\u001a\u0006\u0012\u0002\b\u00030-2\b\b\u0001\u0010Z\u001a\u00020\u00122\u0006\u0010[\u001a\u00020\u0014H\u0000\u00a2\u0006\u0002\b\\R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0012X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0012X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010#\"\u0004\b(\u0010%R\u000e\u0010)\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006^"}, d2 = {"Lcom/megazone/base/ui/activity/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldagger/android/HasAndroidInjector;", "()V", "activeFragment", "Landroidx/fragment/app/Fragment;", "currentActivity", "Landroid/app/Activity;", "dispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "glideRequestManager", "Lcom/bumptech/glide/RequestManager;", "height", "", "isNetworkAvailable", "", "isNetworkAvailable$app_debug", "()Z", "setNetworkAvailable$app_debug", "(Z)V", "isResumed", "newFragment", "photo", "Landroid/graphics/Bitmap;", "getPhoto$app_debug", "()Landroid/graphics/Bitmap;", "setPhoto$app_debug", "(Landroid/graphics/Bitmap;)V", "photoHeight", "getPhotoHeight$app_debug", "()I", "setPhotoHeight$app_debug", "(I)V", "photoWidth", "getPhotoWidth$app_debug", "setPhotoWidth$app_debug", "width", "androidInjector", "getFragment", "cls", "Ljava/lang/Class;", "tag", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEvent", "event", "Lcom/megazone/base/ui/action/ActivityStackClearEvent;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onStart", "resumed", "setActionBar", "setContentView", "setFixedImageSize", "setFixedImageSize$app_debug", "setFontTypeface", "view", "Landroid/widget/TextView;", "type", "setFontTypeface$app_debug", "Landroidx/appcompat/widget/AppCompatButton;", "Landroidx/appcompat/widget/AppCompatTextView;", "setImageDraw", "Landroidx/appcompat/widget/AppCompatImageView;", "layout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "bitmap", "skipCache", "setImageDraw$app_debug", "path", "url", "setSpan", "activity", "textView", "description", "setSpan$app_debug", "setViews", "transactFragment", "containerViewId", "allowAddition", "transactFragment$app_debug", "Companion", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements dagger.android.HasAndroidInjector {
    private boolean isResumed;
    private int width;
    private int height;
    private com.bumptech.glide.RequestManager glideRequestManager;
    
    /**
     * Return currently set Activity
     *
     * @return The currently set Activity
     */
    private android.app.Activity currentActivity;
    private androidx.fragment.app.Fragment newFragment;
    private androidx.fragment.app.Fragment activeFragment;
    
    /**
     * Check if the network is available
     *
     * @return return true if the network is available
     */
    private boolean isNetworkAvailable;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Bitmap photo;
    private int photoWidth;
    private int photoHeight;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<java.lang.Object> dispatchingAndroidInjector;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTO_SANS_KR_BOLD = "fonts/NotoSansKR-Bold-Hestia.otf";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTO_SANS_KR_MEDIUM = "fonts/NotoSansKR-Medium-Hestia.otf";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTO_SANS_KR_REGULAR = "fonts/NotoSansKR-Regular-Hestia.otf";
    public static final int FONT_TYPE_BOLD = 0;
    public static final int FONT_TYPE_MEDIUM = 1;
    public static final int FONT_TYPE_REGULAR = 2;
    public static final com.megazone.base.ui.activity.BaseActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isNetworkAvailable$app_debug() {
        return false;
    }
    
    public final void setNetworkAvailable$app_debug(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getPhoto$app_debug() {
        return null;
    }
    
    public final void setPhoto$app_debug(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap p0) {
    }
    
    public final int getPhotoWidth$app_debug() {
        return 0;
    }
    
    public final void setPhotoWidth$app_debug(int p0) {
    }
    
    public final int getPhotoHeight$app_debug() {
        return 0;
    }
    
    public final void setPhotoHeight$app_debug(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<java.lang.Object> getDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<java.lang.Object> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<java.lang.Object> androidInjector() {
        return null;
    }
    
    /**
     * Return true if this activity is resumed
     *
     * @return true if this activity is resumed
     */
    public final boolean resumed() {
        return false;
    }
    
    /**
     * Initialize the ActionBar and set options into it.
     *
     * @see ActionBar
     */
    protected void setActionBar() {
    }
    
    /**
     * Set the activity content from a layout resource.  The resource will be
     * inflated, adding all top-level views to the activity.
     *
     *
     * All activity must implement this method to get the resource inflated like below example:
     *
     * Example :
     * @@Override
     * public void setContentView() {
     * setContentView(R.layout.activity_gallery);
     * }
     *
     *
     * @see .setContentView
     */
    protected abstract void setContentView();
    
    /**
     * Initialize all views to set into the activity.
     *
     *
     * The activity which has no Fragment must override this method to set all views
     * into the activity.
     *
     *
     * @param savedInstanceState If the activity is being re-initialized after
     * previously being shut down then this Bundle contains the data it most
     * recently supplied in [.onSaveInstanceState].  ***Note: Otherwise it is null.***
     */
    protected void setViews(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Add a new fragment that is added a fragment to the activity state and hides an existing fragment,
     * shows a previously hidden fragment or new fragment
     *
     * @param cls the component class that is to be used for BaseActivity
     * @param containerViewId Identifier of the container whose fragment(s) are to be replaced.
     */
    @org.jetbrains.annotations.Nullable()
    protected final androidx.fragment.app.Fragment transactFragment(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> cls, @androidx.annotation.IdRes()
    int containerViewId) {
        return null;
    }
    
    /**
     * Replace an existing fragment that was add to a container or add a new fragment that is added
     * a fragment to the activity state.
     *
     * @param cls the component class that is to be used for BaseActivity
     * @param containerViewId Identifier of the container whose fragment(s) are to be replaced.
     * @param allowAddition Add a fragment to the activity state if allowAddition is true
     *                     Replace an existing fragment that was add to a container if allowAddition is false
     */
    public final void transactFragment$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> cls, @androidx.annotation.IdRes()
    int containerViewId, boolean allowAddition) {
    }
    
    /**
     * Sets the typeface and style in which the text should be displayed
     *
     * @param view the AppCompatTextView in which should be set the typeface
     * @param type the Font type
     */
    public final void setFontTypeface$app_debug(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, int type) {
    }
    
    /**
     * Sets the typeface and style in which the text should be displayed
     *
     * @param view the AppCompatTextView in which should be set the typeface
     * @param type the Font type
     */
    public final void setFontTypeface$app_debug(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView view, int type) {
    }
    
    /**
     * Sets the typeface and style in which the text should be displayed
     *
     * @param view the AppCompatTextView in AppCompatButton in which should be set the typeface
     * @param type the Font type
     */
    public final void setFontTypeface$app_debug(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatButton view, int type) {
    }
    
    /**
     * Sets the fixed with and height to the AppCompatImageView
     *
     * @param height the fixed height
     * @param width the fixed width
     */
    public final void setFixedImageSize$app_debug(int width, int height) {
    }
    
    public final void setImageDraw$app_debug(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView view, @org.jetbrains.annotations.NotNull()
    androidx.constraintlayout.widget.ConstraintLayout layout, @org.jetbrains.annotations.NotNull()
    java.lang.String path, boolean skipCache) {
    }
    
    /**
     * Draw the photo as Bitmap-Format into the given AppCompatImageView
     *
     * @param view the AppCompatImageView which is provided to be drawn the bitmap
     * @param layout the ConstraintLayout to which is applied the constraints
     * @param bitmap the bitmap to be drawn in the AppCompatImageView
     * @param skipCache True to allow the resource to skip the memory cache
     */
    public final void setImageDraw$app_debug(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView view, @org.jetbrains.annotations.NotNull()
    androidx.constraintlayout.widget.ConstraintLayout layout, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, boolean skipCache) {
    }
    
    /**
     * Draw the photo as Bitmap-Format into the given AppCompatImageView
     *
     * @param view the AppCompatImageView which is provided to be drawn the bitmap
     * @param url the url of photo to be loaded into the AppCompatImageView
     */
    public final void setImageDraw$app_debug(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public final void setSpan$app_debug(@org.jetbrains.annotations.NotNull()
    com.megazone.base.ui.activity.BaseActivity activity, @org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
    }
    
    /**
     * Return previously set Fragment with given the component class.
     *
     * @param cls The previously set the component class that is to be used for BaseActivity.
     *
     * @return The previously set Fragment
     */
    @org.jetbrains.annotations.Nullable()
    protected final androidx.fragment.app.Fragment getFragment(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> cls) {
        return null;
    }
    
    /**
     * Return previously set Fragment with given the tag.
     *
     * @param tag The previously set the component class tag that is to be used for BaseActivity.
     *
     * @return The previously set Fragment
     */
    @org.jetbrains.annotations.Nullable()
    protected final androidx.fragment.app.Fragment getFragment(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onEvent(@org.jetbrains.annotations.NotNull()
    com.megazone.base.ui.action.ActivityStackClearEvent event) {
    }
    
    public BaseActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/megazone/base/ui/activity/BaseActivity$Companion;", "", "()V", "FONT_TYPE_BOLD", "", "FONT_TYPE_MEDIUM", "FONT_TYPE_REGULAR", "NOTO_SANS_KR_BOLD", "", "NOTO_SANS_KR_MEDIUM", "NOTO_SANS_KR_REGULAR", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}