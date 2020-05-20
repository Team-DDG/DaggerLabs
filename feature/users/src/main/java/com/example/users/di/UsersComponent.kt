package com.example.users.di

import com.example.data.di.DataComponent
import com.example.users.UsersActivity
import dagger.Component

@Component(
    dependencies = [DataComponent::class],
    modules = [UsersModule::class]
)
interface UsersComponent {

    @Component.Builder
    interface Builder {
        fun dataComponent(dataComponent: DataComponent): Builder
        fun build(): UsersComponent
    }

    fun inject(usersActivity: UsersActivity)
}