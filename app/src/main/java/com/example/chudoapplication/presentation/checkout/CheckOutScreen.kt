package com.example.chudoapplication.presentation.checkout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chudoapplication.R
import com.example.chudoapplication.presentation.UiElements.LoginTextField
import com.example.chudoapplication.presentation.UiElements.OrderConfirmationPopup
import com.example.chudoapplication.presentation.UiElements.TopBar

@Composable
fun CheckOutScreen(
    modifier: Modifier = Modifier
){
    TopBar(
        title = R.drawable.checkouttitle,
        iconLeft = Icons.AutoMirrored.Filled.ArrowBack,
        iconRight = Icons.Default.LocationOn
    ) {
        val popUp by remember { mutableStateOf(false) }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(it).fillMaxWidth().padding(0.dp,0.dp,0.dp,0.dp).fillMaxHeight()
        ) {
            Image(
                contentDescription = null,
                painter = painterResource(R.drawable.checkoutbody),
                modifier = Modifier.fillMaxSize().weight(0.3f)
            )
            Image(
                contentDescription = null,
                painter = painterResource(R.drawable.checkoutinfo),
                modifier = Modifier.fillMaxSize().weight(0.1f)
            )
            Image(
                contentDescription = null,
                painter = painterResource(R.drawable.checkoutbutton),
                modifier = Modifier.scale(1.5f)
            )
            Spacer(modifier = Modifier.height(40.dp))
        }
        if (popUp) {
            OrderConfirmationPopup {  }
        }
    }
}

@Preview
@Composable
fun Preview() {
    CheckOutScreen()
}