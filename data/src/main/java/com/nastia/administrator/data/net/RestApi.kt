package com.nastia.administrator.data.net

import com.nastia.administrator.data.entity.Slip
import io.reactivex.Observable
import retrofit2.http.GET

interface RestApi {
    @GET("advice")
    fun getAdvice(): Observable<Slip>
}