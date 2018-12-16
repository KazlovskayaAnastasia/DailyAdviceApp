package com.nastia.administrator.data.entity

import com.google.gson.annotations.SerializedName

data class AdviceRequest(

    @SerializedName("slip_id")
    val id: Int,

    @SerializedName("advice")
    val advice: String
) : DataEntity