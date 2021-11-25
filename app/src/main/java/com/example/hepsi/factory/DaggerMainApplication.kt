package com.example.hepsi.factory

import android.content.Context
import com.example.hepsi.di.componet.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class DaggerMainApplication : DaggerApplication() {


    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }

}