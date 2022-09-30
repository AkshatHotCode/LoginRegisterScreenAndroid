package com.example.firstapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firstapplication.ui.theme.AkshatWhite
import com.example.firstapplication.ui.theme.Bg
import com.example.firstapplication.ui.theme.FirstApplicationTheme
import com.example.firstapplication.ui.theme.Pink

//@Composable
//fun DashboardScreen (navController: NavController) {
//    Box(modifier = Modifier
//        .fillMaxSize(),
//        contentAlignment = Alignment.Center
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.bg),
//            contentDescription = null,
//            contentScale = ContentScale.Crop
//        )
//
//        Column(Modifier.fillMaxSize()
//            .padding(top = 50.dp)
//            .width(100.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Card(
//                Modifier.size(200.dp)
//            ){
//                Box(modifier = Modifier
//                    .width(100.dp)
//                ) {
//                    Image(painter = painterResource(id = R.drawable.sun), contentDescription = null, modifier = Modifier.width(100.dp))
//                }
//            }
//        }
//    }
//}

@Composable
fun SarfarazActivity(navController: NavController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Bg)) {
        Card(
            modifier = Modifier
                .height(400.dp)
                .fillMaxWidth(),
            RoundedCornerShape(bottomStart = 50.dp, bottomEnd = 50.dp),
            backgroundColor = Pink,
        ){}
        Text(text = "Don't have an account?SignUp",
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 18.dp)
        )
    }
    Column(modifier = Modifier,
//        verticalArrangement = Arrangement.Center,
    ) {
        Card(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 160.dp)
                .height(500.dp)
                .fillMaxWidth(),
            RoundedCornerShape(50.dp),
            backgroundColor = Color.White,
        ) {
            Column() {
                Text(text = "Login",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = 40.dp, top = 30.dp),
                    fontSize = 30.sp
                )

                Spacer(modifier = Modifier.padding(top = 30.dp))

                Text(text = "Username",
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(start = 40.dp),
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.padding(top = 12.dp))

                var email by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(value = email,
                    onValueChange = { newText -> email = newText},
                    modifier = Modifier
                        .padding(start = 40.dp, end = 40.dp)
                        .fillMaxWidth()
                        .background(AkshatWhite),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Black
                    ),
                    shape = RoundedCornerShape(25.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    maxLines = 1
                )

                Spacer(modifier = Modifier.padding(top = 20.dp))

                Text(text = "Password",
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(start = 40.dp),
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.padding(top = 12.dp))

                var password by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(value = password,
                    onValueChange = { newText -> password = newText},
                    modifier = Modifier
                        .padding(start = 40.dp, end = 40.dp)
                        .fillMaxWidth()
                        .background(AkshatWhite),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Black
                    ),
                    shape = RoundedCornerShape(25.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    maxLines = 1
                )

                Spacer(modifier = Modifier.padding(top = 20.dp))

                Text(text = "Forgot Password",
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(end = 40.dp)
                        .align(Alignment.End),
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.padding(top = 70.dp))

                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(start = 40.dp, end = 40.dp)
                        .height(50.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Pink),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Text(text = "LOGIN",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DashboardScreenPreview() {
    FirstApplicationTheme {
//        DashboardScreen(navController = rememberNavController())
        SarfarazActivity(navController = rememberNavController())
    }
}