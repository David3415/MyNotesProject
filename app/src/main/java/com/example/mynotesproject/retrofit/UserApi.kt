package com.example.mynotesproject.retrofit

import retrofit2.http.GET
import retrofit2.http.Path

interface UserApi {
    @GET("get_all_items.php")
    suspend fun getUserById(): List<User>
}