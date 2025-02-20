package com.example.chudoapplication.presentation.myCart

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chudoapplication.R
import com.example.chudoapplication.presentation.UiElements.SinkersCard
import com.example.chudoapplication.presentation.UiElements.SwipeableCard
import com.example.chudoapplication.presentation.UiElements.TopBar
import com.example.chudoapplication.presentation.favorite.FavoriteScreen

@Composable
fun MyCart(
    onButtonClick: () -> Unit = {}
){
    val cards = listOf(
        "","","","","","","","","","","","","",
    )
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopBar(
            title = R.drawable.mycart,
            iconLeft = Icons.AutoMirrored.Filled.ArrowBack,
            iconRight = Icons.Default.ThumbUp
        )
            { innerPadding ->
                Column (
                    modifier = Modifier.padding(innerPadding).fillMaxHeight(0.8f)
                ) {
                    LazyColumn (
                        modifier = Modifier.padding(20.dp)
                    ) {
                        items(cards) {
                            SwipeableCard() {}
                        }
                    }
                }
                Image(
                    contentDescription = null,
                    painter = painterResource(R.drawable.buybutton),
                    modifier = Modifier.fillMaxSize().padding(0.dp,700.dp,0.dp,0.dp)
                        .clickable { onButtonClick() }
                )
        }
    }
}

@Preview
@Composable
fun Preview() {
    MyCart()
}