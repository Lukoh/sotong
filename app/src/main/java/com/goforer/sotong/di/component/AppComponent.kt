package com.goforer.sotong.di.component

import android.app.Application
import com.goforer.sotong.Sotong
import com.goforer.sotong.di.module.AppModule
import com.goforer.sotong.di.module.activity.HomeActivityModule
import com.goforer.sotong.di.module.activity.HomePostingActivityModule
import com.goforer.sotong.di.module.activity.LogInActivityModule
import com.goforer.sotong.di.module.activity.ProfileActivityModule
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

    fun inject(sotong: Sotong)
}