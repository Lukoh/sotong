package com.goforer.sotong.di.module.fragment

import com.goforer.sotong.presentation.ui.home.feed.fragment.HomeFeedFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeFeedFragmentBuilderModule {
    @ContributesAndroidInjector
    internal abstract fun contributeHomeFeedFragment(): HomeFeedFragment
}