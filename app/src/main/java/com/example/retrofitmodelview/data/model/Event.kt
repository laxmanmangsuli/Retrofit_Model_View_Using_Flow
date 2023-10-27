package com.example.retrofitmodelview.data.model


import com.google.gson.annotations.SerializedName

data class Event(
//    @SerializedName("all_day")
//    var allDay: Boolean?,
//    @SerializedName("author")
//    var author: String?,
//    @SerializedName("categories")
//    var categories: List<Category?>?,
//    @SerializedName("cost")
//    var cost: String?,//
//    @SerializedName("cost_details")
//    var costDetails: CostDetails?,
//    @SerializedName("date")
//    var date: String?,
//    @SerializedName("date_utc")
//    var dateUtc: String?,
//    @SerializedName("description")
//    var description: String?,
    @SerializedName("end_date")
    var endDate: String?,//
//    @SerializedName("end_date_details")
//    var endDateDetails: EndDateDetails?,
//    @SerializedName("excerpt")
//    var excerpt: String?,
//    @SerializedName("featured")
//    var featured: Boolean?,
//    @SerializedName("global_id")
//    var globalId: String?,
//    @SerializedName("global_id_lineage")
//    var globalIdLineage: List<String?>?,
//    @SerializedName("hide_from_listings")
//    var hideFromListings: Boolean?,
//    @SerializedName("id")
//    var id: Int?,
    @SerializedName("image")
    var image: com.example.retrofitmodelview.data.model.Image?,
//    @SerializedName("modified")
//    var modified: String?,
//    @SerializedName("modified_utc")
//    var modifiedUtc: String?,
//    @SerializedName("organizer")
//    var organizer: List<Any?>?,
//    @SerializedName("rest_url")
//    var restUrl: String?,
//    @SerializedName("show_map")
//    var showMap: Boolean?,
//    @SerializedName("show_map_link")
//    var showMapLink: Boolean?,
    @SerializedName("slug")
    var slug: String?,
    @SerializedName("start_date")
    var startDate: String?,//
//    @SerializedName("start_date_details")
//    var startDateDetails: StartDateDetails?,
//    @SerializedName("status")
//    var status: String?,
//    @SerializedName("sticky")
//    var sticky: Boolean?,
//    @SerializedName("tags")
//    var tags: List<Any?>?,
    @SerializedName("timezone")//
    var timezone: String?,
//    @SerializedName("timezone_abbr")
//    var timezoneAbbr: String?,
    @SerializedName("title")//
    var title: String?,
//    @SerializedName("url")
//    var url: String?,
//    @SerializedName("utc_end_date")
//    var utcEndDate: String?,
//    @SerializedName("utc_end_date_details")
//    var utcEndDateDetails: UtcEndDateDetails?,
//    @SerializedName("title")
//    var utcStartDate: String?,
//    @SerializedName("utc_start_date_details")
//    var utcStartDateDetails: UtcStartDateDetails?,
//    @SerializedName("venue")
//    var venue: List<Any?>?,
    @SerializedName("website")
    var website: String?
)