package com.af.domain.repositories

import com.af.domain.entity.Movies

interface MoviesRepo {
    suspend fun getMoviesRepo() : Movies
}