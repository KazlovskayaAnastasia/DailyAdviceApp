package com.nastia.administrator.daily_advice_app.app

import android.app.Application
import com.nastia.administrator.daily_advice_app.inject.AppComponent
import com.nastia.administrator.daily_advice_app.inject.DaggerAppComponent
import com.nastia.administrator.daily_advice_app.inject.DomainModule

class App : Application() {

    companion object {
        lateinit var instance: App
        @JvmStatic lateinit var appComponent: AppComponent
    }

    init {
        instance = this
    }

    override fun onCreate() {
//        appComponent.inject(this)
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .domainModule(DomainModule(this))
            .build()

//        Fabric.with(this, Crashlytics())
    }
}