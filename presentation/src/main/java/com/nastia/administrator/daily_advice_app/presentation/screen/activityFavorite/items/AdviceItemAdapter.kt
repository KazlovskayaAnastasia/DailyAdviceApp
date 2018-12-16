package com.nastia.administrator.daily_advice_app.presentation.screen.activityFavorite.items

import android.view.ViewGroup
import com.nastia.administrator.daily_advice_app.presentation.base.base_recycler.BaseRecyclerAdapter
import com.nastia.administrator.domain.entity.Advice

class AdviceItemAdapter: BaseRecyclerAdapter<Advice, AdviceItemViewModel>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): AdviceItemViewHolder {
        return AdviceItemViewHolder.create(viewGroup, AdviceItemViewModel())

    }
}