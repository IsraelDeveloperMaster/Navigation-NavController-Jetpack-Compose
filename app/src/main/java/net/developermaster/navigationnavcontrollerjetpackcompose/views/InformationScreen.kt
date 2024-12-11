package net.developermaster.navigationnavcontrollerjetpackcompose.views

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
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
fun InformationScreen(navigateToLoginScreen: () -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(modifier = Modifier.height(100.dp))

        Text(
            modifier = Modifier
                .padding(all = 8.dp)//todo padding top
                .border(2.dp, Color.Yellow, CutCornerShape(20)),//todo borda amarela circular
            text = "Information Screen",//todo texto
            color = Color.Red,//todo cor vermelha
            fontSize = 30.sp,//todo tamanho da fonte
            fontFamily = FontFamily.SansSerif,//todo tipo de fonte
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {

            navigateToLoginScreen()

        }) {

            Text(text = "Login Screen")
        }

        Spacer(modifier = Modifier.height(16.dp))

    }
}