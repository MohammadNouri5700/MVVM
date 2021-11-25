package com.example.hepsi.di.module

import android.content.Context
import com.example.hepsi.repository.local.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DataBaseModule {

    @Singleton
    @Provides
    fun provideDatabase(context: Context) = AppDatabase.getDatabase(context)


    @Singleton
    @Provides
    fun provideUserDao(db: AppDatabase) = db.createUsersDao()
}