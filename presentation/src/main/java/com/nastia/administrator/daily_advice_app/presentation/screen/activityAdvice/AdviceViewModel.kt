package com.nastia.administrator.daily_advice_app.presentation.screen.activityAdvice

import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.util.Log
import android.view.View
import com.nastia.administrator.daily_advice_app.app.App
import com.nastia.administrator.daily_advice_app.presentation.base.BaseViewModel
import com.nastia.administrator.domain.entity.Advice
import com.nastia.administrator.domain.usecases.AddToFavoriteUseCase
import com.nastia.administrator.domain.usecases.GetAdviceUseCase
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class AdviceViewModel : BaseViewModel<AdviceRouter>() {

    fun onClickSelect(v: View) {
        addToFavoriteUseCase.addToFavorite(adviceEntity).subscribeBy(
            onNext = {
                adviceEntity = it
                refresh()
            }
        )
    }

    fun onClickFavoriteAdvice(v: View) {
        router?.goToFavoriteAdvice()
    }

    private fun refresh() {
        advice.set(adviceEntity.advice)
        isFavorite.set(adviceEntity.isFavorite)
        router?.setBackground(adviceEntity.isFavorite)
    }

    var advice = ObservableField<String>("")
    var isFavorite = ObservableBoolean()
    lateinit var adviceEntity: Advice
    var isLoading = ObservableBoolean()

    fun onRefresh() {
        isLoading.set(true)
        getAdviceUseCase.get().subscribeBy(
            onNext = {
                Log.e("aaa", "AdviceViewModel - onNext: " + it.toString())

                isLoading.set(false)
                adviceEntity = it
                refresh()
            },
            onError = {
                Log.e("aaa", "AdviceViewModel - onError: " + it.toString())
            })
    }

    @Inject
    lateinit var getAdviceUseCase: GetAdviceUseCase

    @Inject
    lateinit var addToFavoriteUseCase: AddToFavoriteUseCase

    init {
        App.appComponent.inject(this)
        onRefresh()
    }
}