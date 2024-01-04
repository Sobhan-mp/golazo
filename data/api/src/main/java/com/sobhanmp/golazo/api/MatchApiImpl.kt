package com.sobhanmp.golazo.api

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import org.koin.java.KoinJavaComponent.inject

class MatchApiImpl: MatchApi {
    private val httpClient: HttpClient by inject(HttpClient::class.java)
    override suspend fun getTodayMatches(): HttpResponse {
        return httpClient.get("v4/matches/")
    }
}