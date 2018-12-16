package com.nastia.administrator.domain.entity

data class Advice (val id: Int,
                   val advice: String,
                   val isFavorite: Boolean) : DomainEntity