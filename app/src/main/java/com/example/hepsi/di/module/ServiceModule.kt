package com.example.hepsi.di.module

import androidx.annotation.Nullable
import com.example.hepsi.repository.remote.RemoteDataSource
import com.example.hepsi.repository.service.Identity
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
class ServiceModule {



    @Nullable
    @Provides
    fun provideIdentity(retrofit: Retrofit): Identity? = retrofit.create(Identity::class.java)


    @Provides
    fun provideRemoteDataSource(
        @Nullable productService: Identity
    ) = RemoteDataSource(productService)

}