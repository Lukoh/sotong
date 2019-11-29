package com.megazone.base.common.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0017J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0017H\u0007J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0004J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u000fH\u0002J\u0016\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020.H\u0007J9\u0010/\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u00010\u00042\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u000102H\u0002\u00a2\u0006\u0002\u00103J\u000e\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u000206J\u001d\u00107\u001a\u00020\u00042\u0006\u0010 \u001a\u0002082\u0006\u00109\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b:J\u000e\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u000206J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0007J\u001a\u0010>\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0007J\b\u0010?\u001a\u00020\u0006H\u0007J\u0010\u0010@\u001a\u00020\r2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010A\u001a\u00020\r2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010B\u001a\u00020\r2\u0006\u0010+\u001a\u00020,H\u0002J\u0016\u0010C\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*2\u0006\u0010D\u001a\u00020\u0004J\u0016\u0010E\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0006J\u0012\u0010H\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u001e\u0010I\u001a\u00020\u00122\u0006\u0010 \u001a\u0002082\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0006J\u001c\u0010K\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u00172\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00120NR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006O"}, d2 = {"Lcom/megazone/base/common/utils/CommonUtils;", "", "()V", "CHANNEL_ID", "", "MAX_SCROLL", "", "NOTIFICATION_ID", "NOTIFICATION_TITLE", "", "VERBOSE_NOTIFICATION_CHANNEL_DESCRIPTION", "VERBOSE_NOTIFICATION_CHANNEL_NAME", "areDrawablesIdentical", "", "source", "Landroid/graphics/drawable/Drawable;", "target", "betterSmoothScrollToPosition", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "targetItem", "convertDateToLong", "", "text", "convertDateToString", "datestamp", "convertTime", "time", "dismissKeyboard", "windowToken", "Landroid/os/IBinder;", "activity", "Landroidx/fragment/app/FragmentActivity;", "fail", "", "message", "getBitmap", "Landroid/graphics/Bitmap;", "drawable", "getBitmapFromUri", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "getCurrentDateTime", "Ljava/util/Date;", "getDataColumn", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getFirstVisibleItem", "firstVisibleItemPositions", "", "getJson", "Landroid/app/Activity;", "mock", "getJson$app_debug", "getLastVisibleItem", "lastVisibleItemPositions", "getPackageName", "getPathFromUri", "getVersionNumber", "isDownloadsDocument", "isExternalStorageDocument", "isMediaDocument", "makeStatusNotification", "msg", "rand", "from", "to", "removeLastCharRegex", "showToastMessage", "duration", "withDelay", "delay", "block", "Lkotlin/Function0;", "app_debug"})
public final class CommonUtils {
    private static final int MAX_SCROLL = 10;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.CharSequence VERBOSE_NOTIFICATION_CHANNEL_NAME = null;
    private static final java.lang.String VERBOSE_NOTIFICATION_CHANNEL_DESCRIPTION = "Shows notifications whenever work starts";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.CharSequence NOTIFICATION_TITLE = null;
    private static final java.lang.String CHANNEL_ID = "VERBOSE_NOTIFICATION";
    private static final int NOTIFICATION_ID = 1;
    public static final com.megazone.base.common.utils.CommonUtils INSTANCE = null;
    
    public final void showToastMessage(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"TimberArgCount"})
    public final java.lang.String getPackageName(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final long convertDateToLong(@org.jetbrains.annotations.NotNull()
    java.lang.String text) throws java.text.ParseException {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String convertDateToString(long datestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    public final java.util.Date getCurrentDateTime() {
        return null;
    }
    
    public final void dismissKeyboard(@org.jetbrains.annotations.NotNull()
    android.os.IBinder windowToken, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentActivity activity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String convertTime(long time) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    public final int getVersionNumber() {
        return 0;
    }
    
    public final boolean areDrawablesIdentical(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable source, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable target) {
        return false;
    }
    
    public final void betterSmoothScrollToPosition(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int targetItem) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Void fail(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    public final void withDelay(long delay, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    private final android.graphics.Bitmap getBitmap(android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJson$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String mock) {
        return null;
    }
    
    public final int getLastVisibleItem(@org.jetbrains.annotations.NotNull()
    int[] lastVisibleItemPositions) {
        return 0;
    }
    
    public final int getFirstVisibleItem(@org.jetbrains.annotations.NotNull()
    int[] firstVisibleItemPositions) {
        return 0;
    }
    
    public final int rand(int from, int to) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String removeLastCharRegex(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getBitmapFromUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) throws java.io.IOException {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"NewApi"})
    public final java.lang.String getPathFromUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    private final java.lang.String getDataColumn(android.content.Context context, android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) {
        return null;
    }
    
    private final boolean isExternalStorageDocument(android.net.Uri uri) {
        return false;
    }
    
    private final boolean isDownloadsDocument(android.net.Uri uri) {
        return false;
    }
    
    private final boolean isMediaDocument(android.net.Uri uri) {
        return false;
    }
    
    public final void makeStatusNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    private CommonUtils() {
        super();
    }
}