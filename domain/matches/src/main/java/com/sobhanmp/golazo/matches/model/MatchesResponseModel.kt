package com.sobhanmp.golazo.matches.model

data class MatchesResponseModel(
    val filters: FiltersModel,
    val matches: List<MatcheModel>,
    val resultSet: ResultSetModel
)