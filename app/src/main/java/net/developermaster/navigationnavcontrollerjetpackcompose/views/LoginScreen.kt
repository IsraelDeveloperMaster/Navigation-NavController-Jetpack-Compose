package net.developermaster.navigationnavcontrollerjetpackcompose.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(navigateToMainScreen: () -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(modifier = Modifier.height(100.dp))

        Text(
            text = "Login Screen",
            color = Color.Red,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {

            navigateToMainScreen()

        }) {
            Text(text = "Main Screen")

        }
    }
}