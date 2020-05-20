package com.example.data.di

import com.example.data.GithubApi
import dagger.Component

@Component(
    modules = [DataModule::class]
)
interface DataComponent {

    @Component.Factory
    interface Factory {
        fun create(): DataComponent
    }

    fun githubApi(): GithubApi
}