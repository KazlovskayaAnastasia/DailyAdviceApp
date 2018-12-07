package com.nastia.administrator.data.entity

import entity.Advice

fun AdviceResponse.transformToDomain() : Advice{
    return Advice(id = id, text = text)
}