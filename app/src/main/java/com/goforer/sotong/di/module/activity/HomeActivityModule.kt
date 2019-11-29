package com.goforer.sotong.di.module.activity

import com.goforer.sotong.di.module.fragment.HomeFeedFragmentBuilderModule
import com.goforer.sotong.di.module.fragment.HomePopFeedFragmentBuilderModule
import com.goforer.sotong.presentation.ui.home.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeActivityModule {
    @ContributesAndroidInjector(modules = [
        HomeFeedFragmentBuilderModule::class, HomePopFeedFragmentBuilderModule::class])
    internal abstract fun contributeHomeActivity(): HomeActivity
}