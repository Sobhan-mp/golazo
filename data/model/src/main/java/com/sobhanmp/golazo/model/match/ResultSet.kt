package com.sobhanmp.golazo.model.match

import com.sobhanmp.golazo.matches.model.ResultSetModel

data class ResultSet(
    val competitions: String,
    val count: Int,
    val first: String,
    val last: String,
    val played: Int
)

fun ResultSet.toResultSetModel(): ResultSetModel{
    return ResultSetModel(
        competitions = competitions,
        count = count,
        first = first,
        last = last,
        played = played
    )
}