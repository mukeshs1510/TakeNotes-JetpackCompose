package com.mbs.takenotes.feature_notes.presentation.notes

import com.mbs.takenotes.feature_notes.domain.model.Note
import com.mbs.takenotes.feature_notes.domain.utli.NoteOrder

sealed class NotesEvents{

    data class Order(val noteOrder: NoteOrder): NotesEvents()
    data class DeleteNote(val note: Note): NotesEvents()
    object RestoreNote: NotesEvents()
    object ToggleOrderSection: NotesEvents()

}
