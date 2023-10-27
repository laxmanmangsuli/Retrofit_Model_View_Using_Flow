package com.example.retrofitmodelview.data.model


import com.google.gson.annotations.SerializedName

data class CostDetails(
    @SerializedName("currency_code")
    var currencyCode: String?,
    @SerializedName("currency_position")
    var currencyPosition: String?,
    @SerializedName("currency_symbol")
    var currencySymbol: String?,
    @SerializedName("values")
    var values: List<String?>?
)