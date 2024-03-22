package com.example.art_chicago_application

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.art_chicago_application.NavBar.NavBarBottom
import com.example.art_chicago_application.NavBar.NavBarTop
import androidx.compose.foundation.lazy.items

@Composable
fun ArtList(modifier: Modifier = Modifier, onNavigateToInf: () -> Unit, onNavigateToList: () -> Unit) {
    val notesList = artViewModel!!.GetNotesFromPage(listPage).observeAsState()
    LazyColumn(modifier = modifier) {
        item {
            NavBarTop(text = " page = " + listPage, onNavigateToList = onNavigateToList)
        }

        if(notesList.value != null){
            items(notesList.value!!) { note ->
                ArtCard(
                    note = note,
                    modifier = Modifier.padding(10.dp),
                    onNavigateToInf = onNavigateToInf
                )
            }
        }

        item {
            NavBarBottom(onNavigateToList = onNavigateToList)
        }
    }
}
