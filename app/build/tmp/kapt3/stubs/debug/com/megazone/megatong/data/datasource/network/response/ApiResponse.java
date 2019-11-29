package com.megazone.megatong.data.datasource.network.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\u0018\u0000 \u001d*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0015\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/megazone/megatong/data/datasource/network/response/ApiResponse;", "T", "", "error", "", "(Ljava/lang/Throwable;)V", "response", "Lretrofit2/Response;", "(Lretrofit2/Response;)V", "body", "getBody$app_debug", "()Ljava/lang/Object;", "Ljava/lang/Object;", "code", "", "getCode$app_debug", "()I", "errorMessage", "", "getErrorMessage$app_debug", "()Ljava/lang/String;", "getNextPage", "getGetNextPage", "()Ljava/lang/Integer;", "isSuccessful", "", "()Z", "links", "", "Companion", "app_debug"})
public final class ApiResponse<T extends java.lang.Object> {
    private final int code = 0;
    @org.jetbrains.annotations.Nullable()
    private final T body = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String errorMessage = null;
    private final java.util.Map<java.lang.String, java.lang.String> links = null;
    private static final java.util.regex.Pattern LINK_PATTERN = null;
    private static final java.util.regex.Pattern PAGE_PATTERN = null;
    private static final java.lang.String NEXT_LINK = "next";
    public static final com.megazone.megatong.data.datasource.network.response.ApiResponse.Companion Companion = null;
    
    public final int getCode$app_debug() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getBody$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorMessage$app_debug() {
        return null;
    }
    
    public final boolean isSuccessful() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getGetNextPage() {
        return null;
    }
    
    public ApiResponse(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
        super();
    }
    
    public ApiResponse(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> response) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/megazone/megatong/data/datasource/network/response/ApiResponse$Companion;", "", "()V", "LINK_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "NEXT_LINK", "", "PAGE_PATTERN", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}