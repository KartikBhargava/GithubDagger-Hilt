package com.example.githubdagger_hilt.network

import com.example.githubdagger_hilt.model.GithubDataModel
import com.example.githubdagger_hilt.other.NetworkConstants.URL_REPOSITORIES
import retrofit2.http.GET

interface ApiService {
    @GET(URL_REPOSITORIES)
    suspend fun getPublicRepositories() : GithubDataModel
}