package com.megazone.megatong.di.module.fragment

import com.megazone.megatong.presentation.ui.profile.fragment.ProfileFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ProfileFragmentBuilderModule {
    @ContributesAndroidInjector
    internal abstract fun contributeProfileFragment(): ProfileFragment
}