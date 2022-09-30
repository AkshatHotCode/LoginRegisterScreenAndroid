package com.example.firstapplication

import android.os.Bundle
import android.widget.Space
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firstapplication.ui.theme.*

//import com.example.firstapplication.ui.theme.fonts

class MainActivity : ComponentActivity() {

//    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstApplicationTheme {
                IntentView()
            }
        }
    }
}

@Composable
fun IntentView(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "FirstScreen", builder =
     {
        composable(
            "FirstScreen", content = { FirstScreen(navController = navController)}
        )
        composable(
          "LoginScreen", content = { LoginScreen(navController = navController)},
        )
        composable(
            "RegisterScreen", content = {RegisterScreen(navController = navController)}
        )
        composable(
             "DashboardScreen", content = { SarfarazActivity(navController = navController) }
        )
     }
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DashboardScreenPreview1() {
    FirstApplicationTheme {

    }
}