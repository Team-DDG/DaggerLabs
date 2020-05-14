package com.example.daggerlabs.di

import com.example.daggerlabs.data.ApiClient
import com.example.daggerlabs.data.LoginRepository
import com.example.daggerlabs.data.LoginRepositoryImpl
import com.example.daggerlabs.di.component.LoginComponent
import com.example.daggerlabs.di.scope.ActivityScope
import com.example.daggerlabs.login.LoginViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LoginModule {

    @Provides
    fun providesLoginRepository(apiClient: ApiClient): LoginRepository =
        LoginRepositoryImpl(apiClient)

    @Provides
    fun providesLoginViewModel(loginRepository: LoginRepository): LoginViewModel =
        LoginViewModel(loginRepository)
}