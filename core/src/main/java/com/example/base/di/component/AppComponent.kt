package com.example.base.di.component

import com.example.base.di.module.AppModule
import dagger.Component

@Component(
    modules = [AppModule::class]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        fun appModule(appModule: AppModule): Builder
        fun build(): AppComponent
    }
}