package com.nastia.administrator.domain.usecases

import com.nastia.administrator.domain.entity.Advice
import com.nastia.administrator.domain.executor.PostExecutorThread
import com.nastia.administrator.domain.repositories.AdviceRepository
import io.reactivex.Observable
import javax.inject.Inject

class GetAdviceUseCase @Inject constructor(
    postExecutorThread: PostExecutorThread,
    private val adviceRepository: AdviceRepository
) : BaseUseCase(postExecutorThread) {

    fun get(): Observable<Advice> {
        return adviceRepository.getRandomAdvice()
            .observeOn(postExecutorThread)
            .subscribeOn(workExecutorThread)
    }
}