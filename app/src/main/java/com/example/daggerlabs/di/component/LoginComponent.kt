package com.example.daggerlabs.di.component

import com.example.daggerlabs.di.module.login.LoginModule
import com.example.daggerlabs.di.scope.ActivityScope
import com.example.daggerlabs.login.LoginActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [LoginModule::class])
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(loginActivity: LoginActivity)
}