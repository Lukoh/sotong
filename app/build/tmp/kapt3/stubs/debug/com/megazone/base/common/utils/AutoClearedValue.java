package com.megazone.base.common.utils;

import java.lang.System;

/**
 * A value holder that automatically clears the reference if the Fragment's view is destroyed.
 * @param <T>
 * </T>
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0006J\r\u0010\b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\tR\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/megazone/base/common/utils/AutoClearedValue;", "T", "", "fragment", "Landroidx/fragment/app/Fragment;", "value", "(Landroidx/fragment/app/Fragment;Ljava/lang/Object;)V", "Ljava/lang/Object;", "get", "()Ljava/lang/Object;", "app_debug"})
public final class AutoClearedValue<T extends java.lang.Object> {
    private T value;
    
    @org.jetbrains.annotations.Nullable()
    public final T get() {
        return null;
    }
    
    public AutoClearedValue(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
    T value) {
        super();
    }
}