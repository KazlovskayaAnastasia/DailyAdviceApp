package com.nastia.administrator.domain.usecases

import com.nastia.administrator.domain.entity.Advice
import com.nastia.administrator.domain.executor.PostExecutorThread
import com.nastia.administrator.domain.repositories.AdviceRepository
import io.reactivex.Observable
import io.reactivex.schedulers.TestScheduler
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetAdviceUseCaseTest {

    @Mock
    lateinit var repository: AdviceRepository

    @Mock
    lateinit var postExecutorThread: PostExecutorThread

    @Test
    fun test() {

        val testScheduler = TestScheduler()
        val advice = Advice(1, "Be better", false)

        `when`(repository.getRandomAdvice()).thenReturn(
            Observable.just(
                advice
            )
        )

        val useCase = GetAdviceUseCase(postExecutorThread, repository)
        useCase.postExecutorThread = testScheduler
        useCase.workExecutorThread = testScheduler

        useCase
            .get()
            .subscribe {
                assert(it == advice)
            }
    }
}