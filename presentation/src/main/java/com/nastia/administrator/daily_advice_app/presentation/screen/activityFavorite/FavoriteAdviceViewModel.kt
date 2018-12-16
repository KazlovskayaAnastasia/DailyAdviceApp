package com.nastia.administrator.daily_advice_app.presentation.screen.activityFavorite

import com.nastia.administrator.daily_advice_app.app.App
import com.nastia.administrator.daily_advice_app.presentation.base.BaseViewModel
import com.nastia.administrator.daily_advice_app.presentation.screen.activityFavorite.items.AdviceItemAdapter
import com.nastia.administrator.daily_advice_app.presentation.screen.activityFavorite.items.AdviceItemViewModel
import com.nastia.administrator.domain.entity.Advice

class FavoriteAdviceViewModel : BaseViewModel<FavoriteAdviceRouter>(){

    var datalist = ArrayList<AdviceItemViewModel>()

    val adapter = AdviceItemAdapter()

//    @Inject
//    lateinit var adviceUseCase : GetAdviceUseCase

    init {


        App.appComponent.inject(this)

        var advice = Advice(0 , "asdda")

        adapter.addItems(listOf(advice))

//        val disposable = adviceUseCase.get().subscribeBy(
//            onNext = {
//                //ToDo передать данные в адаптер
//            },
//            onError = {
//                router?.showError(it)
//            }
//        )
        //addToDisposable(disposable)
    }

}