package com.af.data.repositories_impl

import com.af.data.datasource.MoviesApiService
import com.af.domain.entity.Movies
import com.af.domain.repositories.MoviesRepo

class MoviesRepoImpl(private val moviesApiService: MoviesApiService) : MoviesRepo{

    private val TAG = "MoviesRepoImpl"
    override suspend fun getMoviesRepo(): Movies{
        return  moviesApiService.moviesDataSource()
    }

}