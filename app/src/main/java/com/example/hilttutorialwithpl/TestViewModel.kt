// TestViewModel.kt
package com.example.hilttutorialwithpl

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("SecondNamedTestString") testString: String,
    @Named("TestViewModel.string1") testString2: String
) : ViewModel() {
    init {
        Log.d("TestViewModel", "init: Message in the string: $testString ")
        Log.d("TestViewModel", "init: Message in the string: $testString2 ")
    }
}