package com.nastia.administrator.daily_advice_app.inject

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DomainModule::class])
interface AppComponent {

    fun inject(viewModel: TestViewModel)
}