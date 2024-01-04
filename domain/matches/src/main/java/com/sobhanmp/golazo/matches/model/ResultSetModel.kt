package com.sobhanmp.golazo.matches.model

data class ResultSetModel(
    val competitions: String,
    val count: Int,
    val first: String,
    val last: String,
    val played: Int
)