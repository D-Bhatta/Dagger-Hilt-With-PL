// MainModule.kt
package com.example.hilttutorialwithpl

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    @ActivityScoped
    @Provides
    @Named("MainActivity.string1")
    fun provideString1(
        @ActivityContext context: Context,
        @Named("FirstNamedTestString") stringFromAppModule: String
    ) =
        "${context.getString(R.string.injected_string)} - $stringFromAppModule"

    @ActivityScoped
    @Provides
    @Named("MainActivity.string2")
    fun providesString2(
        @ActivityContext context: Context,
        @Named("SecondNamedTestString") stringFromAppModule: String
    ) = "${context.getString(R.string.view_model_string)} - $stringFromAppModule"
}