package com.example.githubdagger_hilt.model

sealed class ResultData<out T> {
    data class Success<out T>(
        val data: T? = null
    ) : ResultData<T>()

    data class Loading<out T>(
        val nothing: Nothing? = null
    ) : ResultData<Nothing>()

    data class Failed(
        val message: String? = null
    ) : ResultData<Nothing>()

    data class Exception(
        val message: String? = null
    ) : ResultData<Nothing>()
}