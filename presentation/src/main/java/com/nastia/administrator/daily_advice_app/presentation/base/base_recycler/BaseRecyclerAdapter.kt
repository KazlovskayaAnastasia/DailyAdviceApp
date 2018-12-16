package com.nastia.administrator.daily_advice_app.presentation.base.base_recycler

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

abstract class BaseRecyclerAdapter
        <Entity,
        VM: BaseItemViewModel<Entity>>
    (private val itemList : MutableList<Entity> = mutableListOf())
    : RecyclerView.Adapter<BaseViewHolder<Entity, VM, *>>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): BaseViewHolder<Entity, VM, *> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: BaseViewHolder<Entity, VM, *>, position: Int) {
        holder.bind(itemList[position], position)
    }

    fun addItems(items:List<Entity>){
        val startPos = itemList.size
        itemList.addAll(items)
        notifyItemRangeChanged(startPos, items.size)
    }

    fun cleanItems(){
        itemList.clear()
        notifyDataSetChanged()
    }
}