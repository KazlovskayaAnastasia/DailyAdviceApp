package com.nastia.administrator.daily_advice_app.inject

import com.nastia.administrator.daily_advice_app.presentation.screen.activityAdvice.AdviceViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DomainModule::class])
interface AppComponent {

    fun inject(viewModel: AdviceViewModel)
}