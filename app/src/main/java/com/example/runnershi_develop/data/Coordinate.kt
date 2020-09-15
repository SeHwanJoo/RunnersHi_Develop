package com.example.runnershi_develop.data

import com.google.gson.annotations.SerializedName

data class Coordinate(
    @SerializedName("latitude")
    val latitude: Double,
    @SerializedName("longitude")
    val longitude: Double
)