package com.nastia.administrator.daily_advice_app.presentation.screen.activityStart

import android.content.Intent
import com.nastia.administrator.daily_advice_app.presentation.base.BaseRouter

class StartRouter (activity: StartActivity) : BaseRouter<StartActivity>(activity) {

    fun goToAdvice() {
        val intent = Intent(activity, AdviceActivity::class.java)
        activity.startActivity(intent)
    }
}