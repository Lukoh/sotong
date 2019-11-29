package com.megazone.megatong.presentation.vm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/megazone/megatong/presentation/vm/BaseViewModel;", "P", "T", "Landroidx/lifecycle/ViewModel;", "()V", "setParam", "", "params", "(Ljava/lang/Object;)V", "app_debug"})
public abstract class BaseViewModel<P extends java.lang.Object, T extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    
    public abstract void setParam(P params);
    
    public BaseViewModel() {
        super();
    }
}