package com.megazone.megatong.di.module.fragment

import com.megazone.megatong.presentation.ui.home.feed.fragment.HomePopFeedFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomePopFeedFragmentBuilderModule {
    @ContributesAndroidInjector
    internal abstract fun contributeHomePopFeedFragment(): HomePopFeedFragment
}