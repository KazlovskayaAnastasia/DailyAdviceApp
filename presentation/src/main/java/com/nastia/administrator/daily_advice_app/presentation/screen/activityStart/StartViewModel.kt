package com.nastia.administrator.daily_advice_app.presentation.screen.activityStart

import android.view.View
import com.nastia.administrator.daily_advice_app.presentation.base.BaseViewModel

class StartViewModel : BaseViewModel<StartRouter>() {

    fun onClickGo(v: View){
        router?.goToAdvice()
    }
}