package com.kweku.armah.mynote.data.repositoryimpl.di

import com.kweku.armah.mynote.data.database.dao.MyNoteEntityDao
import com.kweku.armah.mynote.data.repositoryimpl.MyNoteRepositoryImpl
import com.kweku.armah.mynote.domain.repository.MyNoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun providesMyNoteRepository(myNoteEntityDao: MyNoteEntityDao): MyNoteRepository =
        MyNoteRepositoryImpl(myNoteEntityDao = myNoteEntityDao)
}