package dev.dslam.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.ViewModelProvider
import dev.dslam.firstcomposeproject.ui.theme.FirstComposeProjectTheme
import dev.dslam.firstcomposeproject.ui.theme.InstagramProfileCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        setContent {
            Test(viewModel = viewModel)
        }
    }
}

@Composable
fun Test(viewModel: MainViewModel) {
    FirstComposeProjectTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background)
        ) {
            LazyColumn {
                item { 
                    Text(text = "ZAGALOVOK")
                }
                repeat(10) {
                    item {
                        InstagramProfileCard(viewModel)
                    }
                }
                item {
                    Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null)
                }
                repeat(200) {
                    item {
                        InstagramProfileCard(viewModel)
                    }
                }
            }
        }
    }
}