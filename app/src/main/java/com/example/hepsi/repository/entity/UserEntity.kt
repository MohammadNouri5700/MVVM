package com.example.hepsi.repository.entity

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




data class UserEntity (
    @SerializedName("id")
    @Expose
    private val id: Int? = null,

    @SerializedName("email")
    @Expose
    private val email: String? = null,

    @SerializedName("first_name")
    @Expose
    private val firstName: String? = null,

    @SerializedName("last_name")
    @Expose
    private val lastName: String? = null,

    @SerializedName("avatar")
    @Expose
    private val avatar: String? = null
)