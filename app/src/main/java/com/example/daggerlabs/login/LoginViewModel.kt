package com.example.daggerlabs.login

import android.util.Log
import com.example.daggerlabs.data.LoginRepository
import com.example.daggerlabs.di.scope.ActivityScope
import javax.inject.Inject

@ActivityScope
class LoginViewModel @Inject constructor(private val loginRepository: LoginRepository) {

    init {
        Log.d("DEBUGLOG", "Hello!")
    }

    fun login() {
        loginRepository.login()
    }
}