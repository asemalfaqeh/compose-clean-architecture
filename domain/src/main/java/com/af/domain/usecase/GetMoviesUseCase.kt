package com.af.domain.usecase

import com.af.domain.repositories.MoviesRepo

class GetMoviesUseCase(private val moviesRepo: MoviesRepo) {
    suspend operator fun invoke() = moviesRepo.getMoviesRepo()
}