package com.example.daggerlabs

import android.app.Application
import com.example.daggerlabs.di.component.AppComponent
import com.example.daggerlabs.di.component.DaggerAppComponent
import com.example.daggerlabs.di.module.AppModule

class BaseApp : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }
}