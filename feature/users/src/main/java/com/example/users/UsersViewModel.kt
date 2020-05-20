package com.example.users

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.model.repository.UsersRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class UsersViewModel @Inject constructor(
    private val usersRepository: UsersRepository
) : ViewModel() {

    private val _users = MutableLiveData<List<com.example.model.UserModel>>()
    val users: LiveData<List<com.example.model.UserModel>> = _users

    init {
        getUsers()
    }

    fun getUsers() = viewModelScope.launch {
        _users.value = usersRepository.getUsers()
    }
}