package com.megazone.megatong.presentation.caller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\tJ\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004J&\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/megazone/megatong/presentation/caller/Caller;", "", "()V", "EXTRA_FEED_ID", "", "EXTRA_FEED_POSTING_START_TYPE", "EXTRA_HOME_BOTTOM_MENU_ID", "EXTRA_USER_ID", "FEED_POSTING_CREATED_RESULT", "", "FEED_POSTING_CREATE_REQUEST", "FEED_POSTING_NONE_RESULT", "FEED_POSTING_UPDATED_RESULT", "FEED_POSTING_UPDATE_REQUEST", "REQUEST_NONE", "callFeedPosting", "", "context", "Landroid/content/Context;", "userId", "feedId", "requestCode", "callHome", "callLogIn", "callProfile", "createIntent", "Landroid/content/Intent;", "cls", "Ljava/lang/Class;", "isNewTask", "", "app_debug"})
public final class Caller {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_HOME_BOTTOM_MENU_ID = "megatong:home_bottom_menu_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_USER_ID = "megatong:userid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_FEED_POSTING_START_TYPE = "megatong:posting_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_FEED_ID = "megatong:feedid";
    public static final int REQUEST_NONE = -1;
    public static final int FEED_POSTING_CREATE_REQUEST = 1000;
    public static final int FEED_POSTING_UPDATE_REQUEST = 1001;
    public static final int FEED_POSTING_CREATED_RESULT = 2000;
    public static final int FEED_POSTING_UPDATED_RESULT = 2001;
    public static final int FEED_POSTING_NONE_RESULT = 2002;
    public static final com.megazone.megatong.presentation.caller.Caller INSTANCE = null;
    
    private final android.content.Intent createIntent(android.content.Context context, java.lang.Class<?> cls, boolean isNewTask) {
        return null;
    }
    
    public final void callLogIn(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void callHome(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    public final void callFeedPosting(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String feedId, int requestCode) {
    }
    
    public final void callProfile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    private Caller() {
        super();
    }
}