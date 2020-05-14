package com.example.daggerlabs.di

import com.example.daggerlabs.di.component.LoginComponent
import dagger.Module

@Module(subcomponents = [LoginComponent::class])
class SubComponentModule