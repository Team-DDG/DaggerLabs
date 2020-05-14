package com.example.daggerlabs.data

import com.example.daggerlabs.di.scope.ActivityScope
import javax.inject.Inject

interface LoginRepository {
    fun login()
}

@ActivityScope
class LoginRepositoryImpl @Inject constructor(private val apiClient: ApiClient) : LoginRepository {

    override fun login() {
        apiClient.login()
    }
}