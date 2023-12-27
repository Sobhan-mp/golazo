package com.sobhanmp.golazo.network.httpclient

import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.header
import io.ktor.client.request.headers
import io.ktor.http.headers
import org.koin.dsl.module

object NetworkModule {

    val module = module {
        single { createHttpClient() }
    }

    const val AUTH_KEY = "X-Auth-Token"
    const val KEY = ""
    private fun createHttpClient(): HttpClient {
        return HttpClient(Android) {
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