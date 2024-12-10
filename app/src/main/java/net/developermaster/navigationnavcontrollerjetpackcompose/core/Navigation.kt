package net.developermaster.navigationnavcontrollerjetpackcompose.core

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.developermaster.navigationnavcontrollerjetpackcompose.views.LoginScreen
import net.developermaster.navigationnavcontrollerjetpackcompose.views.MainScreen

@Composable
fun NavigationNavController() {

    //hook que retorna um navController
    val navController = rememberNavController()

    //controlador de navegação
    NavHost(navController = navController, startDestination = ModelScreen.LoginScreenObject.route) {

        //rota principal
        composable(ModelScreen.MainScreenObject.route) {
            MainScreen{
                navController.navigate(ModelScreen.LoginScreenObject.route) //navigate para rota login utilizando função lambda
            }
        }

        //rota de login
        composable(ModelScreen.LoginScreenObject.route) {
            LoginScreen{
                navController.navigate(ModelScreen.MainScreenObject.route)//navigate para rota principal utilizando função lambda
            }
        }
    }
}
