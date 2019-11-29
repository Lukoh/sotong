package com.megazone.megatong.di.module.activity

import com.megazone.megatong.presentation.ui.posting.HomePostingActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomePostingActivityModule {
    @ContributesAndroidInjector
    internal abstract fun contributeHomePostingActivity(): HomePostingActivity
}