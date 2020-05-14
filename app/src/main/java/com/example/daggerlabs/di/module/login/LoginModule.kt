package com.example.daggerlabs.di.module.login

import com.example.daggerlabs.data.LoginRepository
import com.example.daggerlabs.data.LoginRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class LoginModule {

    @Binds
    abstract fun bindsLoginRepository(loginRepositoryImpl: LoginRepositoryImpl): LoginRepository
}