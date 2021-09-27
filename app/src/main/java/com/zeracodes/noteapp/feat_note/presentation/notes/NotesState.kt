package com.zeracodes.noteapp.feat_note.presentation.notes

import com.zeracodes.noteapp.feat_note.domain.model.Note
import com.zeracodes.noteapp.feat_note.domain.util.NoteOrder
import com.zeracodes.noteapp.feat_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
