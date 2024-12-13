package net.developermaster.navigationnavcontrollerjetpackcompose.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ApartamentScreen(navcontroller: NavController) {

    val context = LocalContext.current

    var enabled by remember { mutableStateOf(true) }


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Spacer(modifier = Modifier.height(100.dp))

        Text(
            text = "Apartament Screen",
            color = Color.Red,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
        )

        Spacer(modifier = Modifier.height(100.dp))

        Box(modifier = Modifier
            .height(200.dp)
            .width(200.dp)
            .clip(Shapes().small)
            .background(MaterialTheme.colorScheme.primaryContainer)
            .clickable {

                Toast.makeText(context, "Box", Toast.LENGTH_SHORT).show()
                enabled = !enabled



            }


        ) {

            if (enabled) {
                Text(
                    modifier = Modifier
                        .padding(all = 10.dp)
                        .align(Alignment.TopCenter),
                    style = MaterialTheme.typography.bodyLarge,
                    text = "Apartamento Ok")

            } else {
                Text(
                    modifier = Modifier
                        .padding(all = 10.dp)
                        .align(Alignment.TopCenter),
                    style = MaterialTheme.typography.bodyLarge,
                    text = "Apartamento Malo")

            }

            val ico1 = Icon(imageVector = Icons.Default.Delete,
                contentDescription = "back",
                modifier = Modifier
                    .padding(start = 20.dp, top = 100.dp)
                    .clickable {

                        Toast.makeText(context, "Editar", Toast.LENGTH_SHORT).show()

                    })

            val ico2 = Icon(imageVector = Icons.Default.Build,
                contentDescription = "back",
                modifier = Modifier
                    .padding(start = 150.dp, top = 100.dp)
                    .clickable {
                        Toast.makeText(context, "Build", Toast.LENGTH_SHORT).show()
                    })

            val ico3 = Icon(imageVector = Icons.Default.CheckCircle,
                contentDescription = "back",
                modifier = Modifier
                    .padding(start = 85.dp, top = 100.dp)
                    .clickable {

                        Toast.makeText(context, "CheckCircle", Toast.LENGTH_SHORT).show()

                    })

        }
    }
}