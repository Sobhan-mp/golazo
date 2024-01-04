package com.sobhanmp.golazo.model.match

import com.sobhanmp.golazo.matches.model.FiltersModel

data class Filters(
    val dateFrom: String,
    val dateTo: String,
    val permission: String
)

fun Filters.toFiltersModel(): FiltersModel{
    return FiltersModel(
        dateFrom = dateFrom,
        dateTo = dateTo,
        permission = permission
    )
}