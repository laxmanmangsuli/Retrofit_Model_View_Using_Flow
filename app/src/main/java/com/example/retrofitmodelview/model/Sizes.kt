package com.example.retrofitmodelview.model


import com.google.gson.annotations.SerializedName

data class Sizes(
    @SerializedName("alm-thumbnail")
    var almThumbnail: AlmThumbnail?,
    @SerializedName("large")
    var large: Large?,
    @SerializedName("medium_large")
    var mediumLarge: MediumLarge?,
    @SerializedName("pluto-carousel-post")
    var plutoCarouselPost: PlutoCarouselPost?,
    @SerializedName("pluto-fixed-height")
    var plutoFixedHeight: PlutoFixedHeight?,
    @SerializedName("pluto-fixed-height-image")
    var plutoFixedHeightImage: PlutoFixedHeightImage?,
    @SerializedName("pluto-full-width")
    var plutoFullWidth: PlutoFullWidth?,
    @SerializedName("pluto-index-width")
    var plutoIndexWidth: PlutoIndexWidth?,
    @SerializedName("pluto-top-featured-post")
    var plutoTopFeaturedPost: PlutoTopFeaturedPost?,
    @SerializedName("post-thumbnail")
    var postThumbnail: PostThumbnail?
)