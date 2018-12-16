package com.nastia.administrator.domain.usecases

import com.nastia.administrator.domain.entity.Advice
import com.nastia.administrator.domain.executor.PostExecutorThread
import com.nastia.administrator.domain.repositories.AdviceRepository
import io.reactivex.Observable
import javax.inject.Inject

class AddToFavoriteUseCase @Inject constructor(
    postExecutorThread: PostExecutorThread,
    private val adviceRepository: AdviceRepository
) : BaseUseCase(postExecutorThread) {

    fun addToFavorite(advice : Advice): Observable<Advice> {
        return adviceRepository.addToFavorite(advice)
            .observeOn(postExecutorThread)
            .subscribeOn(workExecutorThread)
    }
}