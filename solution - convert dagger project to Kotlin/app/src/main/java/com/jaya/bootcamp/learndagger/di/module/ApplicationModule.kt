package com.jaya.bootcamp.learndagger.di.module

import android.content.Context

import com.jaya.bootcamp.learndagger.MyApplication
import com.jaya.bootcamp.learndagger.di.ApplicationContext
import com.jaya.bootcamp.learndagger.di.DatabaseInfo
import com.jaya.bootcamp.learndagger.di.NetworkInfo

import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context = application

    @Provides
    @DatabaseInfo
    fun provideDatabaseName(): String = "dummy_db"

    @Provides
    @DatabaseInfo
    fun provideDatabaseVersion(): Int = 1

    @Provides
    @NetworkInfo
    fun provideApiKey(): String = "SOME_API_KEY"
}
