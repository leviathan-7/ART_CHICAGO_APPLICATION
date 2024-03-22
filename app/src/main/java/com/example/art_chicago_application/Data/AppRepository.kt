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
    private var apiService: APIService? = null
    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://api.artic.edu/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build()
        apiService = retrofit.create(APIService::class.java);
    }


    suspend fun getNotesFromPage(pageNumber: Int): List<Note>? {
        return apiService!!.loadPage(pageNumber)!!.data
    }

    suspend fun getImgData(note: Note): ImgData? {
        return apiService!!.loadPageInf(note.id)!!.data
    }

}