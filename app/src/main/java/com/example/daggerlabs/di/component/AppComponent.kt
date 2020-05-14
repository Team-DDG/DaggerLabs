package com.example.daggerlabs.di.component

import com.example.daggerlabs.MainActivity
import com.example.daggerlabs.di.AppModule
import com.example.daggerlabs.di.NetworkModule
import com.example.daggerlabs.di.SubComponentModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, SubComponentModule::class, NetworkModule::class])
interface AppComponent {

    fun loginComponent(): LoginComponent.Factory
}