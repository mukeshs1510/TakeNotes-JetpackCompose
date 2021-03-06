package com.mbs.takenotes.feature_notes.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mbs.takenotes.feature_notes.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object{
        const val DATABASE_NAME = "notes_db"
    }

}