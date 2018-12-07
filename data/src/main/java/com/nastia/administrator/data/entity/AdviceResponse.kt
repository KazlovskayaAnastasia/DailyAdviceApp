package com.nastia.administrator.data.entity

import com.google.gson.annotations.SerializedName

data class AdviceResponse (
    @SerializedName("slip_id")
    val id:Int,

    @SerializedName("advice")
    val text:String) : DataEntity