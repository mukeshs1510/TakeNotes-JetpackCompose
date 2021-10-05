package com.mbs.takenotes.feature_notes.presentation.add_edit_notes.components.notes

import androidx.compose.animation.Animatable
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.mbs.takenotes.feature_notes.presentation.add_edit_notes.components.AddEditNoteViewModel

@Composable
fun AddEditNoteEvent(
    navController: NavController,
    noteColor: Int,
    viewModel: AddEditNoteViewModel = hiltViewModel()
) {

    val titleState = viewModel.noteTitle.value
    val contentState = viewModel.noteContent.value

    val scaffoldState = rememberScaffoldState()

    val noteBackgroundAnimatable = remember {
        Animatable(
            Color(noteColor)
        )
    }

}