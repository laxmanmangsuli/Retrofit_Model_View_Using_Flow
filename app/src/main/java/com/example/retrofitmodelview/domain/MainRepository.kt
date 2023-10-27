package com.example.retrofitmodelview.domain

import com.example.retrofitmodelview.data.model.Data

interface MainRepository  {
    suspend fun fetchEvents(page: Int, perPage: Int): Data
}




