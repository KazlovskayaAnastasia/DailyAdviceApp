package com.nastia.administrator.daily_advice_app.inject

import com.nastia.administrator.daily_advice_app.app.App
import com.nastia.administrator.daily_advice_app.presentation.screen.activityAdvice.AdviceViewModel
import com.nastia.administrator.data.net.RestApi
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [AppModule::class, AndroidInjectionModule::class, DomainModule::class, ActivityBuilder::class])
interface AppComponent {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: App):Builder

        fun build():AppComponent
    }

    fun inject(viewModel: AdviceViewModel)

    fun inject(app: App)

    fun provideBackendService(): RestApi
}