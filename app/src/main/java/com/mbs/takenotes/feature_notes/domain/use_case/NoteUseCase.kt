package com.mbs.takenotes.feature_notes.domain.use_case

data class NoteUseCase(
    val getNotes: GetNoteUseCase,
    val deleteNote: DeleteNote,
    val addNote: AddNote
)
