package com.example.retrofitmodelview.presentation.main


import androidx.lifecycle.ViewModel
import com.example.retrofitmodelview.data.model.Event
import com.example.retrofitmodelview.domain.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class DealerFinderViewModel @Inject constructor(private val mainRepository: MainRepository) : ViewModel() {

    private var currentPage = 1
    var isLastPage = false

    fun fetchEvents(page: Int, perPage: Int): Flow<List<Event?>?> = flow {
        if (isLastPage) {
            emit(null)
            return@flow
        }
        val response = mainRepository.fetchEvents(page, perPage)
        response.collect{
          emit(it.events)
            if(it.events.isNullOrEmpty()){
                isLastPage = true
            }
            else {
                currentPage++
            }
        }
    }

    fun getCurrentPage(): Int {
        return currentPage
    }
}

