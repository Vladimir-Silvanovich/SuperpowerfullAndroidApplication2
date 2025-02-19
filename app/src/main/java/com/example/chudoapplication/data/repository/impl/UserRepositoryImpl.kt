package com.example.chudoapplication.data.repository.impl

import com.example.chudoapplication.data.repository.UserRepository
import com.example.chudoapplication.domain.models.UserModel
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.postgrest.from
import kotlinx.coroutines.flow.Flow

class UserRepositoryImpl : UserRepository {
    override suspend fun clearUser() {
        TODO("Not yet implemented")
    }

    override fun getCurrentUser(): Flow<UserModel?> {
        TODO("Not yet implemented")
    }

    override suspend fun authenticate(email: String, password: String): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun updateUserProfile(
        userId: String,
        name: String,
        email: String,
        phone: String,
        address: String
    ) {
        TODO("Not yet implemented")
    }

    override suspend fun createAccount(email: String, password: String, name: String): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun updateUserSettings(
        id: String,
        isOrderCreatedEnabled: Boolean,
        isDatabaseRefreshedEnabled: Boolean,
        isPromotionEnabled: Boolean
    ) {
        TODO("Not yet implemented")
    }
}