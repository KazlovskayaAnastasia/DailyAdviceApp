package com.nastia.administrator.daily_advice_app.presentation.screen.activityAdvice

import android.databinding.ObservableBoolean
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
    var isLoading = ObservableBoolean()

    fun onRefresh(){
        isLoading.set(true)
        getAdviceUseCase.get().subscribeBy(
            onNext = {
                Log.e("aaa", "AdviceViewModel - onNext: " + it.toString() )

                isLoading.set(false)
                advice.set(it.advice)
            },
            onError = {
                Log.e("aaa", "AdviceViewModel - onError: " + it.toString())
            })
    }

    @Inject
    lateinit var getAdviceUseCase: GetAdviceUseCase

    init {
        App.appComponent.inject(this)
        onRefresh()
    }
}