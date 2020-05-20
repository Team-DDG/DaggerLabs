package com.example.data

import com.example.model.UserModel
import com.example.model.repository.UsersRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class UsersRepositoryImpl @Inject constructor(
    private val githubApi: GithubApi
) : UsersRepository {

    override suspend fun getUsers(): List<UserModel> = withContext(Dispatchers.IO) {
        githubApi.getUsers()
    }
}