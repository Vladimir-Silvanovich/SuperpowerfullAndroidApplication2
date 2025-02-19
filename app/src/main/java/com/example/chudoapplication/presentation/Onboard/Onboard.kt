package com.example.chudoapplication.presentation.Onboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chudoapplication.R
import com.example.chudoapplication.presentation.UiElements.CustomButton
import com.example.chudoapplication.presentation.splashScreen.SplashScreen

@Composable
fun OnBoard1(
    onButtonClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(Color(22,124,175)).fillMaxSize().padding(top = 40.dp)
    ) {
        Image(contentDescription = "",
            painter = painterResource(R.drawable.screen1),
            modifier = Modifier.fillMaxSize().weight(1f))
        CustomButton(onClick =onButtonClick, text = "Начать",modifier = Modifier.fillMaxWidth()
            .padding(40.dp))
    }
}

@Composable
fun OnBoard2(
    onButtonClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(Color(22,124,175)).fillMaxSize().padding(top = 40.dp)
    ) {
        Image(contentDescription = "",
            painter = painterResource(R.drawable.screen2),
            modifier = Modifier.fillMaxSize().weight(1f))
        CustomButton(onClick = onButtonClick, text = "Далее",modifier = Modifier.fillMaxWidth()
            .padding(40.dp))
    }
}

@Composable
fun OnBoard3(
    onButtonClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(Color(22,124,175)).fillMaxSize().padding(top = 40.dp)
    ) {
        Image(contentDescription = "",
            painter = painterResource(R.drawable.screen3),
            modifier = Modifier.fillMaxSize().weight(1f))
        CustomButton(onClick = onButtonClick, text = "Далее",modifier = Modifier.fillMaxWidth()
            .padding(40.dp))
    }
}


@Preview
@Composable
fun Preview() {
    Surface (modifier = Modifier.fillMaxSize()) {
        OnBoard1()
    }
}

@Preview
@Composable
fun Preview2() {
    Surface (modifier = Modifier.fillMaxSize()) {
        OnBoard2()
    }
}

@Preview
@Composable
fun Preview3() {
    Surface (modifier = Modifier.fillMaxSize()) {
        OnBoard3()
    }
}