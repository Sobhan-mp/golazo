package com.sobhanmp.golazo.api

import com.sobhanmp.golazo.model.MatchesResponse
import io.ktor.client.statement.HttpResponse

interface MatchApi {
    suspend fun getTodayMatches(): HttpResponse
}