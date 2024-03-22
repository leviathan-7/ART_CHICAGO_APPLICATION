package com.example.art_chicago_application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.liveData
import com.example.art_chicago_application.Data.AppRepository
import com.example.art_chicago_application.POJO.ImgData
import com.example.art_chicago_application.POJO.Note

class ArtViewModel( private val appRepository: AppRepository) : ViewModel() {
    fun GetNotesFromPage(pageNumber: Int): LiveData<List<Note>?>{
        val lst: LiveData<List<Note>?> = liveData {
            val data = appRepository.getNotesFromPage(pageNumber)
            emit(data)
        }

        return lst
    }
    fun GetImgData(note: Note): LiveData<ImgData?>{
        val lst: LiveData<ImgData?> = liveData {
            val data = appRepository.getImgData(note)
            emit(data)
        }

        return lst
    }
}

