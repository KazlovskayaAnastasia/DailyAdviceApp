package com.nastia.administrator.daily_advice_app.presentation.screen.activityStart

import com.nastia.administrator.daily_advice_app.presentation.base.BaseMvvmActivity

class StartActivity : BaseMvvmActivity<StartViewModel, StartRouter, ActivityStartBinding>() {
    override fun prodiveViewModel(): StartViewModel {
        return ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun provideRouter(): StartRouter {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun provideLayoutId(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}