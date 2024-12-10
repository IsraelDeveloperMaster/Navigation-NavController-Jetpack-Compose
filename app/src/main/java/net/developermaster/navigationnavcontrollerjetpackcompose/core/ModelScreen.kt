package net.developermaster.navigationnavcontrollerjetpackcompose.core


sealed class ModelScreen(val route: String) {

    data object LoginScreenObject : ModelScreen("loginScreen")
    data object MainScreenObject   : ModelScreen("mainScreen")

}