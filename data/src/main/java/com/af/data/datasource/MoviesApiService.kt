package com.af.data.datasource

import com.af.domain.entity.Movies
import retrofit2.http.GET

interface MoviesApiService {
    @GET("movie/top_rated")
    suspend fun moviesDataSource() : Movies
}