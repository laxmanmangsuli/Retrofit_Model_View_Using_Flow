package com.example.retrofitmodelview.data.service

import com.example.retrofitmodelview.core.Constants
import com.example.retrofitmodelview.data.model.Data
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Query

interface EventsApiService {
    @GET(Constants.END_POINT)
    suspend fun getEvents(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Data
}
