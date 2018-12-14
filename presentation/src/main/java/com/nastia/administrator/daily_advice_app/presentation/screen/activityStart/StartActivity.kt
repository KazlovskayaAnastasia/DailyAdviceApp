package com.nastia.administrator.daily_advice_app.presentation.screen.activityStart

import android.arch.lifecycle.ViewModelProviders
import com.nastia.administrator.daily_advice_app.R
import com.nastia.administrator.daily_advice_app.databinding.ActivityStartBinding
import com.nastia.administrator.daily_advice_app.presentation.base.BaseMvvmActivity

class StartActivity : BaseMvvmActivity<StartViewModel, StartRouter, ActivityStartBinding>() {
    override fun provideViewModel(): StartViewModel {
        return ViewModelProviders.of(this).get(StartViewModel::class.java)
    }

    override fun provideRouter(): StartRouter = StartRouter(this)

    override fun provideLayoutId(): Int = R.layout.activity_start
}