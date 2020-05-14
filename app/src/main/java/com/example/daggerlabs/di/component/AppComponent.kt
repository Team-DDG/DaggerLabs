package com.example.daggerlabs.di.component

import com.example.daggerlabs.di.module.AppModule
import com.example.daggerlabs.di.module.SubComponentModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, SubComponentModule::class])
interface AppComponent {

    fun loginComponent(): LoginComponent.Factory
}