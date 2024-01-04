package com.sobhanmp.golazo.matches.model

import com.sobhanmp.golazo.network.httpclient.NetworkModule
data class AwayTeamModel(
    val crest: String,
    val id: Int,
    val name: String,
    val shortName: String,
    val tla: String
){

}