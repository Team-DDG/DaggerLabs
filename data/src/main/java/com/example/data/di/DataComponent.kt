package com.example.data.di

import com.example.data.GithubApi
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class])
interface DataComponent {

    fun githubApi(): GithubApi

    @Component.Factory
    interface Factory {
        fun create(): DataComponent
    }
}