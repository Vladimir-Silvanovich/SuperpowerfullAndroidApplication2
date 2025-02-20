package com.example.chudoapplication.presentation.UiElements

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun LoginTextField(
    text: String
) {
    var login by remember { mutableStateOf("") }

    TextField(
        value = login,
        onValueChange = { login = it },
        label = { Text(text) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
    )
}
