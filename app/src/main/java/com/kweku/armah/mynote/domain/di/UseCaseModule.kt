package com.kweku.armah.mynote.domain.di

import com.kweku.armah.mynote.domain.usecase.AddMyNote
import com.kweku.armah.mynote.domain.usecase.DeleteMyNote
import com.kweku.armah.mynote.domain.usecase.GetAllNotes
import com.kweku.armah.mynote.domain.usecase.GetNoteWithId
import com.kweku.armah.mynote.domain.usecase.MyNoteUsecases
import com.kweku.armah.mynote.domain.usecase.UpdateMyNote
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@InstallIn(ViewModelComponent::class)
@Module
object UseCaseModule {

    @ViewModelScoped
    @Provides
    fun provideUseCases(
        addMyNote: AddMyNote,
        updateMyNote: UpdateMyNote,
        deleteMyNote: DeleteMyNote,
        getAllNotes: GetAllNotes,
        getNoteWithId: GetNoteWithId
    ) = MyNoteUsecases(
        addMyNote = addMyNote,
        updateMyNote = updateMyNote,
        deleteMyNote = deleteMyNote,
        getAllNotes = getAllNotes,
        getNoteWithId = getNoteWithId
    )
}
