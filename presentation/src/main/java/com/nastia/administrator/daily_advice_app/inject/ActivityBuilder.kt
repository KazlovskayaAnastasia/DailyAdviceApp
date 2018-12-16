package com.nastia.administrator.daily_advice_app.inject

import com.nastia.administrator.daily_advice_app.presentation.screen.activityAdvice.AdviceActivity
import com.nastia.administrator.daily_advice_app.presentation.screen.activityStart.StartActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun bindMainActivity(): StartActivity

    @ContributesAndroidInjector
    abstract fun bindAdviceActivity(): AdviceActivity
}