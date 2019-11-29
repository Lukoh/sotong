package com.megazone.megatong.domain.usecase;

import java.lang.System;

/**
 * Executes business logic in its execute method and keep posting updates to the result as
 * [Result<R>].
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/megazone/megatong/domain/usecase/BaseUseCase;", "P", "T", "", "()V", "execute", "Landroidx/lifecycle/LiveData;", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "parameters", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "app_debug"})
public abstract class BaseUseCase<P extends java.lang.Object, T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<T> execute(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope viewModelScope, P parameters);
    
    public BaseUseCase() {
        super();
    }
}