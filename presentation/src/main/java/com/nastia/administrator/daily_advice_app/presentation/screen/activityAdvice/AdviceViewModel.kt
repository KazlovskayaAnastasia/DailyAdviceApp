package com.nastia.administrator.daily_advice_app.presentation.screen.activityAdvice

import android.databinding.ObservableField
import android.util.Log
import com.nastia.administrator.daily_advice_app.app.App
import com.nastia.administrator.daily_advice_app.presentation.base.BaseViewModel
import com.nastia.administrator.domain.entity.Advice
import com.nastia.administrator.domain.usecases.GetAdviceUseCase
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class AdviceViewModel : BaseViewModel<AdviceRouter>() {

//    var advice = ObservableField<String>("")
//    var id : Int = 0
//
//    @Inject
//    lateinit var getAdviceUseCase: GetAdviceUseCase
//    private var list: List<Advice> = emptyList()
//
//    init {
//        App.appComponent.inject(this)
//        getAdviceUseCase.get().subscribeBy(
//            onNext = {
//                list = it
//                Log.e("aaa", "AdviceViewModel - onNext: " + it.toString())
//                setData()
//                id++
//            },
//            onError = {
//                Log.e("aaa", "TeViewModel - onError: " + it.toString())
//            })
//    }
//
//    private fun setData() {
//        advice.set(list[id].advice)
//    }
}