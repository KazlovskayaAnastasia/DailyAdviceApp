package com.nastia.administrator.daily_advice_app.presentation.screen.activityFavorite

import android.util.Log
import com.nastia.administrator.daily_advice_app.app.App
import com.nastia.administrator.daily_advice_app.presentation.base.BaseViewModel
import com.nastia.administrator.daily_advice_app.presentation.screen.activityFavorite.items.AdviceItemAdapter
import com.nastia.administrator.daily_advice_app.presentation.screen.activityFavorite.items.AdviceItemViewModel
import com.nastia.administrator.domain.entity.Advice
import com.nastia.administrator.domain.usecases.GetAllFavoriteUseCase
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class FavoriteAdviceViewModel : BaseViewModel<FavoriteAdviceRouter>(){

    var datalist = ArrayList<AdviceItemViewModel>()

    val adapter = AdviceItemAdapter()

    @Inject
    lateinit var getAllFavoriteUseCase: GetAllFavoriteUseCase

    init {

        App.appComponent.inject(this)

        val advice = Advice(0 , "favorite advice here", true)

        adapter.addItems(listOf(advice))

        getAllFavoriteUseCase.getAllFavoriteAdvices().subscribeBy(
            onNext = {
                Log.e("aaa", "AdviceViewModel - onNext: " + it.toString() )
                //advice.set(it.advice)
            },
            onError = {
                Log.e("aaa", "AdviceViewModel - onError: " + it.toString())
            })

    }

}