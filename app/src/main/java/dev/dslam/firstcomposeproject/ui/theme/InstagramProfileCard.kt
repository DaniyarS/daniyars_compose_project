package dev.dslam.firstcomposeproject.ui.theme

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.dslam.firstcomposeproject.MainViewModel
import dev.dslam.firstcomposeproject.R

@Composable
fun InstagramProfileCard(viewModel: MainViewModel) {
    Log.d("RECOMPOSITION", "InstagramProfileCard")

    val isFollowed = viewModel.isFollowing.observeAsState(false)

    Card(
        modifier = Modifier.padding(8.dp),
        shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp),
        backgroundColor = MaterialTheme.colors.background,
        border = BorderStroke(1.dp, MaterialTheme.colors.onBackground)
    ) {

        Log.d("RECOMPOSITION", "Card")
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .padding(8.dp),
                    painter = painterResource(id = R.drawable.ic_instagram),
                    contentDescription = "",
                )

                UserStatistics("Posts", "6,950")
                UserStatistics("Followers", "436M")
                UserStatistics("Following", "76")
            }

            Text(text = "Instagram", fontSize = 32.sp, fontFamily = FontFamily.Cursive)
            Text(text = "#YoursToMake", fontSize = 14.sp)
            Text(text = "www.facebook.com/emotional_health", fontSize = 14.sp)

            FollowingButton(isFollowed) {
                viewModel.changeFollowingStatus()
            }
        }
    }

}

@Composable
private fun UserStatistics(title: String, value: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = value,
            fontFamily = FontFamily.Cursive,
            fontSize = 24.sp
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 10.sp
        )
    }
}

//@Preview
//@Composable
//fun PreviewCardLight() {
//    FirstComposeProjectTheme(
//        darkTheme = false
//    ) {
//        InstagramProfileCard()
//    }
//}
//
//@Preview
//@Composable
//fun PreviewCardNight() {
//    FirstComposeProjectTheme(
//        darkTheme = true
//    ) {
//        InstagramProfileCard()
//    }
//}

@Composable
fun FollowingButton(
    isFollowedState: State<Boolean>,
    clickListener: () -> Unit
) {

    Log.d("RECOMPOSITION", "FollowingButton")
    Button(
        onClick = { clickListener() },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (isFollowedState.value) {
                MaterialTheme.colors.primary.copy(alpha = 0.5f)
            } else {
                MaterialTheme.colors.primary
            }
        )
    ) {
        if (isFollowedState.value) {
            Text(text = "Unfollow")
        } else {
            Text(text = "Follow")
        }
    }
}