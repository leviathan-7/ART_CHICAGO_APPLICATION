package com.example.art_chicago_application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.art_chicago_application.Models.Note
import com.example.art_chicago_application.ui.theme.ART_CHICAGO_APPLICATIONTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ART_CHICAGO_APPLICATIONTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtApp()
                }
            }
        }
    }
}

var listPage: Int = 1
var buttonNote: Note? = null

@Composable
fun ArtApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "ArtList") {
        composable("ArtList") {
            ArtList(
                onNavigateToInf = { navController.navigate("InfApp") },
                onNavigateToList = { navController.navigate("ArtList") }
            )
        }
        composable("InfApp") {
            InfPage(
                onNavigateToList = { navController.navigate("ArtList") }
            )
        }
    }
}