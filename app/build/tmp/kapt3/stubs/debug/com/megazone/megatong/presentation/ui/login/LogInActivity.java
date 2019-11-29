package com.megazone.megatong.presentation.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 72\u00020\u0001:\u00017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0016\u0010\u001d\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001fH\u0002J1\u0010 \u001a\u00020!2\u001e\b\u0004\u0010\"\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170$\u0012\u0006\u0012\u0004\u0018\u00010%0#H\u0082\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\"\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0012\u0010-\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020\u0017H\u0015J\b\u00101\u001a\u00020\u0017H\u0016J\b\u00102\u001a\u00020\u0017H\u0014J\u0012\u00103\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0010\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u001cH\u0002J\b\u00106\u001a\u00020\u0017H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00068"}, d2 = {"Lcom/megazone/megatong/presentation/ui/login/LogInActivity;", "Lcom/megazone/base/ui/activity/BaseActivity;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "googleApiClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "job", "Lkotlinx/coroutines/CompletableJob;", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "userViewModel", "Lcom/megazone/megatong/presentation/vm/login/UserViewModel;", "getUserViewModel", "()Lcom/megazone/megatong/presentation/vm/login/UserViewModel;", "setUserViewModel", "(Lcom/megazone/megatong/presentation/vm/login/UserViewModel;)V", "doQuery", "Lcom/megazone/megatong/data/datasource/model/cache/entity/Query;", "query", "user", "Lcom/megazone/megatong/data/datasource/model/cache/entity/user/User;", "firebaseAuthWithGoogle", "", "acct", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "goToHome", "userId", "", "handleSignInResult", "completedTask", "Lcom/google/android/gms/tasks/Task;", "launchWork", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "setContentView", "setViews", "showMessage", "message", "signIn", "Companion", "app_debug"})
public final class LogInActivity extends com.megazone.base.ui.activity.BaseActivity {
    private com.google.firebase.auth.FirebaseAuth auth;
    private com.google.android.gms.auth.api.signin.GoogleSignInClient googleApiClient;
    private final kotlinx.coroutines.CompletableJob job = null;
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.megazone.megatong.presentation.vm.login.UserViewModel userViewModel;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SNS_NAME_GOOGLE = "GOOGLE";
    private static final int RC_SIGN_IN = 9001;
    public static final com.megazone.megatong.presentation.ui.login.LogInActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.megazone.megatong.presentation.vm.login.UserViewModel getUserViewModel() {
        return null;
    }
    
    public final void setUserViewModel(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.presentation.vm.login.UserViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setContentView() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void setViews(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void handleSignInResult(com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> completedTask) {
    }
    
    private final void goToHome(java.lang.String userId) {
    }
    
    private final void showMessage(java.lang.String message) {
    }
    
    private final void signIn() {
    }
    
    private final void firebaseAuthWithGoogle(com.google.android.gms.auth.api.signin.GoogleSignInAccount acct) {
    }
    
    private final com.megazone.megatong.data.datasource.model.cache.entity.Query doQuery(com.megazone.megatong.data.datasource.model.cache.entity.Query query, com.megazone.megatong.data.datasource.model.cache.entity.user.User user) {
        return null;
    }
    
    /**
     * Helper function to call something doing function
     *
     * By marking `block` as `suspend` this creates a suspend lambda which can call suspend
     * functions.
     *
     * @param block lambda to actually do some work. It is called in the defaultScope.
     *             lambda the some work will do
     */
    private final kotlinx.coroutines.Job launchWork(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    public LogInActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/megazone/megatong/presentation/ui/login/LogInActivity$Companion;", "", "()V", "RC_SIGN_IN", "", "SNS_NAME_GOOGLE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}