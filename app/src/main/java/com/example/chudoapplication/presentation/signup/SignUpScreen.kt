package com.example.chudoapplication.presentation.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chudoapplication.R
import com.example.chudoapplication.presentation.UiElements.ConsentCheckbox
import com.example.chudoapplication.presentation.UiElements.LoginTextField
import com.example.chudoapplication.presentation.UiElements.PasswordTextField
import com.example.chudoapplication.presentation.UiElements.TopBar
import com.example.chudoapplication.presentation.favorite.FavoriteScreen

@Composable
fun SignUpScreen(){
    TopBar(
        title = R.drawable.logo,
        iconLeft = Icons.AutoMirrored.Filled.ArrowBack,
        iconRight = Icons.Default.AccountCircle
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(it).fillMaxWidth().padding(0.dp,20.dp,0.dp,0.dp).fillMaxHeight()
        ) {
            Image(


                contentDescription = null,
                painter = painterResource(R.drawable.signuptitle),
                modifier = Modifier.scale(1.5f)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text("Ваше имя",
                fontSize = 18.sp,
                modifier = Modifier.fillMaxWidth().padding(17.dp,5.dp))
            LoginTextField("XXXXXXXXXX")
            Text("Email",
                fontSize = 18.sp,
                modifier = Modifier.fillMaxWidth().padding(17.dp,5.dp))
            LoginTextField("xyz@gmail.com")
            Text("Пароль",
                fontSize = 18.sp,
                modifier = Modifier.fillMaxWidth().padding(17.dp,5.dp))
            PasswordTextField()
            ConsentCheckbox()
            Spacer(modifier = Modifier.height(40.dp))
            Image(
                contentDescription = null,
                painter = painterResource(R.drawable.signupbutton),
                modifier = Modifier.scale(1.5f)
            )
            Spacer(modifier = Modifier.height(40.dp))
            Image(
                contentDescription = null,
                painter = painterResource(R.drawable.signupsignin),
                modifier = Modifier.scale(1.2f)
            )

        }
    }
}

@Preview
@Composable
fun Preview() {
    SignUpScreen()
}
