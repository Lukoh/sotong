package com.megazone.megatong.di.module.activity

import com.megazone.megatong.presentation.ui.login.LogInActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class LogInActivityModule {
    @ContributesAndroidInjector
    internal abstract fun contributeLogInActivity(): LogInActivity
}