package com.example.daggerlabs.data

import com.example.daggerlabs.users.model.UserModel
import retrofit2.http.GET

interface GithubApi {

    @GET("users")
    suspend fun getUsers(): List<UserModel>
}