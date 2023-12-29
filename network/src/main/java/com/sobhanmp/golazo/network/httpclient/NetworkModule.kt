package com.sobhanmp.golazo.network.httpclient

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.engine.android.Android
import io.ktor.client.engine.android.AndroidEngineConfig
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.header
import org.koin.dsl.module

object NetworkModule {

    val module = module {
        single { createHttpClient(Android.create()) }
    }

    const val AUTH_KEY = "X-Auth-Token"
    const val KEY = "test"
    fun createHttpClient(engine: HttpClientEngine): HttpClient {
        return HttpClient(engine) {
            defaultRequest {
                header(
                    AUTH_KEY,
                    KEY
                )
            }
            install(Logging) {
                logger = Logger.DEFAULT
                level = LogLevel.ALL
            }
        }
    }
}