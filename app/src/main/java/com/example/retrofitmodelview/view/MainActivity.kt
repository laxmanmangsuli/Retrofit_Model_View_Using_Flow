package com.example.retrofitmodelview.view

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast


import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitmodelview.databinding.ActivityMainBinding
import com.example.retrofitmodelview.model.Event
import com.example.retrofitmodelview.viewmodel.DealerFinderAdapter
import com.example.retrofitmodelview.viewmodel.DealerFinderViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.HttpException
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: DealerFinderViewModel
    //    private var data: List<Event>? = null
    private lateinit var binding: ActivityMainBinding
    private lateinit var dealerFinderAdapter: DealerFinderAdapter
    private var isLoading = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dealerFinderAdapter = DealerFinderAdapter(this@MainActivity)
        val recyclerView = binding.recycler
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = dealerFinderAdapter

        viewModel = ViewModelProvider(this).get(DealerFinderViewModel::class.java)
        val connectivityManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val network = connectivityManager.activeNetwork
        val networkCapabilities = connectivityManager.getNetworkCapabilities(network)
        if (networkCapabilities != null && networkCapabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)) {
            binding.progress.visibility = View.VISIBLE
            fetchEvents()
            binding.recycler.addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    super.onScrolled(recyclerView, dx, dy)
                    val layoutManager = recyclerView.layoutManager as LinearLayoutManager
                    val visibleItemCount = layoutManager.childCount
                    val totalItemCount = layoutManager.itemCount
                    val firstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition()

                    if (!isLoading && !viewModel.isLastPage && (visibleItemCount + firstVisibleItemPosition) >= totalItemCount
                        && firstVisibleItemPosition >= 0
                    ) {
                        fetchEvents()
                    }
                }
            })
        } else {
            Toast.makeText(this, "No internet connection", Toast.LENGTH_SHORT).show()
        }
    }

    private fun fetchEvents() {

        if (isLoading) return

        isLoading = true
        CoroutineScope(Dispatchers.Main).launch {
            try {
                val currentPage = viewModel.getCurrentPage()

                val list = viewModel.fetchEvents(currentPage, 10)

                if (list != null) {
                    if (list.isEmpty()) {
                        viewModel.isLastPage = true
                        Toast.makeText(this@MainActivity, "No more data to load", Toast.LENGTH_SHORT).show()
                    } else {
                        binding.progress.visibility = View.GONE
                        dealerFinderAdapter.appendData(list)
                    }
                } else {
                    Toast.makeText(this@MainActivity, "No  data received", Toast.LENGTH_SHORT)
                        .show()
                }
            } catch (e: HttpException) {
                Toast.makeText(this@MainActivity, "HTTP Error: ${e.code()}", Toast.LENGTH_SHORT)
                    .show()
            } catch (e: Exception) {
                Log.e("API Error", e.message ?: "Unknown error")
                Log.d("TAG", "fetchEvents: ${e.message.toString()}")
                Toast.makeText(this@MainActivity, "Error loading data", Toast.LENGTH_SHORT).show()
            } finally {
                isLoading = false
            }
        }
    }
}


