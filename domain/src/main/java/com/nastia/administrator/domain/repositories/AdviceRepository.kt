package com.nastia.administrator.domain.repositories

import com.nastia.administrator.domain.entity.Advice
import io.reactivex.Observable

interface AdviceRepository : BaseRepository {

    fun getRandomAdvice(): Observable<Advice>

    fun getFavoriteAdvices() : Observable<List<Advice>>

    fun addToFavorite(advice: Advice): Observable<Advice>
}