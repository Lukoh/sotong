package com.megazone.megatong.data.datasource.network.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0018\u0010 \u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\tJ\b\u0010\"\u001a\u00020\tH\u0016J\u0010\u0010#\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\u0018\u0010$\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\tJ\b\u0010%\u001a\u00020\u0012H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006&"}, d2 = {"Lcom/megazone/megatong/data/datasource/network/response/Resource;", "", "()V", "data", "getData$app_debug", "()Ljava/lang/Object;", "setData$app_debug", "(Ljava/lang/Object;)V", "errorCode", "", "getErrorCode$app_debug", "()I", "setErrorCode$app_debug", "(I)V", "lastPage", "getLastPage$app_debug", "setLastPage$app_debug", "message", "", "getMessage$app_debug", "()Ljava/lang/String;", "setMessage$app_debug", "(Ljava/lang/String;)V", "status", "Lcom/megazone/megatong/data/datasource/network/response/Status;", "getStatus$app_debug", "()Lcom/megazone/megatong/data/datasource/network/response/Status;", "setStatus$app_debug", "(Lcom/megazone/megatong/data/datasource/network/response/Status;)V", "equals", "", "other", "error", "msg", "hashCode", "loading", "success", "toString", "app_debug"})
public final class Resource {
    @org.jetbrains.annotations.NotNull()
    public com.megazone.megatong.data.datasource.network.response.Status status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object data;
    private int lastPage;
    private int errorCode;
    
    @org.jetbrains.annotations.NotNull()
    public final com.megazone.megatong.data.datasource.network.response.Status getStatus$app_debug() {
        return null;
    }
    
    public final void setStatus$app_debug(@org.jetbrains.annotations.NotNull()
    com.megazone.megatong.data.datasource.network.response.Status p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage$app_debug() {
        return null;
    }
    
    public final void setMessage$app_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getData$app_debug() {
        return null;
    }
    
    public final void setData$app_debug(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    public final int getLastPage$app_debug() {
        return 0;
    }
    
    public final void setLastPage$app_debug(int p0) {
    }
    
    public final int getErrorCode$app_debug() {
        return 0;
    }
    
    public final void setErrorCode$app_debug(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.megazone.megatong.data.datasource.network.response.Resource success(@org.jetbrains.annotations.Nullable()
    java.lang.Object data, int lastPage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.megazone.megatong.data.datasource.network.response.Resource error(@org.jetbrains.annotations.Nullable()
    java.lang.String msg, int errorCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.megazone.megatong.data.datasource.network.response.Resource loading(@org.jetbrains.annotations.Nullable()
    java.lang.Object data) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Resource() {
        super();
    }
}