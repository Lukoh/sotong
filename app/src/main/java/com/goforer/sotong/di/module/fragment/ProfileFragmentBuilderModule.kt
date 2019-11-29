package com.goforer.sotong.di.module.fragment

import com.goforer.sotong.presentation.ui.profile.fragment.ProfileFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ProfileFragmentBuilderModule {
    @ContributesAndroidInjector
    internal abstract fun contributeProfileFragment(): ProfileFragment
}