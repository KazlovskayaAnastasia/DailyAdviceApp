package com.nastia.administrator.domain.executor

import io.reactivex.Scheduler

interface PostExecutorThread {
    fun getScheduler(): Scheduler
}