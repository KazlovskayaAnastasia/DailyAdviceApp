package com.nastia.administrator.daily_advice_app.inject

import android.content.Context
import com.nastia.administrator.daily_advice_app.app.App
import com.nastia.administrator.daily_advice_app.executor.UIThread
import com.nastia.administrator.data.net.RestApi
import com.nastia.administrator.data.net.RestService
import com.nastia.administrator.data.repositories.AdviceRepositoryImpl
import com.nastia.administrator.domain.executor.PostExecutorThread
import com.nastia.administrator.domain.repositories.AdviceRepository
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class DomainModule  {

    @Provides
    @Singleton
    fun provideContext(app: App): Context = app.applicationContext

    @Provides
    @Singleton
    fun providePostExecutorThread(): PostExecutorThread = UIThread()

    @Provides
    fun provideRestService(@Named("serverUrl") serverUrl: String): RestApi
            = RestService(serverUrl)

    @Provides
    fun provideAdviceRepository(restService: RestApi)
            : AdviceRepository = AdviceRepositoryImpl(restService)

    @Provides
    @Named("serverUrl")
    fun provideServerUrl(): String {
        return "https://api.adviceslip.com"
    }
}

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideApplication(app : App):Context = app
}