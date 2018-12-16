package com.nastia.administrator.daily_advice_app.presentation.screen.activityFavorite.items

import android.view.LayoutInflater
import android.view.ViewGroup
import com.nastia.administrator.daily_advice_app.databinding.ItemFavoriteAdvaceBinding
import com.nastia.administrator.daily_advice_app.presentation.base.base_recycler.BaseViewHolder
import com.nastia.administrator.domain.entity.Advice

class AdviceItemViewHolder(
    binding: ItemFavoriteAdvaceBinding,
    viewModel: AdviceItemViewModel
) : BaseViewHolder<Advice, AdviceItemViewModel, ItemFavoriteAdvaceBinding>(binding, viewModel) {

    companion object {
        fun create(parent: ViewGroup,
                   viewModel: AdviceItemViewModel):AdviceItemViewHolder{

            val binding = ItemFavoriteAdvaceBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false)
            return AdviceItemViewHolder(binding, viewModel)
        }
    }
}