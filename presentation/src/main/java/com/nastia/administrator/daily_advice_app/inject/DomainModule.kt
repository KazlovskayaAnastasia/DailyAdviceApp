package com.nastia.administrator.daily_advice_app.inject

import android.content.Context
import com.nastia.administrator.daily_advice_app.executor.UIThread
import com.nastia.administrator.data.net.RestService
import com.nastia.administrator.domain.executor.PostExecutorThread
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DomainModule (private val context: Context) {

    @Provides
    @Singleton
    fun provideContext(): Context = context

    @Provides
    @Singleton
    fun providePostExecutorThread(): PostExecutorThread = UIThread()

    @Provides
    fun provideRestService(serverUrl: String): RestService
            = RestService(serverUrl)
}