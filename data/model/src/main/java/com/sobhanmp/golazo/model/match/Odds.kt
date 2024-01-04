package com.sobhanmp.golazo.model.match

import com.sobhanmp.golazo.matches.model.OddsModel

data class Odds(
    val msg: String
)

fun Odds.toOddsModel(): OddsModel{
    return OddsModel(msg = msg)
}