package com.example.chudoapplication.presentation.signIn

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.shapes
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.chudoapplication.R
import com.example.chudoapplication.presentation.UiElements.LoginTextField
import com.example.chudoapplication.presentation.UiElements.PasswordTextField
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Composable
fun SignInScreen(
    modifier: Modifier = Modifier,
    viewModel: SignInViewModel = viewModel(),
    onEnterClicked: () -> Unit = {},
    onRegisterClicked: () -> Unit = {},
    onForgotPasswordClicked: () -> Unit = {}
) {

    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()

    val email by viewModel.email.collectAsState()
    val password by viewModel.password.collectAsState()

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
    ) { paddingValues ->
        Box(
            modifier = modifier
                .padding(paddingValues)
                .fillMaxWidth()
                .fillMaxHeight(),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 120.dp, start = 20.dp, end = 20.dp)
                    .fillMaxWidth()
                    .background(
                        color = Color.White
                    ).fillMaxHeight(),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    contentDescription = null,
                    painter = painterResource(R.drawable.signinhello),
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(0.2f)
                )
                Text("Email",
                    fontSize = 18.sp,
                    modifier = Modifier.fillMaxWidth().padding(17.dp,5.dp))
                LoginTextField("xyz@gmail.com")
                Text("Пароль",
                    fontSize = 18.sp,
                    modifier = Modifier.fillMaxWidth().padding(17.dp,5.dp))
                PasswordTextField()
                Text("Восстановить",
                    fontSize = 12.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.Right,
                    modifier = Modifier.fillMaxWidth().padding(17.dp,5.dp)
                        .clickable { onForgotPasswordClicked()  })
                Button(onClick = onEnterClicked)
                {
                    Text("Войти")
                }
                Spacer(Modifier.height(80.dp))
                Image(contentDescription = "",
                    painter = painterResource(R.drawable.signinwithoutaccount),
                    modifier = Modifier.clickable {
                        onRegisterClicked()
                    }
                )
            }
        }
    }
}

@Preview
@Composable
fun SignInScreenPreview() {
    SignInScreen()
}
