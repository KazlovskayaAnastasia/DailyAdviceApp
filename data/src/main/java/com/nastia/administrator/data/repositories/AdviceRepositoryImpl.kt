package com.nastia.administrator.data.repositories

import com.nastia.administrator.data.entity.transformToDomain
import com.nastia.administrator.data.net.RestService
import com.nastia.administrator.domain.entity.Advice
import io.reactivex.Observable
import com.nastia.administrator.domain.repositories.AdviceRepository

class AdviceRepositoryImpl(private val apiService: RestService) : AdviceRepository {

    override fun getData(): Observable<List<Advice>> {

        return apiService.getAdvice()
            .map {
                it.map {
                    it.transformToDomain()
                }
            }
    }
}