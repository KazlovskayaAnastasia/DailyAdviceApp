package com.nastia.administrator.data.repositories

import com.nastia.administrator.data.entity.transformToDomain
import com.nastia.administrator.data.net.RestApi
import com.nastia.administrator.domain.entity.Advice
import com.nastia.administrator.domain.repositories.AdviceRepository
import io.reactivex.Observable
import javax.inject.Inject

class AdviceRepositoryImpl @Inject constructor(private val apiService: RestApi) : AdviceRepository {
    override fun getRandomAdvice(): Observable<Advice> {
        return apiService.getAdvice()
            .map {
                it.advice.transformToDomain()
            }
    }
}