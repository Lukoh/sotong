package com.goforer.sotong.di.module.activity

import com.goforer.sotong.presentation.ui.posting.HomePostingActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomePostingActivityModule {
    @ContributesAndroidInjector
    internal abstract fun contributeHomePostingActivity(): HomePostingActivity
}