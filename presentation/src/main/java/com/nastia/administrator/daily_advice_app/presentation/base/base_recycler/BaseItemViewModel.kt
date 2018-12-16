package com.nastia.administrator.daily_advice_app.presentation.base.base_recycler

abstract class BaseItemViewModel<Entity> {

    abstract fun bindItem(item: Entity, position: Int)

    open fun onItemClick() {
    }
}