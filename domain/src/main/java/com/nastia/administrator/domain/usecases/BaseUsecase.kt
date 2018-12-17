package com.nastia.administrator.domain.usecases

import com.nastia.administrator.domain.executor.PostExecutorThread
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

abstract class BaseUseCase(
    var postExecutorThread: Scheduler,
    var workExecutorThread: Scheduler = Schedulers.io()
) {
    constructor(postExecutorThread: PostExecutorThread)
            : this(postExecutorThread.getScheduler())
}