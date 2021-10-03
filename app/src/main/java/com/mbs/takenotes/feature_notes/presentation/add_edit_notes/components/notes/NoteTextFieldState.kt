package com.mbs.takenotes.feature_notes.presentation.add_edit_notes.components.notes

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)