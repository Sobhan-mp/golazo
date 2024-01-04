package com.sobhanmp.golazo.matches.model

data class ScoreModel(
    val duration: String,
    val fullTime: FullTimeModel,
    val halfTime: HalfTimeModel,
    val winner: Any
)