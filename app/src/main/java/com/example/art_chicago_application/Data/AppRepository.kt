package com.example.art_chicago_application.Data

import androidx.lifecycle.LiveData
import com.example.art_chicago_application.Models.ImgInf
import com.example.art_chicago_application.Models.Note
import kotlinx.coroutines.flow.Flow

class AppRepository() {
    fun getNotesFromPage(pageNumber: Int): Flow<List<Note>> {

    }

    fun getImgInf(note: Note): Flow<ImgInf> {

    }

}