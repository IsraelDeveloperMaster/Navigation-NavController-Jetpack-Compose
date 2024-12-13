package net.developermaster.navigationnavcontrollerjetpackcompose.core

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import net.developermaster.navigationnavcontrollerjetpackcompose.models.ModelScreen
import net.developermaster.navigationnavcontrollerjetpackcompose.screens.ApartamentScreen
import net.developermaster.navigationnavcontrollerjetpackcompose.screens.InformationScreen
import net.developermaster.navigationnavcontrollerjetpackcompose.screens.LoginScreen
import net.developermaster.navigationnavcontrollerjetpackcompose.screens.MainScreen

@Composable
fun NavigationNavController() {

    //hook que retorna um navController
    val navController = rememberNavController()

    //controlador de navegação que recebe o navController para a rota inicial
    NavHost(navController = navController, startDestination = ModelScreen.ApartamentScreenObject.route) {

        //rota de loginScreen
        composable(ModelScreen.LoginScreenObject.route) {
            LoginScreen(navController)
        }

        //rota mainScreen
        composable(ModelScreen.MainScreenObject.route) {
            MainScreen(navController)
        }

        //rota de informationScreen
        composable(
            ModelScreen.InformationScreenObject.route + "/{nome}" ,

            arguments = listOf(navArgument("nome") {
            type = NavType.StringType

        })) {
            InformationScreen(navController, it.arguments?.getString("nome") ?: "Não informado")
        }

        //rota de apartamentScreen
        composable(ModelScreen.ApartamentScreenObject.route) {
            ApartamentScreen(navController)
        }


    }

}