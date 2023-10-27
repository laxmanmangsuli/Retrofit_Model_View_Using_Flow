package com.example.retrofitmodelview.data.repository

import com.example.retrofitmodelview.data.service.EventsApiService
import com.example.retrofitmodelview.domain.MainRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainMainRepositoryImpl @Inject constructor(private val apiService: EventsApiService) : MainRepository {

    override suspend fun fetchEvents(page: Int, perPage: Int) = apiService.getEvents(page, perPage)
}