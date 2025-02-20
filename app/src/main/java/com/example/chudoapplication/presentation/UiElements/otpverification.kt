package com.example.chudoapplication.presentation.UiElements

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OtpVerification() {
    var otpCode by remember { mutableStateOf("") }
    val otpLength = 6

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "OTP Код", fontSize = 24.sp, modifier = Modifier.padding(bottom = 16.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            for (i in 0 until otpLength) {
                BasicTextField(
                    value = if (otpCode.length > i) otpCode[i].toString() else "",
                    onValueChange = {
                        if (it.length <= otpLength) {
                            otpCode = it
                        }
                    },
                    modifier = Modifier
                        .size(40.dp, 60.dp)
                        .background(Color.LightGray)
                        .border(1.dp, if (otpCode.length == i) Color.Red else Color.Gray),
                    visualTransformation = VisualTransformation.None,
                    singleLine = true,
                    maxLines = 1
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        TextButton(onClick = { /* Логика повторной отправки OTP */ }) {
            Text(text = "Отправить заново")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "00:30", fontSize = 16.sp)
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewOtpVerification() {
    OtpVerification()
}

