package com.sobhanmp.golazo.matches.repository

import com.sobhanmp.golazo.matches.model.MatchesResponseModel
import com.sobhanmp.golazo.util.helper.Resource
import kotlinx.coroutines.flow.Flow

interface MatchesRepository {

    suspend fun getMatches(): Flow<Resource<MatchesResponseModel?>>
}