package com.nastia.administrator.data.repositories

import com.nastia.administrator.data.entity.transformToDomain
import com.nastia.administrator.data.net.RestService
import entity.Advice
import io.reactivex.Observable
import repositories.AdviceRepository

class AdviceRepositoryImpl(private val apiService: RestService) : AdviceRepository {

    override fun get(): Observable<List<Advice>> {

        return apiService.getAdvice()
            .map {
                it.map {
                    it.transformToDomain()
                }
            }
    }
}