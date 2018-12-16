package com.nastia.administrator.daily_advice_app.presentation.screen.activityFavorite.items

import android.databinding.ObservableField
import com.nastia.administrator.daily_advice_app.presentation.base.base_recycler.BaseItemViewModel
import com.nastia.administrator.domain.entity.Advice

class AdviceItemViewModel: BaseItemViewModel<Advice>() {

    val favoriteAdvice = ObservableField<String>("")

    override fun bindItem(item: Advice, position: Int) {
        favoriteAdvice.set(item.advice)
    }
}