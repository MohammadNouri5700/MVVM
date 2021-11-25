package com.example.hepsi.repository.remote

import com.example.hepsi.factory.BaseDataSource
import com.example.hepsi.repository.service.Identity
import javax.inject.Inject

class RemoteDataSource @Inject constructor(val userservice: Identity): BaseDataSource() {

    suspend fun getusers() = getResult { userservice.GetUserList() }



}