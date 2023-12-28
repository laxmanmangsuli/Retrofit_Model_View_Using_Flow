package com.example.retrofitmodelview.data.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("events")
    var events: List<Event?>?,
    @SerializedName("next_rest_url")
    var nextRestUrl: String?,
    @SerializedName("rest_url")
    var restUrl: String?,
    @SerializedName("total")
    var total: Int?,
    @SerializedName("total_pages")
    var totalPages: Int?
)