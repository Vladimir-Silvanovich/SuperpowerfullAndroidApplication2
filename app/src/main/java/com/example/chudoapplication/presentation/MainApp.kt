package com.example.chudoapplication.presentation

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.chudoapplication.R
import com.example.chudoapplication.presentation.signIn.SignInScreen
import com.example.chudoapplication.presentation.signIn.SignInViewModel

enum class AppScreen(@StringRes val title: Int) {
    SignIn(title = R.string.sign_in),
    SignUp(title = R.string.choose_entree),
    SplashScreen(title = R.string.splash_screemn),
}

@Composable
fun MainApp(
    navController: NavHostController = rememberNavController(),
    viewModel: MainViewModel = viewModel(),
    modifier: Modifier = Modifier
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = AppScreen.valueOf(
        backStackEntry?.destination?.route ?: AppScreen.SignIn.name
    )

    NavHost(
        navController = navController,
        startDestination = AppScreen.SignIn.name,
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize()
    ){
        composable(route = AppScreen.SignIn.name) {
            SignInScreen()
        }
        composable(route = AppScreen.SplashScreen.name) {
        }
    }
}