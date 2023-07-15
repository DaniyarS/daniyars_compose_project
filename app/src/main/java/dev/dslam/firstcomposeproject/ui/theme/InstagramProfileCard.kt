package dev.dslam.firstcomposeproject.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InstagramProfileCard() {
    Card(
        modifier = Modifier.padding(8.dp),
        shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp),
        backgroundColor = MaterialTheme.colors.background,
        border = BorderStroke(1.dp, MaterialTheme.colors.onBackground)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .background(Color.Yellow)
                .size(50.dp))

            TwoBoxes()
            TwoBoxes()
            TwoBoxes()
        }
    }

}

@Composable
private fun TwoBoxes() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(
            modifier = Modifier
                .background(Color.Yellow)
                .size(25.dp)
        )
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .size(25.dp)
        )
    }
}

@Preview
@Composable
fun PreviewCardLight() {
    FirstComposeProjectTheme(
        darkTheme = false
    ) {
        InstagramProfileCard()
    }
}

@Preview
@Composable
fun PreviewCardNight() {
    FirstComposeProjectTheme(
        darkTheme = true
    ) {
        InstagramProfileCard()
    }
}