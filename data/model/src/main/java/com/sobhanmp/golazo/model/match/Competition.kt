package com.sobhanmp.golazo.model.match

import com.sobhanmp.golazo.matches.model.CompetitionModel

data class Competition(
    val code: String,
    val emblem: String,
    val id: Int,
    val name: String,
    val type: String
)

fun Competition.toCompetitionModel():CompetitionModel{
    return CompetitionModel(
        code = code,
        emblem = emblem,
        id = id,
        name = name,
        type = type
    )
}