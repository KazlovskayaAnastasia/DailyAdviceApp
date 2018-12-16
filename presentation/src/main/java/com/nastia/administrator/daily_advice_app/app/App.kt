package com.nastia.administrator.daily_advice_app.app

import android.app.Activity
import android.app.Application
import com.nastia.administrator.daily_advice_app.inject.AppComponent
import com.nastia.administrator.daily_advice_app.inject.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class App : Application(), HasActivityInjector {
    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector
    }

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    companion object {
        lateinit var instance: App
        @JvmStatic
        lateinit var appComponent: AppComponent
    }

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent
            .builder()
            .application(this)
            .build()

        appComponent.inject(this)
    }
}