package com.mbs.takenotes.feature_notes.presentation.notes.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mbs.takenotes.feature_notes.domain.utli.NoteOrder
import com.mbs.takenotes.feature_notes.domain.utli.OrderType

@Composable
fun OrderSection(
    modifier: Modifier = Modifier,
    noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    onOrderChanges: (NoteOrder) -> Unit
) {
    
    Column(modifier = modifier) {
        Row(modifier = Modifier.fillMaxWidth()) {
            DefaultRadioButton(
                text = "Title",
                isSelected = noteOrder is NoteOrder.Title,
                onSelect = { onOrderChanges(NoteOrder.Title(noteOrder.orderType)) }
            )
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(
                text = "Date",
                isSelected = noteOrder is NoteOrder.Date,
                onSelect = { onOrderChanges(NoteOrder.Date(noteOrder.orderType)) }
            )
            Spacer(modifier = Modifier.width(8.dp))
            DefaultRadioButton(
                text = "Color",
                isSelected = noteOrder is NoteOrder.Color,
                onSelect = { onOrderChanges(NoteOrder.Color(noteOrder.orderType)) }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                DefaultRadioButton(
                    text = "Ascending",
                    isSelected = noteOrder.orderType is OrderType.Ascending,
                    onSelect = {
                        onOrderChanges(noteOrder.copy(OrderType.Ascending))
                    }
                )
                Spacer(modifier = Modifier.width(8.dp))
                DefaultRadioButton(
                    text = "Descending",
                    isSelected = noteOrder.orderType is OrderType.Descending,
                    onSelect = {
                        onOrderChanges(noteOrder.copy(OrderType.Descending))
                    }
                )
            }

        }
    }
    
}