package com.example.art_chicago_application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.switchMap
import androidx.lifecycle.viewModelScope
import com.example.art_chicago_application.Data.AppRepository
import com.example.art_chicago_application.Models.ImgInf
import com.example.art_chicago_application.Models.Note
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class ArtViewModel( private val appRepository: AppRepository) : ViewModel() {
    fun GetNotesFromPage(pageNumber: Int): LiveData<List<Note>>{
        return appRepository.getNotesFromPage(pageNumber).asLiveData()
    }
    fun GetImgInf(note: Note): LiveData<ImgInf>{
        return appRepository.getImgInf(note).asLiveData()
    }
}

