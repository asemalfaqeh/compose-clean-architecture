package com.af.notes.di

import com.af.domain.repositories.MoviesRepo
import com.af.domain.usecase.GetMoviesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideMoviesUseCase(moviesRepo: MoviesRepo) : GetMoviesUseCase{
        return GetMoviesUseCase(moviesRepo)
    }

}