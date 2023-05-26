package com.af.notes.di

import com.af.data.datasource.MoviesApiService
import com.af.data.repositories_impl.MoviesRepoImpl
import com.af.domain.repositories.MoviesRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideMoviesRepo(moviesApiService: MoviesApiService) : MoviesRepo{
        return MoviesRepoImpl(moviesApiService)
    }
}