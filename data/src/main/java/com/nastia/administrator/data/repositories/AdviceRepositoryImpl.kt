package com.nastia.administrator.data.repositories

import com.nastia.administrator.data.entity.transformToDomain
import com.nastia.administrator.data.net.RestApi
import com.nastia.administrator.domain.entity.Advice
import com.nastia.administrator.domain.repositories.AdviceRepository
import io.reactivex.Observable
import javax.inject.Inject

class AdviceRepositoryImpl @Inject constructor(private val apiService: RestApi) : AdviceRepository {

    var favoriteAdvices:MutableList<Advice> =  mutableListOf()

    override fun getRandomAdvice(): Observable<Advice> {
        return apiService.getAdvice()
            .map {
                it.advice.transformToDomain()
            }
    }

    override fun getFavoriteAdvices(): Observable<List<Advice>> {
        return Observable.just(favoriteAdvices)
    }

    override fun addToFavorite(advice : Advice): Observable<Advice> {
        val newFavorite = Advice(advice.id, advice.advice, true)
        favoriteAdvices.add(newFavorite)
        return Observable.just(newFavorite)
    }
}