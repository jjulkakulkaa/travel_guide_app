package edu.put.travel_guide.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.put.travel_guide.presentation.DetailScreen
import edu.put.travel_guide.presentation.MainScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "main") {
        composable("main"){
            MainScreen(navController)
        }
        composable("detail/{path}"){ backStackEntry ->
            val path = backStackEntry.arguments?.getString("path") ?: ""
            DetailScreen(navController = navController, path = path)
        }
    }
}