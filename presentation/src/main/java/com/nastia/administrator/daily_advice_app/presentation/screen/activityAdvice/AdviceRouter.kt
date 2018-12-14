package com.nastia.administrator.daily_advice_app.presentation.screen.activityAdvice

import android.content.Intent
import com.nastia.administrator.daily_advice_app.R
import com.nastia.administrator.daily_advice_app.presentation.base.BaseRouter
import com.nastia.administrator.daily_advice_app.presentation.screen.activityFavorite.FavoriteAdviceActivity
import kotlinx.android.synthetic.main.activity_advice.*

class AdviceRouter (activity: AdviceActivity) : BaseRouter<AdviceActivity>(activity) {

    fun selectAdvice(){
        activity.iv_heart.setBackgroundResource(R.drawable.heart_red)
    }

    fun goToFavoriteAdvice() {
        val intent = Intent(activity, FavoriteAdviceActivity::class.java)
        activity.startActivity(intent)
    }

}