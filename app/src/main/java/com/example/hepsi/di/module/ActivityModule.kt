package com.example.hepsi.di.module

import com.example.hepsi.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [])
    abstract fun providemMainActivity(): MainActivity
}