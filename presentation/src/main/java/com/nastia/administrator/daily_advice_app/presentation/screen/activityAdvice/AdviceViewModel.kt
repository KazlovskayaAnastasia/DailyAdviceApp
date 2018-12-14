package com.nastia.administrator.daily_advice_app.presentation.screen.activityAdvice

import android.databinding.ObservableField
import android.util.Log
import android.view.View
import com.nastia.administrator.daily_advice_app.app.App
import com.nastia.administrator.daily_advice_app.presentation.base.BaseViewModel
import com.nastia.administrator.domain.usecases.GetAdviceUseCase
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class AdviceViewModel : BaseViewModel<AdviceRouter>() {

    fun onClickSelect(v: View){
        router?.selectAdvice()
    }

    fun onClickFavoriteAdvice(v: View){
        router?.goToFavoriteAdvice()
    }

    var advice = ObservableField<String>("")
    var id : Int = 0

    @Inject
    lateinit var getAdviceUseCase: GetAdviceUseCase
//    lateinit var loadedadvice: Advice

    init {
        App.appComponent.inject(this)
        getAdviceUseCase.get().subscribeBy(
            onNext = {
                Log.e("aaa", "AdviceViewModel - onNext: " + it.toString())
                advice.set(it.advice)
                id++
            },
            onError = {
                Log.e("aaa", "AdviceViewModel - onError: " + it.toString())
            })
    }
}