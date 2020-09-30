package com.example.kotlin.retrofit2

import okhttp3.OkHttpClient
import retrofit2.Retrofit

object ApiSource {

    private val client = OkHttpClient.Builder()
            .addInterceptor { _ ->
                throw RuntimeException("We must throw a excepion here.")
            }.build()
    val instance: ApiService = Retrofit
            .Builder()
            .baseUrl("https://www.baidu.com/")
            .client(client)
            .build().create(ApiService::class.java)
}