package com.example.model

import androidx.recyclerview.widget.DiffUtil
import com.google.gson.annotations.SerializedName

data class UserModel(
    val login: String,

    @SerializedName("node_id")
    val nodeId: String
) {
    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<UserModel>() {
            override fun areItemsTheSame(oldItem: UserModel, newItem: UserModel): Boolean =
                oldItem.login == newItem.login

            override fun areContentsTheSame(oldItem: UserModel, newItem: UserModel): Boolean =
                oldItem.nodeId == newItem.nodeId

        }
    }
}