package com.example.daggerlabs

import android.app.Application
import com.example.daggerlabs.di.component.AppComponent
import com.example.daggerlabs.di.AppModule
import com.example.daggerlabs.di.NetworkModule
import com.example.daggerlabs.di.SubComponentModule
import com.example.daggerlabs.di.component.DaggerAppComponent

class BaseApp : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .networkModule(NetworkModule())
            .build()
    }
}