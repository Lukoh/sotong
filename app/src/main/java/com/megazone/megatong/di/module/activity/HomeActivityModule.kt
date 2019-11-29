package com.megazone.megatong.di.module.activity

import com.megazone.megatong.di.module.fragment.HomeFeedFragmentBuilderModule
import com.megazone.megatong.di.module.fragment.HomePopFeedFragmentBuilderModule
import com.megazone.megatong.presentation.ui.home.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeActivityModule {
    @ContributesAndroidInjector(modules = [
        HomeFeedFragmentBuilderModule::class, HomePopFeedFragmentBuilderModule::class])
    internal abstract fun contributeHomeActivity(): HomeActivity
}