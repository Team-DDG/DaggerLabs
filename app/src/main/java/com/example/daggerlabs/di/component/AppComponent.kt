package com.example.daggerlabs.di.component

import com.example.daggerlabs.di.module.AppModule
import com.example.daggerlabs.di.module.NetworkModule
import com.example.daggerlabs.di.module.SubComponentModule
import com.example.daggerlabs.users.di.UsersComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, SubComponentModule::class, NetworkModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        fun appModule(appModule: AppModule): Builder
        fun build(): AppComponent
    }

    fun usersComponent(): UsersComponent.Factory
}