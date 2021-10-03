package com.mbs.takenotes.feature_notes.presentation.add_edit_notes.components

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.toArgb
import androidx.lifecycle.ViewModel
import com.mbs.takenotes.feature_notes.domain.model.Note
import com.mbs.takenotes.feature_notes.domain.use_case.NoteUseCase
import com.mbs.takenotes.feature_notes.presentation.add_edit_notes.components.notes.NoteTextFieldState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import javax.inject.Inject

@HiltViewModel
class AddEditNoteViewModel @Inject constructor(
    private val noteUseCase: NoteUseCase
) : ViewModel() {

    private val _noteTitle = mutableStateOf(NoteTextFieldState())
    val noteTitle: State<NoteTextFieldState> = _noteTitle

    private val _noteContent = mutableStateOf(NoteTextFieldState())
    val noteContent: State<NoteTextFieldState> = _noteContent

    private val _noteColor = mutableStateOf<Int>(Note.noteColors.random().toArgb())
    val noteColor: State<Int> = _noteColor

//    private val _eventFlow = MutableSharedFlow<>()

}
