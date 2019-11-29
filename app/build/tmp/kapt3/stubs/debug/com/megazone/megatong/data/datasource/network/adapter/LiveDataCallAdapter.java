package com.megazone.megatong.data.datasource.network.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u00030\u0002B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/megazone/megatong/data/datasource/network/adapter/LiveDataCallAdapter;", "R", "Lretrofit2/CallAdapter;", "Landroidx/lifecycle/LiveData;", "Lcom/megazone/megatong/data/datasource/network/response/ApiResponse;", "responseType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "errorCode", "", "adapt", "call", "Lretrofit2/Call;", "app_debug"})
public final class LiveDataCallAdapter<R extends java.lang.Object> implements retrofit2.CallAdapter<R, androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.ApiResponse<R>>> {
    private int errorCode;
    private final java.lang.reflect.Type responseType = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.reflect.Type responseType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.megazone.megatong.data.datasource.network.response.ApiResponse<R>> adapt(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<R> call) {
        return null;
    }
    
    public LiveDataCallAdapter(@org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type responseType) {
        super();
    }
}