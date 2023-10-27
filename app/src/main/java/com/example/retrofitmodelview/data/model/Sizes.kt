package com.example.retrofitmodelview.data.model


import com.google.gson.annotations.SerializedName

data class Sizes(
    @SerializedName("alm-thumbnail")
    var almThumbnail: com.example.retrofitmodelview.data.model.AlmThumbnail?,
    @SerializedName("large")
    var large: com.example.retrofitmodelview.data.model.Large?,
    @SerializedName("medium_large")
    var mediumLarge: com.example.retrofitmodelview.data.model.MediumLarge?,
    @SerializedName("pluto-carousel-post")
    var plutoCarouselPost: com.example.retrofitmodelview.data.model.PlutoCarouselPost?,
    @SerializedName("pluto-fixed-height")
    var plutoFixedHeight: com.example.retrofitmodelview.data.model.PlutoFixedHeight?,
    @SerializedName("pluto-fixed-height-image")
    var plutoFixedHeightImage: com.example.retrofitmodelview.data.model.PlutoFixedHeightImage?,
    @SerializedName("pluto-full-width")
    var plutoFullWidth: com.example.retrofitmodelview.data.model.PlutoFullWidth?,
    @SerializedName("pluto-index-width")
    var plutoIndexWidth: com.example.retrofitmodelview.data.model.PlutoIndexWidth?,
    @SerializedName("pluto-top-featured-post")
    var plutoTopFeaturedPost: com.example.retrofitmodelview.data.model.PlutoTopFeaturedPost?,
    @SerializedName("post-thumbnail")
    var postThumbnail: com.example.retrofitmodelview.data.model.PostThumbnail?
)