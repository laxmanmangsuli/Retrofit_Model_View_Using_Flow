package com.example.retrofitmodelview.data.model


import com.google.gson.annotations.SerializedName

data class EndDateDetails(
    @SerializedName("day")
    var day: String?,
    @SerializedName("hour")
    var hour: String?,
    @SerializedName("minutes")
    var minutes: String?,
    @SerializedName("month")
    var month: String?,
    @SerializedName("seconds")
    var seconds: String?,
    @SerializedName("year")
    var year: String?
)