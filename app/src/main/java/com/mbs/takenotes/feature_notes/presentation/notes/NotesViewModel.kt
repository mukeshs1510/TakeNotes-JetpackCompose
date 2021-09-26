package com.mbs.takenotes.feature_notes.presentation.notes

import androidx.lifecycle.ViewModel
import com.mbs.takenotes.feature_notes.domain.use_case.NoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val noteUseCase: NoteUseCase
): ViewModel() {

}