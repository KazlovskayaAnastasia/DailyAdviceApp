package com.nastia.administrator.daily_advice_app.presentation.base.base_recycler

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import com.nastia.administrator.daily_advice_app.BR

abstract class BaseViewHolder<Entity,
        VM : BaseItemViewModel<Entity>,
        Binding : ViewDataBinding>
    (private val binding: Binding, val viewModel: VM) : RecyclerView.ViewHolder(binding.root) {

    init {
        binding.setVariable(BR.viewModel, viewModel)
    }

    fun bind(item: Entity, position: Int) {
        viewModel.bindItem(item, position)
        binding.executePendingBindings()
    }

}