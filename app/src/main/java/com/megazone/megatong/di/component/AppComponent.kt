package com.megazone.megatong.di.component

import android.app.Application
import com.megazone.megatong.Megatong
import com.megazone.megatong.di.module.AppModule
import com.megazone.megatong.di.module.activity.HomeActivityModule
import com.megazone.megatong.di.module.activity.HomePostingActivityModule
import com.megazone.megatong.di.module.activity.LogInActivityModule
import com.megazone.megatong.di.module.activity.ProfileActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class, AppModule::class, LogInActivityModule::class, HomeActivityModule::class,
    HomePostingActivityModule::class, ProfileActivityModule::class
])

interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): AppComponent
    }

    fun inject(megatong: Megatong)
}