package com.example.daggerlabs.users

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.daggerlabs.data.UsersRepository
import javax.inject.Inject

class UsersViewModelFactory @Inject constructor(
    private val usersRepository: UsersRepository
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UsersViewModel::class.java)) {
            return UsersViewModel(usersRepository) as T
        } else {
            throw IllegalArgumentException()
        }
    }
}