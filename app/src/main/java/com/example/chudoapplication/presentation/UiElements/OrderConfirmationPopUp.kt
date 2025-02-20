package com.example.chudoapplication.presentation.UiElements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chudoapplication.R

@Composable
fun OrderConfirmationPopup(onDismiss: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray.copy(alpha = 0.5f))
            .clickable(onClick = onDismiss) // Закрыть окно при клике на фоне
    ) {
        Card(
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp)
                .clickable { }
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.White)
            ) {
                Image(
                    contentDescription = null,
                    painter = painterResource(R.drawable.popuppicture),
                    modifier = Modifier.scale(1.4f).height(150.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Вы успешно оформили заказ",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.align(Alignment.CenterHorizontally).width(140.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = onDismiss,
                    modifier = Modifier.align(Alignment.CenterHorizontally).padding(20.dp)
                ) {
                    Text(text = "Вернуться к покупкам")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOrderConfirmationPopup() {
    OrderConfirmationPopup(onDismiss = {})
}
