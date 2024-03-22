package com.example.art_chicago_application.POJO

import com.google.gson.annotations.SerializedName


class Page {
    @SerializedName("data")
    var data: List<Note>? = null
}

class Note {
    @SerializedName("id")
    var id = 0

    @SerializedName("title")
    var title: String? = null
}
