package com.example.daggerlabs.data

import android.content.Context
import android.util.Log
import android.widget.Toast
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ApiClient @Inject constructor(private val context: Context) {
    fun login() {
        Toast.makeText(context, "로그인!", Toast.LENGTH_SHORT).show()
    }
}