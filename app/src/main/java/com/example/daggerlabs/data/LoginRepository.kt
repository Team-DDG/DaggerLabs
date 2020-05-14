package com.example.daggerlabs.data

import javax.inject.Inject

interface LoginRepository {
    fun login()
}

class LoginRepositoryImpl @Inject constructor(private val apiClient: ApiClient) : LoginRepository {

    override fun login() {
        apiClient.login()
    }
}