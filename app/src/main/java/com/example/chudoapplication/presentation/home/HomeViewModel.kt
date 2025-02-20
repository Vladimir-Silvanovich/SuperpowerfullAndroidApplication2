package com.example.chudoapplication.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.chudoapplication.MainApp
import com.example.chudoapplication.data.entities.CategoryDto
import com.example.chudoapplication.data.repository.CategoryRepository
import com.example.chudoapplication.domain.models.Category
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.builtins.serializer

class HomeViewModel(
    private val categoryRepository: CategoryRepository
) : ViewModel() {
    private val categoryFlow: Flow<List<Category>> = flow {
        val categories = getCategories()?.map { it.asDomainModel() } ?: emptyList()
        emit(categories)
    }

    val categories: StateFlow<List<Category>> = categoryFlow
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = emptyList()
        )

    suspend fun getCategories(): List<CategoryDto>? {
        return withContext(Dispatchers.IO) {
            categoryRepository.getCategories()
        }
    }



    private fun CategoryDto.asDomainModel(): Category {
        return Category(
            id = this.id,
            title = this.title,
        )
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as MainApp)
                HomeViewModel(application.container.categoryRepository)
            }
        }
    }
}