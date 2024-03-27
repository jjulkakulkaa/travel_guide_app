package edu.put.travel_guide.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import edu.put.travel_guide.R

@Composable
fun DetailScreen (navController: NavHostController, path:String){
    Column {
        IconButton(onClick = {navController.popBackStack()}) {
            Image(painter = painterResource(id = R.drawable.cute_back_button), contentDescription = "Nav back", modifier = Modifier.rotate(180f))
        }
        Text(text = path)

    }

}