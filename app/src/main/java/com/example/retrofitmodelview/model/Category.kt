package com.example.retrofitmodelview.model


import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("count")
    var count: Int?,
    @SerializedName("description")
    var description: String?,
    @SerializedName("filter")
    var filter: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("parent")
    var parent: Int?,
    @SerializedName("slug")
    var slug: String?,
    @SerializedName("taxonomy")
    var taxonomy: String?,
    @SerializedName("term_group")
    var termGroup: Int?,
    @SerializedName("term_taxonomy_id")
    var termTaxonomyId: Int?,
    @SerializedName("urls")
    var urls: Urls?
)