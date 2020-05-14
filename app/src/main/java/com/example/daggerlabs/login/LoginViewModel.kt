package com.example.daggerlabs.login

import com.example.daggerlabs.data.LoginRepository
import com.example.daggerlabs.di.scope.ActivityScope
import javax.inject.Inject

@ActivityScope
class LoginViewModel @Inject constructor(private val loginRepository: LoginRepository) {

    fun login() {
        loginRepository.login()
    }
}