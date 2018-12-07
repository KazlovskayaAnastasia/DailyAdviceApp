package com.nastia.administrator.data.net

import com.nastia.administrator.data.entity.AdviceResponse
import io.reactivex.Observable
import retrofit2.http.*

interface RestApi {
    @GET("data/Advices")
    fun getAdvice(): Observable<List<AdviceResponse>>
}