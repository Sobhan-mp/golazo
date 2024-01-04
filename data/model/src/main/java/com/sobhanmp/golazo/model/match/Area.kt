package com.sobhanmp.golazo.model.match

import com.sobhanmp.golazo.matches.model.AreaModel

data class Area(
    val code: String,
    val flag: String,
    val id: Int,
    val name: String
)

fun Area.toAreaModel(): AreaModel{
    return AreaModel(
        code = code,
        flag = flag,
        id = id,
        name = name
    )
}