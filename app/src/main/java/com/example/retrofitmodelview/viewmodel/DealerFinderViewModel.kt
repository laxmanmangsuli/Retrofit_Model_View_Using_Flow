package com.example.retrofitmodelview.viewmodel

import androidx.lifecycle.ViewModel
import com.example.retrofitmodelview.model.Data
import com.example.retrofitmodelview.model.Event

class DealerFinderViewModel : ViewModel() {

    private val apiService = RetrofitClient.eventsApiService
    private var currentPage = 1
    var isLastPage = false

    suspend fun fetchEvents(page: Int, perPage: Int): List<Event?>? {
        if (isLastPage) {
            return null
        }
        val response = apiService.getEvents(page, perPage)
        if (response.events.isNullOrEmpty()) {
            isLastPage = true
        } else {
                currentPage++

        }
        return response.events
    }

    fun getCurrentPage(): Int {
        return currentPage
    }
}
