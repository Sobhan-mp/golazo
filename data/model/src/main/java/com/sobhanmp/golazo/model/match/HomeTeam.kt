package com.sobhanmp.golazo.model.match

import com.sobhanmp.golazo.matches.model.HomeTeamModel

data class HomeTeam(
    val crest: String,
    val id: Int,
    val name: String,
    val shortName: String,
    val tla: String
)

fun HomeTeam.toHomeTeamModel(): HomeTeamModel{
    return HomeTeamModel(
        crest = crest,
        id = id,
        name = name,
        shortName = shortName,
        tla = tla
    )
}