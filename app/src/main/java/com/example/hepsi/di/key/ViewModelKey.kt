package com.example.hepsi.di.key

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass


@MustBeDocumented
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)
