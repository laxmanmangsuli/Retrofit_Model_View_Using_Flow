package com.example.retrofitmodelview.viewmodel

import com.example.retrofitmodelview.model.Data
import dagger.Provides

import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Repository @Inject constructor(private val apiService: EventsApiService) {
    suspend fun fetchEvents(page: Int, perPage: Int): Data {
        return apiService.getEvents(page, perPage)
    }
}

//class Repository @Inject constructor(private val apiService: RetrofitClient) {
//
//    suspend fun fetchEvents(page: Int, perPage: Int): Data {
//        return apiService.provideEventsApiService().getEvents(page, perPage)
//    }
//}



