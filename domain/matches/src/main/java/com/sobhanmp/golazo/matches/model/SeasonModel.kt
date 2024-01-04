package com.sobhanmp.golazo.matches.model

data class SeasonModel(
    val currentMatchday: Int,
    val endDate: String,
    val id: Int,
    val startDate: String,
    val winner: Any
)