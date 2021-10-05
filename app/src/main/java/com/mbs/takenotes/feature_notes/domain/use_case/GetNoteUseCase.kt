package com.mbs.takenotes.feature_notes.domain.use_case

import com.mbs.takenotes.feature_notes.domain.model.Note
import com.mbs.takenotes.feature_notes.domain.repository.NoteRepository
import com.mbs.takenotes.feature_notes.domain.utli.NoteOrder
import com.mbs.takenotes.feature_notes.domain.utli.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}