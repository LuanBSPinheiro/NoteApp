package com.zeracodes.noteapp.feat_note.domain.use_case

import com.zeracodes.noteapp.feat_note.domain.model.Note
import com.zeracodes.noteapp.feat_note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}