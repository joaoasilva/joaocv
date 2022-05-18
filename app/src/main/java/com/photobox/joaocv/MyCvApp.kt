package com.photobox.joaocv

import android.app.Application
import timber.log.Timber

class MyCvApp : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            // Debug Mode
            Timber.plant(Timber.DebugTree())
        } else {
            // Release Mode
        }
        Timber.d("Timber is working?")
    }
}
