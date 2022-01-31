package com.example.daggertrening.di.modules

import com.example.daggertrening.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity() : MainActivity

}