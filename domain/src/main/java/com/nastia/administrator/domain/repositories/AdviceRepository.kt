package com.nastia.administrator.domain.repositories

import com.nastia.administrator.domain.entity.Advice
import io.reactivex.Observable

interface AdviceRepository : BaseRepository {

    fun getData(): Observable<List<Advice>>
}