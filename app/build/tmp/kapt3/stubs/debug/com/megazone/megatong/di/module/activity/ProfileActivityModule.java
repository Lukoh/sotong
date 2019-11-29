package com.megazone.megatong.di.module.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H!\u00a2\u0006\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/megazone/megatong/di/module/activity/ProfileActivityModule;", "", "()V", "contributeProfileActivity", "Lcom/megazone/megatong/presentation/ui/profile/ProfileActivity;", "contributeProfileActivity$app_debug", "app_debug"})
@dagger.Module()
public abstract class ProfileActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.megazone.megatong.di.module.fragment.ProfileFragmentBuilderModule.class})
    public abstract com.megazone.megatong.presentation.ui.profile.ProfileActivity contributeProfileActivity$app_debug();
    
    public ProfileActivityModule() {
        super();
    }
}