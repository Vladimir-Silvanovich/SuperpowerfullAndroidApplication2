package com.example.chudoapplication.presentation.UiElements

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chudoapplication.R

@Composable
fun SinkersCard(
    onCardClick: () -> Unit = {},
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier
            .height(160.dp).width(140.dp),
        onClick = onCardClick
    ) {
        Column {
            Image(
                modifier = Modifier.fillMaxHeight().weight(1f),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                painter = painterResource(R.drawable.snikers),

                )
            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            )
            {
                Image(
                    contentDescription = null,
                    painter = painterResource(R.drawable.fiftytwo),
                    modifier = Modifier.padding(20.dp,0.dp,0.dp,0.dp).align(Alignment.CenterVertically)
                        .scale(2f)
                )
                Image(
                    contentDescription = null,
                    painter = painterResource(R.drawable.plus)
                )
            }
        }
    }
}

@Composable
@Preview
fun CardPreview() {
    SinkersCard()
}
