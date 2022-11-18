package com.kweku.armah.mynote.data.database.di

import android.content.Context
import androidx.room.Room
import com.kweku.armah.mynote.data.database.MyNoteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, MyNoteDatabase::class.java, "my_note_db").build()

    @Singleton
    @Provides
    fun provideMyNoteDao(database: MyNoteDatabase) = database.myNoteEntityDao()
}