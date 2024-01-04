package com.sobhanmp.golazo.model.match

import com.sobhanmp.golazo.matches.model.MatchesResponseModel

data class MatchesResponse(
    val filters: Filters,
    val matches: List<Matche>,
    val resultSet: ResultSet
)

fun MatchesResponse.toMatchesResponseModel(): MatchesResponseModel{
    return MatchesResponseModel(filters.toFiltersModel(), matches.map { it.toMatcheModel() }, resultSet.toResultSetModel())
}