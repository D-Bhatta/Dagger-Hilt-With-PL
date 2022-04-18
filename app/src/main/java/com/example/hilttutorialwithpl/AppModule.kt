// AppModule.kt
package com.example.hilttutorialwithpl

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideTestString() = "This string has been injected from the AppModule"

    @Singleton
    @Provides
    @Named("FirstNamedTestString")
    fun provideNamedTestString() = "This is a named test string"

    @Singleton
    @Provides
    @Named("SecondNamedTestString")
    fun provideAnotherNamedTestString() = "This is another named test string"
}