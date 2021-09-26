package com.mbs.takenotes.feature_notes.presentation.notes

import com.mbs.takenotes.feature_notes.domain.model.Note
import com.mbs.takenotes.feature_notes.domain.utli.NoteOrder
import com.mbs.takenotes.feature_notes.domain.utli.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
