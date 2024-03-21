package com.example.art_chicago_application

import androidx.compose.foundation.layout.Row
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.art_chicago_application.Models.Note
import com.example.art_chicago_application.ui.theme.ART_CHICAGO_APPLICATIONTheme

@Composable
fun ArtCard(note: Note, modifier: Modifier = Modifier, onNavigateToInf: () -> Unit){
    Card(modifier = modifier, colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background)) {
        Row {
            Button(
                onClick = {
                    buttonNote = note
                    onNavigateToInf()
                },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.background)
            ){
                Text(
                    text = note.title,
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp,
                    color = Color.Black,
                )
            }
        }
    }
}