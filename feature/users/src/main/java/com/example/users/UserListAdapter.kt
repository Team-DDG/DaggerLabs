package com.example.users

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.model.UserModel
import kotlinx.android.synthetic.main.item_user.view.*

class UserListAdapter :
    ListAdapter<UserModel, UserListAdapter.UserHolder>(UserModel.DIFF_CALLBACK) {

    inner class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            val item = getItem(adapterPosition)
            itemView.tv_login.text = item.login
            itemView.tv_node_id.text = item.nodeId
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder =
        UserHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false))

    override fun onBindViewHolder(holder: UserHolder, position: Int) = holder.bind()
}