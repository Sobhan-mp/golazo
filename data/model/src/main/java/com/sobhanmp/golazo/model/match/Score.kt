package com.sobhanmp.golazo.model.match

import com.sobhanmp.golazo.matches.model.ScoreModel

data class Score(
    val duration: String,
    val fullTime: FullTime,
    val halfTime: HalfTime,
    val winner: Any
)

fun Score.toScoreModel(): ScoreModel{
    return ScoreModel(
        duration = duration,
        fullTime = fullTime.toFullTimeModel(),
        halfTime = halfTime.toHalfTimeModel(),
        winner = winner
    )
}