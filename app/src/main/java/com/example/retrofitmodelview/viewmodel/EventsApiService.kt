package com.example.retrofitmodelview.viewmodel

import com.example.retrofitmodelview.model.Data
import dagger.Provides
import retrofit2.http.GET
import retrofit2.http.Query

interface EventsApiService {
    @GET(Constants.END_POINT)
    suspend fun getEvents(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Data
}
