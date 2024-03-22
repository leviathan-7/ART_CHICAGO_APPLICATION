package com.example.art_chicago_application

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.art_chicago_application.NavBar.NavBarTop

@Composable
fun InfPage(modifier: Modifier = Modifier, onNavigateToList: () -> Unit) {
    val imgInf = artViewModel!!.GetImgData(buttonNote!!).observeAsState()
    if (imgInf.value != null){
        LazyColumn(modifier = modifier){
            item {
                NavBarTop(text = " Information", onNavigateToList = onNavigateToList, canGoBack = true)
            }
            item{
                Text(
                    " Title: " + imgInf.value!!.title,
                    fontSize = 25.sp,
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Blue
                )
            }
            item {
                Text(
                    text = " Author: " + imgInf.value!!.artistTitle,
                    fontSize = 25.sp,
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Blue
                )
            }
            item {
                Text(
                    text = " Origin: " + imgInf.value!!.placeOfOrigin,
                    fontSize = 25.sp,
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Blue
                )
            }
            item{
                ImgById(imgInf.value!!.imageId)
            }
            item {
                Button(
                    onClick = {
                        onNavigateToList()
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ){
                    Text(
                        "Go to list",
                        fontSize = 25.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}