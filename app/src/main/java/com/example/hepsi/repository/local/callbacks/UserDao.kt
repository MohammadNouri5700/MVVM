package com.example.hepsi.repository.local.callbacks

import androidx.room.*
import com.example.hepsi.repository.entity.UserEntity


@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getUser() : UserEntity

    @Insert
    fun insert(vararg todo: UserEntity)

    @Update
    fun update(vararg todo: UserEntity)

    @Delete
    fun delete(vararg todo: UserEntity)

    @Query("DELETE FROM user")
    fun truncate()
}