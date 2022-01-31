package com.example.daggertrening.di

import android.app.Application
import com.example.daggertrening.BaseApp
import com.example.daggertrening.di.modules.ActivityBuilderModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    ActivityBuilderModule::class
])
interface AppComponent : AndroidInjector<BaseApp> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): AppComponent
    }

}