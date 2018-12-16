package com.nastia.administrator.data.entity

import com.nastia.administrator.domain.entity.Advice

fun AdviceResponse.transformToDomain(isFavorite: Boolean): Advice {
    return Advice(id = id, advice = text, isFavorite = isFavorite)
}