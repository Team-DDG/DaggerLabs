package com.example.model.repository

import com.example.model.UserModel

interface UsersRepository {

    suspend fun getUsers(): List<UserModel>
}