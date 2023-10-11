package com.example.retrofitmodelview.model


import com.google.gson.annotations.SerializedName

data class Urls(
    @SerializedName("collection")
    var collection: String?,
    @SerializedName("self")
    var self: String?
)