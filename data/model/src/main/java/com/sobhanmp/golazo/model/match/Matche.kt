package com.sobhanmp.golazo.model.match

import com.sobhanmp.golazo.matches.model.MatcheModel

data class Matche(
    val area: Area,
    val awayTeam: AwayTeam,
    val competition: Competition,
    val group: Any,
    val homeTeam: HomeTeam,
    val id: Int,
    val lastUpdated: String,
    val matchday: Int,
    val odds: Odds,
    val referees: List<Any>,
    val score: Score,
    val season: Season,
    val stage: String,
    val status: String,
    val utcDate: String
)

fun Matche.toMatcheModel(): MatcheModel{
    return MatcheModel(
        area.toAreaModel(),
        awayTeam.toAwayTeamModel(),
        competition.toCompetitionModel(),
        group,
        homeTeam.toHomeTeamModel(),
        id,
        lastUpdated,
        matchday,
        odds.toOddsModel(),
        referees,
        score.toScoreModel(),
        season.toSeasonModel(),
        stage,
        status,
        utcDate
    )
}