package com.example.kotlin.retrofit2

import retrofit2.http.GET

interface ApiService {

    @GET("api/module/user/{name}/info")
    suspend fun testBaiDu()
}