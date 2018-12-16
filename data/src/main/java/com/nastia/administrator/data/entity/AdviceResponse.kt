package com.nastia.administrator.data.entity

import com.google.gson.annotations.SerializedName

data class Slip(
    @SerializedName("slip")
    val advice: AdviceResponse
) : DataEntity

data class AdviceResponse(
    @SerializedName("slip_id")
    val id: Int,

    @SerializedName("advice")
    val text: String
)