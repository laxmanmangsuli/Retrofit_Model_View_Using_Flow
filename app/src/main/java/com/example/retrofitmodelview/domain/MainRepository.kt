package com.example.retrofitmodelview.domain

import com.example.retrofitmodelview.data.model.Data
import kotlinx.coroutines.flow.Flow

interface MainRepository  {
    suspend fun fetchEvents(page: Int, perPage: Int): Flow<Data>
}




