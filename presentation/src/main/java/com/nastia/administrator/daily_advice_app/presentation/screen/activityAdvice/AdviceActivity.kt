package com.nastia.administrator.daily_advice_app.presentation.screen.activityAdvice

import android.arch.lifecycle.ViewModelProviders
import com.nastia.administrator.daily_advice_app.R
import com.nastia.administrator.daily_advice_app.databinding.ActivityAdviceBinding
import com.nastia.administrator.daily_advice_app.presentation.base.BaseMvvmActivity

class AdviceActivity : BaseMvvmActivity<AdviceViewModel, AdviceRouter, ActivityAdviceBinding>() {

    override fun provideViewModel(): AdviceViewModel {
        return ViewModelProviders.of(this).get(AdviceViewModel::class.java)
    }

    override fun provideRouter(): AdviceRouter = AdviceRouter(this)

    override fun provideLayoutId(): Int = R.layout.activity_advice

}