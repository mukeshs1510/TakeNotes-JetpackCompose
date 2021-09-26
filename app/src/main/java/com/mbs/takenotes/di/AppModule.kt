package com.mbs.takenotes.di

import android.app.Application
import androidx.room.Room
import com.mbs.takenotes.feature_notes.data.data_source.NoteDao
import com.mbs.takenotes.feature_notes.data.data_source.NoteDatabase
import com.mbs.takenotes.feature_notes.data.repository.NoteRepositoryImplementation
import com.mbs.takenotes.feature_notes.domain.repository.NoteRepository
import com.mbs.takenotes.feature_notes.domain.use_case.DeleteNote
import com.mbs.takenotes.feature_notes.domain.use_case.GetNoteUseCase
import com.mbs.takenotes.feature_notes.domain.use_case.NoteUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providerNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepo(db: NoteDatabase): NoteRepository{
        return NoteRepositoryImplementation(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCase {
        return NoteUseCase(
            getNotes = GetNoteUseCase(repository),
            deleteNote = DeleteNote(repository)
        )
    }

}