package com.nastia.administrator.daily_advice_app.presentation.base

import android.support.v4.app.Fragment
import io.reactivex.disposables.CompositeDisposable

abstract class BaseFragment : Fragment() {

    private val compositeDisposable: CompositeDisposable by lazy {
        CompositeDisposable()
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.clear()
    }
}