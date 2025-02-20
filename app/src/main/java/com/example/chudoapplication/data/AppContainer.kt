package com.example.chudoapplication.data

import android.content.Context
import com.example.chudoapplication.data.repository.CategoryRepository
import com.example.chudoapplication.data.repository.impl.CategoryRepositoryImpl

interface AppContainer {
    val categoryRepository : CategoryRepository
}


class AppDataContainer(private val context: Context) : AppContainer {
    override val categoryRepository: CategoryRepository by lazy {
        CategoryRepositoryImpl()
    }
}