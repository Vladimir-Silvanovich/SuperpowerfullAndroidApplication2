package com.example.chudoapplication.presentation.favorite

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.chudoapplication.presentation.UiElements.TopBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.ui.unit.dp
import com.example.chudoapplication.R
import com.example.chudoapplication.presentation.UiElements.SinkersCard

@Composable
fun FavoriteScreen(
    onButtonClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val cards = listOf(
        "","","","","","","","","","","","","",
    )
//    val viewModel: HomeViewModel = viewModel(factory = HomeViewModel.Factory)
//    val categories = viewModel.categories.collectAsState().value
    TopBar(
        title = R.drawable.favtitle,
        iconLeft = Icons.AutoMirrored.Filled.ArrowBack,
        iconRight = Icons.Default.Favorite
    ) { innerPadding ->
        Column (
            modifier = Modifier.padding(innerPadding)
        ) {
            LazyVerticalGrid (
                columns = GridCells.Adaptive(minSize = 128.dp),
                modifier = Modifier.padding(20.dp)
            ) {
                items(cards) {
                    SinkersCard(modifier=Modifier.padding(8.dp), onCardClick = onButtonClick)
                }
            }
        }

    }
}

@Preview
@Composable
fun Preview() {
    FavoriteScreen()
}
