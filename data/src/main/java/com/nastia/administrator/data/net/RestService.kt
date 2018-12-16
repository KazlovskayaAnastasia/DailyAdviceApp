package com.nastia.administrator.data.net

import com.google.gson.GsonBuilder
import com.nastia.administrator.data.entity.Slip
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RestService(apiUrl: String) : RestApi {
    override fun getAdvice(): Observable<Slip> {
        return restApi.getAdvice()
    }

    private val restApi: RestApi

    init {
        val okHttpBuilder = OkHttpClient.Builder()
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .connectTimeout(30, TimeUnit.SECONDS)

        okHttpBuilder.addInterceptor(HttpLoggingInterceptor())

        val gson = GsonBuilder().create()

        val retrofit = Retrofit.Builder()
            .baseUrl(apiUrl)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(okHttpBuilder.build())
            .build()

        restApi = retrofit.create(RestApi::class.java)
    }
}