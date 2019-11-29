package com.goforer.sotong.di.module.activity

import com.goforer.sotong.di.module.fragment.ProfileFragmentBuilderModule
import com.goforer.sotong.presentation.ui.profile.ProfileActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ProfileActivityModule {
    @ContributesAndroidInjector(modules = [ProfileFragmentBuilderModule::class])
    internal abstract fun contributeProfileActivity(): ProfileActivity
}