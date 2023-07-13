package dev.dslam.firstcomposeproject.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun InstagramProfileCard() {
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