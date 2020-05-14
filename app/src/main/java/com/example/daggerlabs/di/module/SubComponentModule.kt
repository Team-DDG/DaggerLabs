package com.example.daggerlabs.di.module

import com.example.daggerlabs.users.di.UsersComponent
import dagger.Module

@Module(subcomponents = [UsersComponent::class])
class SubComponentModule