package com.sobhanmp.golazo.model.match

import com.sobhanmp.golazo.matches.model.HalfTimeModel

data class HalfTime(
    val away: Any,
    val home: Any
)

fun HalfTime.toHalfTimeModel(): HalfTimeModel{
    return HalfTimeModel(
        away = away,
        home = home
    )
}