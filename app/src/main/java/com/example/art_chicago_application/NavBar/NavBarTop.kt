package com.example.art_chicago_application.NavBar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NavBarTop(modifier: Modifier = Modifier, text: String, onNavigateToList: () -> Unit, canGoBack: Boolean = false) {
    Row {
        if (canGoBack){
            Button(
                onClick = {
                    onNavigateToList()
                },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.background)
            ){
                Text(
                    text = "◀",
                    fontSize = 25.sp,
                    color = Color.Black,
                )
            }
        }
        Text(
            text = "ART " + text,
            modifier = Modifier.padding(10.dp),
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
            color = Color.Blue
        )
    }
}