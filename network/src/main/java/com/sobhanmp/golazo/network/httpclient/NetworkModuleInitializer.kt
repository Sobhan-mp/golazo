package com.sobhanmp.golazo.network.httpclient

import org.koin.core.context.startKoin

public object NetworkModuleInitializer {
    fun initModule() {
        startKoin {
            NetworkModule.module
        }
    }
}