package com.example.chudoapplication.presentation.UiElements

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding

@Composable
fun ConsentCheckbox() {
    val checkedState = remember { mutableStateOf(false) }

    Row(
        modifier = Modifier.padding(16.dp)
    ) {
        Checkbox(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it }
        )
        Text(
            text = "Даю согласие на обработку персональных данных",
            modifier = Modifier.padding(start = 8.dp)  // Adding padding for spacing between checkbox and text
        )
    }
}

@Preview
@Composable
fun PreviewConsentCheckbox() {
    ConsentCheckbox()
}
