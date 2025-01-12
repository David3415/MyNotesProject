package com.example.mynotesproject.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object UserFactory {
   const val BASE_URL = "http://192.168.0.16/host/"


    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    val userApi: UserApi = retrofit.create(UserApi::class.java)
}
