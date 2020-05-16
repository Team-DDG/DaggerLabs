package com.example.daggerlabs.di.module

import com.example.data.GithubApi
import com.example.data.di.DaggerDataComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataComponentModule {

    @Provides
    @Singleton
    fun providesGithubApi(): GithubApi =
        DaggerDataComponent.create().githubApi()
}