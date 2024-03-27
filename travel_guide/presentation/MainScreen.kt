package edu.put.travel_guide.presentation

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun MainScreen(navController : NavHostController ) {
    val paths = listOf("czarny", "czerwony", "niebieski", "żółty")

    PathsList(navController = navController, paths = paths)
}
@Composable
private fun PathsList(
    navController: NavHostController,
    paths : List<String>
) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(items = paths) { item ->
            Log.d("COMPOSE", "This item rendered: $item")
            Text(
                text = item,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate("detail/$item")
                    }
            )
        }
    }
}