package com.example.kotlin.retrofit2

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {
    Thread.setDefaultUncaughtExceptionHandler { _, _ ->
        println("It should not be happened!!!")
    }
    runBlocking {
        withContext(Dispatchers.IO) {
            try {
                ApiSource.instance.testBaiDu()
            } catch (t: Throwable) {
                println("The exception should be catched here.")
                t.printStackTrace()
            }
        }
    }
}
