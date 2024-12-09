package net.developermaster.navigationnavcontrollerjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import net.developermaster.navigationnavcontrollerjetpackcompose.ui.theme.NavigationNavControllerJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationNavControllerJetpackComposeTheme {

            }
        }
    }
}
