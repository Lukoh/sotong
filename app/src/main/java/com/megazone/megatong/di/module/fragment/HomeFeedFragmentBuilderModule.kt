package com.megazone.megatong.di.module.fragment

import com.megazone.megatong.presentation.ui.home.feed.fragment.HomeFeedFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeFeedFragmentBuilderModule {
    @ContributesAndroidInjector
    internal abstract fun contributeHomeFeedFragment(): HomeFeedFragment
}