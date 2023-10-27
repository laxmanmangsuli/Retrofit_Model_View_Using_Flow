package com.example.retrofitmodelview.data.model


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("extension")
    var extension: String?,
    @SerializedName("filesize")
    var filesize: Int?,
    @SerializedName("height")
    var height: Int?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("sizes")
    var sizes: com.example.retrofitmodelview.data.model.Sizes?,
    @SerializedName("url")
    var url: String?,
    @SerializedName("width")
    var width: Int?
)