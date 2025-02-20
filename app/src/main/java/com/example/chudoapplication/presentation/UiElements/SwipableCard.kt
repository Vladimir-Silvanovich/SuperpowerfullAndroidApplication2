package com.example.chudoapplication.presentation.UiElements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chudoapplication.R

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SwipeableCard(
    onRemove: () -> Unit
) {
    val dismissState = rememberDismissState()

    if (dismissState.isDismissed(DismissDirection.EndToStart)) {
        onRemove()
    }

    SwipeToDismiss(
        state = dismissState,
        directions = setOf(DismissDirection.EndToStart),
        dismissThresholds = { FractionalThreshold(0.5f) },
        background = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
                    .padding(horizontal = 20.dp),
                contentAlignment = Alignment.CenterEnd
            ) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Delete Icon",
                    tint = MaterialTheme.colors.onError
                )
            }
        },
        dismissContent = {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                elevation = 4.dp
            ) {
                Row (horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)) {
                    Image(
                        painter = painterResource(R.drawable.shoebag),
                        contentDescription = null,
                        modifier = Modifier.scale(1.6f)
                    )
                    Image(
                        painter = painterResource(R.drawable.shoeprice),
                        contentDescription = null,
                        modifier = Modifier.scale(1.6f).padding(0.dp,0.dp,25.dp,0.dp)
                    )
                }
            }
        }
    )
}

@Composable
@Preview
fun SwipableCardPreview() {
    SwipeableCard {  }
}
