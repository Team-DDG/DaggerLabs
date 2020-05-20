package com.example.users.di

import com.example.data.UsersRepositoryImpl
import com.example.model.repository.UsersRepository
import dagger.Binds
import dagger.Module

@Module
abstract class UsersModule {

    @Binds
    abstract fun bindsUsersRepository(usersRepositoryImpl: UsersRepositoryImpl): UsersRepository
}