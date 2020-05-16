package com.example.data

import com.example.model.UserModel
import retrofit2.http.GET

interface GithubApi {

    @GET("users")
    suspend fun getUsers(): List<UserModel>
}