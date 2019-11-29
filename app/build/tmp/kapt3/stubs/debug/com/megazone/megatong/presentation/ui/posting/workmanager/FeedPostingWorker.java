package com.megazone.megatong.presentation.ui.posting.workmanager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/megazone/megatong/presentation/ui/posting/workmanager/FeedPostingWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "getContext", "()Landroid/content/Context;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "FeedPostingObject", "app_debug"})
public final class FeedPostingWorker extends androidx.work.CoroutineWorker {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEED_POSTING_WORK = "posting_work";
    public static final com.megazone.megatong.presentation.ui.posting.workmanager.FeedPostingWorker.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public FeedPostingWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters params) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/megazone/megatong/presentation/ui/posting/workmanager/FeedPostingWorker$FeedPostingObject;", "", "()V", "activity", "Lcom/megazone/megatong/presentation/ui/posting/HomePostingActivity;", "getActivity$app_debug", "()Lcom/megazone/megatong/presentation/ui/posting/HomePostingActivity;", "setActivity$app_debug", "(Lcom/megazone/megatong/presentation/ui/posting/HomePostingActivity;)V", "app_debug"})
    public static final class FeedPostingObject {
        @org.jetbrains.annotations.NotNull()
        public static com.megazone.megatong.presentation.ui.posting.HomePostingActivity activity;
        public static final com.megazone.megatong.presentation.ui.posting.workmanager.FeedPostingWorker.FeedPostingObject INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.megazone.megatong.presentation.ui.posting.HomePostingActivity getActivity$app_debug() {
            return null;
        }
        
        public final void setActivity$app_debug(@org.jetbrains.annotations.NotNull()
        com.megazone.megatong.presentation.ui.posting.HomePostingActivity p0) {
        }
        
        private FeedPostingObject() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/megazone/megatong/presentation/ui/posting/workmanager/FeedPostingWorker$Companion;", "", "()V", "FEED_POSTING_WORK", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}