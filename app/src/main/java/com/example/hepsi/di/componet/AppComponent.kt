package com.example.hepsi.di.componet

import android.content.Context
import com.example.barapp.di.module.RetrofitModule
import com.example.hepsi.di.injector.ViewModelInjectors
import com.example.hepsi.di.module.ActivityModule
import com.example.hepsi.di.module.PreferencesModule
import com.example.hepsi.di.module.ServiceModule
import com.example.hepsi.di.module.ViewModelModule
import com.example.hepsi.factory.DaggerMainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Singleton
@Component(modules = [
    ViewModelModule::class,
    AndroidInjectionModule::class,
    ActivityModule::class,
    PreferencesModule::class,
    RetrofitModule::class,
    ServiceModule::class
])
interface AppComponent : AndroidInjector<DaggerMainApplication> {


    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context):AppComponent

    }

}