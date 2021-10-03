package com.mbs.takenotes.feature_notes.domain.use_case

import com.mbs.takenotes.feature_notes.domain.model.Note
import com.mbs.takenotes.feature_notes.domain.repository.NoteRepository

class GetNotes(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }

}