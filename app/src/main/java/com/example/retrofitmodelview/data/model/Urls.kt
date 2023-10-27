package com.example.retrofitmodelview.data.model


import com.google.gson.annotations.SerializedName

data class Urls(
    @SerializedName("collection")
    var collection: String?,
    @SerializedName("self")
    var self: String?
)