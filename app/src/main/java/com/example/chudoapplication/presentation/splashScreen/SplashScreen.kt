package com.example.chudoapplication.presentation.splashScreen

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.chudoapplication.R

@Composable
fun SplashScreen(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(Color(22,124,175))
    ) {
        Image(painter = painterResource(R.drawable.logo),
            contentDescription = "",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth(0.6f)
        )
    }
}

@Preview
@Composable
fun Preview() {
    Surface (modifier = Modifier.fillMaxSize()) {
        SplashScreen()
    }
}