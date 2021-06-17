package dev.carlos.core.scheduler

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class SchedulerProvider : Scheduler {

    override fun io() = Schedulers.io()

    override fun computation() = Schedulers.computation()

    override fun newThread() = Schedulers.newThread()

    override fun ui(): io.reactivex.Scheduler = AndroidSchedulers.mainThread()
}
