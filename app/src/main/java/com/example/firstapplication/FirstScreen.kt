package com.example.firstapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firstapplication.ui.theme.aksfonts
import com.example.firstapplication.ui.theme.karla

@Composable
fun FirstScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Akshat(navController)
    }
}

@Composable
fun Akshat(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Akshat",
            fontWeight = FontWeight.Bold,
            style = TextStyle(fontSize = 80.sp),
            color = Color.White,
            modifier = Modifier,
            fontFamily = aksfonts
        )
    }
    Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.rectangleligth),
            contentDescription = null,
            modifier = Modifier.padding(bottom = 1.dp)
        )
        Spacer(modifier = Modifier.padding(top = 5.dp))
        Button(onClick = { navController.navigate("LoginScreen")},
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
            contentPadding = ButtonDefaults.ContentPadding
        ) {
            Text(text = "SignIn/Login",
                color = Color.Black,
                style = TextStyle(fontSize = 23.sp),
                modifier = Modifier
                    .background(color = Color.White)
                    .weight(2f),
                fontFamily = karla,
                textAlign = TextAlign.Center,
            )
        }
    }
}
