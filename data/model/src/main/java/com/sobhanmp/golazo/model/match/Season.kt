package com.sobhanmp.golazo.model.match

import com.sobhanmp.golazo.matches.model.SeasonModel

data class Season(
    val currentMatchday: Int,
    val endDate: String,
    val id: Int,
    val startDate: String,
    val winner: Any
)

fun Season.toSeasonModel(): SeasonModel{
    return SeasonModel(
        currentMatchday = currentMatchday,
        endDate = endDate,
        id = id,
        startDate = startDate,
        winner = winner
    )
}