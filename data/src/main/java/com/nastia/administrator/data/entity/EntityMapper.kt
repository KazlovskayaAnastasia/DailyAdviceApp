package com.nastia.administrator.data.entity

import com.nastia.administrator.domain.entity.Advice

fun AdviceResponse.transformToDomain() : Advice{
    return Advice(id = id, text = text)
}