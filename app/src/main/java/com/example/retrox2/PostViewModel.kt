package com.example.retrox2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PostViewModel : ViewModel() {

    val postrepository = PostRepository()

    private val _post = MutableStateFlow<Post>(Post(0,0,"",""))
    val post: StateFlow<Post> = _post.asStateFlow()

    init {
        getPost()
    }

    fun getPost(){
        viewModelScope.launch {
            _post.value = postrepository.getPost()
        }
    }

}