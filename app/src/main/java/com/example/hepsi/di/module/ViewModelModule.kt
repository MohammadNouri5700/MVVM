package com.example.hepsi.di.module

import androidx.lifecycle.ViewModel
import com.example.hepsi.di.key.ViewModelKey
import com.example.hepsi.viewmodel.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @ViewModelKey(MainViewModel::class)
    @IntoMap
    abstract fun providemainviewmodel(vm:MainViewModel): ViewModel
}