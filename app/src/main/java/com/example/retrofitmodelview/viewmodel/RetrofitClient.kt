package com.example.retrofitmodelview.viewmodel

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://dealsfinders.blog/wp-json/tribe/events/v1/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val eventsApiService: EventsApiService = retrofit.create(EventsApiService::class.java)
}
