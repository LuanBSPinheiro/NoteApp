package com.zeracodes.noteapp.feat_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.zeracodes.noteapp.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Greenish, RedPink, BabyBlue, Violet)
    }
}
