package com.example.art_chicago_application.Data

import com.example.art_chicago_application.POJO.Page
import com.example.art_chicago_application.POJO.PageInf
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface APIService {
    @GET("artworks?fields=id%2Ctitle")
    suspend fun loadPage(@Query("page") pageNumber: Int): Page?

    @GET("artworks/{id}")
    suspend fun loadPageInf(@Path("id") id: Int): PageInf?

}