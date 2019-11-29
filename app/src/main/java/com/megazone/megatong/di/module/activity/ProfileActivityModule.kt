package com.megazone.megatong.di.module.activity

import com.megazone.megatong.di.module.fragment.ProfileFragmentBuilderModule
import com.megazone.megatong.presentation.ui.profile.ProfileActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ProfileActivityModule {
    @ContributesAndroidInjector(modules = [ProfileFragmentBuilderModule::class])
    internal abstract fun contributeProfileActivity(): ProfileActivity
}