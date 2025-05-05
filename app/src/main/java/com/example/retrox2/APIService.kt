package com.example.retrox2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class APIService {

    private val retrofit = Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val postServices = retrofit.create(ApiServices::class.java)

    interface ApiServices {
        @GET("/posts/1")
        suspend fun getPost() : Post
    }
}