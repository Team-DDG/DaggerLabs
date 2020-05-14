package com.example.daggerlabs.users.di

import com.example.daggerlabs.users.UsersActivity
import dagger.Subcomponent

@UsersScope
@Subcomponent(modules = [UsersModule::class])
interface UsersComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): UsersComponent
    }

    fun inject(usersActivity: UsersActivity)
}