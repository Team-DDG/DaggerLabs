package com.example.daggerlabs.users

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daggerlabs.data.UsersRepository
import com.example.daggerlabs.users.di.UsersScope
import com.example.daggerlabs.users.model.UserModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@UsersScope
class UsersViewModel @Inject constructor(
    private val usersRepository: UsersRepository
) : ViewModel() {

    private val _users = MutableLiveData<List<UserModel>>()
    val users: LiveData<List<UserModel>> = _users

    init {
        getUsers()
    }

    fun getUsers() = viewModelScope.launch {
        _users.value = usersRepository.getUsers()
    }
}