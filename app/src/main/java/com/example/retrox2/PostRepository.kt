package com.example.retrox2

class PostRepository {

    val apiservice = APIService()

    suspend fun getPost() : Post {
        return apiservice.postServices.getPost()
    }
}