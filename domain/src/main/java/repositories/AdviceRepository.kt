package repositories

import entity.Advice
import io.reactivex.Observable

interface AdviceRepository : BaseRepository {

    fun get(): Observable<List<Advice>>
}