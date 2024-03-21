package com.example.art_chicago_application.NavBar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.art_chicago_application.listPage

@Composable
fun NavBarBottom(modifier: Modifier = Modifier, onNavigateToList: () -> Unit) {
    Row {
        if(listPage > 1){
            Button(
                onClick = {
                    listPage--
                    onNavigateToList()
                },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.background)
            ){
                Text(
                    text = "◀",
                    fontSize = 35.sp,
                    color = Color.Black,
                )
            }
        }
        Spacer(Modifier.weight(1f))
        if(listPage < 10406){
            Button(
                onClick = {
                    listPage++
                    onNavigateToList()
                },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.background)
            ){
                Text(
                    text = "▶",
                    fontSize = 35.sp,
                    color = Color.Black,
                )
            }
        }
    }
}