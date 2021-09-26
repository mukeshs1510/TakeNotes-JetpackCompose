package com.mbs.takenotes.feature_notes.domain.use_case

import com.mbs.takenotes.feature_notes.domain.model.Note
import com.mbs.takenotes.feature_notes.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }

}