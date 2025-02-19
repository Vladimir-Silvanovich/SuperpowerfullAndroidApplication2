package com.example.chudoapplication.domain.models

data class UserModel(
    val id: String,
    val name: String? = null,
    val surname: String? = null,
    val email: String?,
    val phone: String,
    val address: String,
)