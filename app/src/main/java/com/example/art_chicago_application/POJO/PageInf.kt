package com.example.art_chicago_application.POJO

import com.google.gson.annotations.SerializedName


class PageInf {
    @SerializedName("data")
    var data: ImgData? = null
}

class ImgData {
    @SerializedName("id")
    var id = 0

    @SerializedName("title")
    var title: String? = null

    @SerializedName("place_of_origin")
    var placeOfOrigin: String? = null

    @SerializedName("artist_title")
    var artistTitle: String? = null

    @SerializedName("image_id")
    var imageId: String? = null

}
