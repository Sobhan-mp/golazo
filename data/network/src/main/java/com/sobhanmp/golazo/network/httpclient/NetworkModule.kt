package com.sobhanmp.golazo.network.httpclient

import io.github.cdimascio.dotenv.dotenv
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
import java.io.FileReader
import java.util.Properties

object NetworkModule {

    val module = module {
        single { createHttpClient(Android.create()) }
    }

    const val AUTH_KEY = "X-Auth-Token"
    val KEY : String = getApiKey()
    const val BASE_URL : String = "https://api.football-data.org/"
    fun createHttpClient(engine: HttpClientEngine): HttpClient {
        return HttpClient(engine) {
            defaultRequest {
                header(
                    AUTH_KEY,
                    KEY
                )
            }

            defaultRequest {
                url(BASE_URL)
            }

            install(Logging) {
                logger = Logger.DEFAULT
                level = LogLevel.ALL
            }
        }
    }

    private fun getApiKey(): String{
        return try{
            val dotenv = dotenv()
            dotenv["AUTH_KEY"] ?: ""
        } catch (e: Exception){
            ""
        }
    }
}
