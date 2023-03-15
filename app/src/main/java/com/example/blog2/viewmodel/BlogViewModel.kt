package com.example.blog2.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BlogViewModel: ViewModel() {

    // Expose screen UI state
    private val _uiState = MutableStateFlow(BlogUiState())
    val uiState: StateFlow<BlogUiState> = _uiState.asStateFlow()

    fun addBlog(value1: String, value2: String) {
        _uiState.update {
            state -> state.copy(
                title = state.title + value1, // för att den är tom så att användaren kan ändra värde
                blogPost = state.blogPost + value2
            )
        }
        println(_uiState.value.title)
        println(_uiState.value.blogPost)
    }


}