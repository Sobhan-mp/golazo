package com.sobhanmp.golazo.matches.model

data class MatcheModel(
    val area: AreaModel,
    val awayTeam: AwayTeamModel,
    val competition: CompetitionModel,
    val group: Any,
    val homeTeam: HomeTeamModel,
    val id: Int,
    val lastUpdated: String,
    val matchday: Int,
    val odds: OddsModel,
    val referees: List<Any>,
    val score: ScoreModel,
    val season: SeasonModel,
    val stage: String,
    val status: String,
    val utcDate: String
)