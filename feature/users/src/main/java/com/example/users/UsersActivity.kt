package com.example.users

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.base.di.ViewModelFactory
import com.example.data.di.DaggerDataComponent
import com.example.users.di.DaggerUsersComponent
import com.example.users.di.UsersComponent
import kotlinx.android.synthetic.main.activity_users.*
import javax.inject.Inject

class UsersActivity : AppCompatActivity() {

    val usersComponent: UsersComponent by lazy {
        DaggerUsersComponent.builder()
            .dataComponent(DaggerDataComponent.create())
            .build()
    }

    @Inject
    lateinit var viewModelFactory: ViewModelFactory<UsersViewModel>
    private val viewModel: UsersViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[UsersViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        usersComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        rv_users.adapter = UserListAdapter()
        rv_users.addItemDecoration(DividerItemDecoration(this, RecyclerView.VERTICAL))
        viewModel.users.observe(this, Observer {
            (rv_users.adapter as UserListAdapter).submitList(it)
        })
    }
}