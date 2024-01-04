package com.sobhanmp.golazo.api

import io.ktor.client.statement.HttpResponse

interface MatchApi {
    suspend fun getTodayMatches(): HttpResponse
}