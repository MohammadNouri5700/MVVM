package com.example.hepsi.repository.service

import androidx.lifecycle.LiveData
import com.example.hepsi.repository.entity.UserEntity
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.HeaderMap
import retrofit2.http.POST

interface Identity {


    @GET("users/2")
    suspend fun GetUserList(

    ): Response<UserEntity>

}