package net.developermaster.navigationnavcontrollerjetpackcompose.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(navigateToInformationScreen: (String) -> Unit) {

    var texto by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(modifier = Modifier.height(100.dp))

        Text(
            text = "Main Screen",
            color = Color.Red,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            modifier = Modifier.height(50.dp),
            singleLine = true,
            maxLines = 1,
            shape = androidx.compose.material3.Shapes().medium,
            value = texto, onValueChange = {
            texto = it
        })


        Button(onClick = {

//            navicontroller.navigate(ModelScreen.LoginScreenObject.route)

        }) {

            Text(text = "Recuperar Texto")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {

            navigateToInformationScreen(texto)

        }) {

            Text(text = "Information Screen")
        }
    }
}

