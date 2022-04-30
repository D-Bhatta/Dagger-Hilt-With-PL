// TestViewModelModule.kt
package com.example.hilttutorialwithpl

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Named

@Module
@InstallIn(ViewModelComponent::class)
object TestViewModelModule {

    @ViewModelScoped
    @Provides
    @Named("TestViewModel.string1")
    fun providesString1(
        @ApplicationContext context: Context,
        @Named("FirstNamedTestString") stringFromAppModule: String
    ) = "${context.getString(R.string.view_model_string)} - $stringFromAppModule"
}