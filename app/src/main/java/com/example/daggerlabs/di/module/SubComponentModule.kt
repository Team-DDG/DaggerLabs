package com.example.daggerlabs.di.module

import com.example.daggerlabs.di.component.LoginComponent
import dagger.Module

@Module(subcomponents = [LoginComponent::class])
class SubComponentModule