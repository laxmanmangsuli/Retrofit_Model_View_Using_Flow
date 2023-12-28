package com.example.retrofitmodelview.data.repository

import com.example.retrofitmodelview.data.model.Data
import com.example.retrofitmodelview.data.service.EventsApiService
import com.example.retrofitmodelview.domain.MainRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainMainRepositoryImpl @Inject constructor(private val apiService: EventsApiService) : MainRepository {

    override suspend fun fetchEvents(page: Int, perPage: Int):Flow<Data> =  flow {
        while (true) {
            emit(apiService.getEvents(page, perPage))
        }

    }
}