package com.sobhanmp.golazo.model.match

import com.sobhanmp.golazo.matches.model.FullTimeModel

data class FullTime(
    val away: Any,
    val home: Any
)

fun FullTime.toFullTimeModel(): FullTimeModel{
    return FullTimeModel(
        away = away,
        home = home
    )
}