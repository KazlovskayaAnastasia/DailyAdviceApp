package com.nastia.administrator.daily_advice_app.executor

import com.nastia.administrator.domain.executor.PostExecutorThread
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers

class UIThread : PostExecutorThread {
    override fun getScheduler(): Scheduler {
        return AndroidSchedulers.mainThread()
    }
}