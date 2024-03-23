package com.example.art_chicago_application.Data

import com.example.art_chicago_application.POJO.ImgData
import com.example.art_chicago_application.POJO.Note
import com.example.art_chicago_application.POJO.Page
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


class AppRepository() {
    private val hashPages: HashMap<Int, List<Note>?> = HashMap()
    private val hashNote: HashMap<Int, ImgData?> = HashMap()

    private var apiService = Retrofit.Builder()
        .baseUrl("https://api.artic.edu/")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
        .build()
        .create(APIService::class.java)

    suspend fun getNotesFromPage(pageNumber: Int): List<Note>? {
        if (!hashPages.containsKey(pageNumber)) {
            hashPages.put(pageNumber, apiService.loadPage(pageNumber)!!.data)
        }
        return hashPages.get(pageNumber)
    }

    suspend fun getImgData(note: Note): ImgData? {
        if (!hashNote.containsKey(note.id)){
            hashNote.put(note.id, apiService.loadPageInf(note.id)!!.data)
        }
        return hashNote.get(note.id)
    }

}
