package com.sobhanmp.golazo.model

data class MatchesResponse(
    val filters: Filters,
    val matches: List<Matche>,
    val resultSet: ResultSet
)