package com.sobhanmp.golazo.model.match

import com.sobhanmp.golazo.matches.model.AwayTeamModel

data class AwayTeam(
    val crest: String,
    val id: Int,
    val name: String,
    val shortName: String,
    val tla: String
)

fun AwayTeam.toAwayTeamModel(): AwayTeamModel {
    return AwayTeamModel(
        crest = crest,
        id = id,
        name = name,
        shortName = shortName,
        tla = tla
    )
}