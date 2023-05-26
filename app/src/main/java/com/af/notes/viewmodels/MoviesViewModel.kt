package com.af.notes.viewmodels

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.af.domain.entity.Movies
import com.af.domain.usecase.GetMoviesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.math.log

@HiltViewModel
class MoviesViewModel @Inject constructor(
    private var getMoviesUseCase: GetMoviesUseCase
) : ViewModel(){

    private  val TAG = "MoviesViewModel"

    private val _categories: MutableStateFlow<Movies?> = MutableStateFlow(null)
    val categories: StateFlow<Movies?> = _categories

    fun getMeals(){
        Log.d(TAG, "getMeals: ")
        viewModelScope.launch(Dispatchers.IO){
            try {
                _categories.value = getMoviesUseCase()
            } catch (e: Exception){
                Log.e("MealsViewModel", e.message.toString())
            }
        }
    }

}