package com.goforer.sotong.di.module.fragment

import com.goforer.sotong.presentation.ui.home.feed.fragment.HomePopFeedFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomePopFeedFragmentBuilderModule {
    @ContributesAndroidInjector
    internal abstract fun contributeHomePopFeedFragment(): HomePopFeedFragment
}