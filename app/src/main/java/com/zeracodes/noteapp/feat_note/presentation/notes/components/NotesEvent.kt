package com.zeracodes.noteapp.feat_note.presentation.notes.components

import com.zeracodes.noteapp.feat_note.domain.model.Note
import com.zeracodes.noteapp.feat_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
