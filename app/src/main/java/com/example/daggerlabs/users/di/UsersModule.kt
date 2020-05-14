package com.example.daggerlabs.users.di

import com.example.daggerlabs.data.UsersRepository
import com.example.daggerlabs.data.UsersRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class UsersModule {

    @Binds
    abstract fun bindsUsersRepository(usersRepositoryImpl: UsersRepositoryImpl): UsersRepository
}