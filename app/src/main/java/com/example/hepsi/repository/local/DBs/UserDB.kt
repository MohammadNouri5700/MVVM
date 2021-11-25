package com.example.hepsi.repository.local.DBs

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.hepsi.repository.entity.UserEntity


@Entity(tableName = "user")
data class UserDB (
    @PrimaryKey(autoGenerate = false) val userid: Int? = null,
    var user:UserEntity
)