package com.example.chudoapplication.presentation.UiElements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    title: Int,
    iconLeft: ImageVector,
    iconRight: ImageVector,
    inFunc: @Composable (padding: PaddingValues) -> Unit
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Image(painter = painterResource(title), contentDescription = "",
                        modifier = Modifier.fillMaxHeight().scale(1.2f))
                },
                navigationIcon = {
                    IconButton(onClick = { /* do something */ }, modifier = Modifier.fillMaxHeight()) {
                        Icon(
                            imageVector = iconLeft,
                            contentDescription = "Localized description",
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* do something */ },modifier = Modifier.fillMaxHeight()) {
                        Icon(
                            imageVector = iconRight,
                            contentDescription = "Localized description"
                        )
                    }
                },
                modifier = modifier.background(Color(222, 222, 224))
                    .fillMaxHeight(0.08f)


            )
        },
    ) { innerPadding ->
        inFunc(innerPadding)
    }
}