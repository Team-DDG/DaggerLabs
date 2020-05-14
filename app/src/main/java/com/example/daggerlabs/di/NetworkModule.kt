package com.example.daggerlabs.di

import android.content.Context
import com.example.daggerlabs.data.ApiClient
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    fun providesApiClient(context: Context): ApiClient = ApiClient(context)
}