package com.example.chudoapplication.presentation.detailes

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chudoapplication.R
import com.example.chudoapplication.presentation.UiElements.TopBar
import com.example.chudoapplication.presentation.favorite.FavoriteScreen

@Composable
fun DetailsScreen(
    onButtonClick: () -> Unit = {},
    modifier: Modifier = Modifier
){
    TopBar(
        title = R.drawable.sneakershoptitle,
        iconLeft = Icons.AutoMirrored.Filled.ArrowBack,
        iconRight = ImageVector.vectorResource(R.drawable.bag),
        modifier = modifier
    ) {
        Column(modifier = Modifier.padding(it)) {
            Image(
                contentDescription = null,
                painter = painterResource(R.drawable.detailsscreenallelem),
                modifier = Modifier.fillMaxWidth().fillMaxHeight(0.8f)
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().fillMaxHeight()
            ){
                Image(painter = painterResource(R.drawable.favselected),
                    contentDescription = null,
                    modifier = Modifier.scale(0.8f).padding(10.dp,0.dp,0.dp,0.dp))
                Image(painter = painterResource(R.drawable.button_buy),
                    contentDescription = null,
                    modifier = Modifier.scale(1.4f).padding(0.dp,0.dp,40.dp,0.dp)
                        .clickable { onButtonClick() })
            }
        }
    }
}

@Preview
@Composable
fun Preview() {
    DetailsScreen()
}
