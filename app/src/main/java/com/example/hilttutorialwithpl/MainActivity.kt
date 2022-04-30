package com.example.hilttutorialwithpl

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("FirstNamedTestString")
    lateinit var stringFromModule: String

    @Inject
    @Named("MainActivity.string1")
    lateinit var stringFromMainModule: String

    private val viewModel: TestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "onCreate: Injected string: $stringFromModule")
        Log.d("MainActivity", "onCreate: Injected string: $stringFromMainModule")

        viewModel
    }
}