package com.nastia.administrator.domain.usecases

import com.nastia.administrator.domain.entity.Advice
import com.nastia.administrator.domain.executor.PostExecutorThread
import com.nastia.administrator.domain.repositories.AdviceRepository
import io.reactivex.Observable
import javax.inject.Inject

class GetAllFavoriteUseCase @Inject constructor(
    postExecutorThread: PostExecutorThread,
    private val adviceRepository: AdviceRepository
) : BaseUseCase(postExecutorThread) {

    fun getAllFavoriteAdvices(): Observable<List<Advice>> {
        return adviceRepository.getFavoriteAdvices()
            .observeOn(postExecutorThread)
            .subscribeOn(workExecutorThread)
    }
}