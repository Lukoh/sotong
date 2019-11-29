package com.goforer.sotong.di.module.activity

import com.goforer.sotong.presentation.ui.login.LogInActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class LogInActivityModule {
    @ContributesAndroidInjector
    internal abstract fun contributeLogInActivity(): LogInActivity
}