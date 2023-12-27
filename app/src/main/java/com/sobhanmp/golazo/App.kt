package com.sobhanmp.golazo

import android.app.Application
import com.sobhanmp.golazo.network.httpclient.NetworkModuleInitializer
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger()
            androidContext(this@App)
            NetworkModuleInitializer.initModule()
        }
    }
}