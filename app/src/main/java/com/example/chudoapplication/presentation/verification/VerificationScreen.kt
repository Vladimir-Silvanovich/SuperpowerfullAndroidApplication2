package com.example.chudoapplication.presentation.verification

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chudoapplication.R
import com.example.chudoapplication.presentation.UiElements.LoginTextField
import com.example.chudoapplication.presentation.UiElements.OtpVerification
import com.example.chudoapplication.presentation.UiElements.PopupWindow
import com.example.chudoapplication.presentation.UiElements.TopBar

@Composable
fun VerificationScreen(
    onButtonClicked: () -> Unit = {},
    modifier: Modifier = Modifier
){
    TopBar(
        title = R.drawable.logo,
        iconLeft = Icons.AutoMirrored.Filled.ArrowBack,
        iconRight = Icons.Default.AccountCircle
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(it).fillMaxWidth().padding(0.dp,100.dp,0.dp,0.dp).fillMaxHeight()
        ) {
            Image(
                contentDescription = null,
                painter = painterResource(R.drawable.otpcheck),
                modifier = Modifier.scale(1.5f)
            )
            OtpVerification(onButtonClicked)
            Spacer(modifier = Modifier.fillMaxHeight(0.2f))
        }
    }
}

@Preview
@Composable
fun Preview() {
    VerificationScreen()
}