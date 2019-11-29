package com.megazone.megatong.presentation.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004\u00a8\u0006\u0011"}, d2 = {"Lcom/megazone/megatong/presentation/common/SharedPreference;", "", "()V", "getSharedPreferenceItemPosition", "", "context", "Landroid/content/Context;", "getSharedPreferenceSocialLogin", "", "getSharedPreferenceTabPosition", "saveSharePreferenceItemPosition", "", "itemPosition", "saveSharePreferenceSocialLogin", "snsName", "saveSharePreferenceTabPosition", "tabPosition", "app_debug"})
public final class SharedPreference {
    public static final com.megazone.megatong.presentation.common.SharedPreference INSTANCE = null;
    
    public final void saveSharePreferenceItemPosition(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int itemPosition) {
    }
    
    public final void saveSharePreferenceTabPosition(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int tabPosition) {
    }
    
    public final void saveSharePreferenceSocialLogin(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String snsName) {
    }
    
    public final int getSharedPreferenceItemPosition(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public final int getSharedPreferenceTabPosition(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSharedPreferenceSocialLogin(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private SharedPreference() {
        super();
    }
}