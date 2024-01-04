package com.sobhanmp.golazo.util.helper

sealed class Resource<T> {
    data class Success<T>(val data: T) : Resource<T>()
    data class Error(val message: String?): Resource<Unit>()
    data class Loading(val loading: Boolean): Resource<Unit>()

}