package com.sobhanmp.golazo.model

data class ResultSet(
    val competitions: String,
    val count: Int,
    val first: String,
    val last: String,
    val played: Int
)