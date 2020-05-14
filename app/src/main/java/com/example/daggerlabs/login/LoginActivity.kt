package com.example.daggerlabs.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerlabs.BaseApp
import com.example.daggerlabs.R
import com.example.daggerlabs.di.component.LoginComponent
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    val loginComponent: LoginComponent by lazy {
        (application as BaseApp).appComponent.loginComponent().create()
    }

    @Inject
    lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        loginComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener { viewModel.login() }
    }
}