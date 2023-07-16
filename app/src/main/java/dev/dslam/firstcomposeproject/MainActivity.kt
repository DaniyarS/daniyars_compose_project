package dev.dslam.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import dev.dslam.firstcomposeproject.ui.theme.FirstComposeProjectTheme
import dev.dslam.firstcomposeproject.ui.theme.InstagramProfileCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeProjectTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colors.background)
                ) {
                    InstagramProfileCard()
                }
            }
        }
    }

    @Preview
    @Composable
    fun TextTest() {
        Text(
            buildAnnotatedString {
                withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("Hello")
                }

                withStyle(SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append(" ")
                }

                withStyle(SpanStyle(fontSize = 30.sp, textDecoration = TextDecoration.LineThrough)) {
                    append("World!")
                }

            }
        )
//        Text(
//            modifier = Modifier.background(MaterialTheme.colors.onPrimary),
//            text = "Hello World!",
//            fontSize = 24.sp,
//            fontWeight = FontWeight.ExtraBold,
//            fontFamily = FontFamily.SansSerif,
//            textDecoration = TextDecoration.combine(listOf(TextDecoration.LineThrough, TextDecoration.Underline))
//        )
    }
}
