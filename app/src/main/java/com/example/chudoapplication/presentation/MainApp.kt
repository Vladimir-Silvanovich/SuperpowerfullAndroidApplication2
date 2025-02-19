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
import com.example.chudoapplication.presentation.Onboard.OnBoard1
import com.example.chudoapplication.presentation.Onboard.OnBoard2
import com.example.chudoapplication.presentation.Onboard.OnBoard3
import com.example.chudoapplication.presentation.home.HomeScreen
import com.example.chudoapplication.presentation.signIn.SignInScreen
import com.example.chudoapplication.presentation.signIn.SignInViewModel
import com.example.chudoapplication.presentation.splashScreen.SplashScreen

enum class AppScreen(@StringRes val title: Int) {
    SignIn(title = R.string.sign_in),
    SignUp(title = R.string.choose_entree),
    SplashScreen(title = R.string.splash_screemn),
    OnBoard1(title = R.string.onboard1),
    OnBoard2(title = R.string.onboard2),
    OnBoard3(title = R.string.onboard3),
    HomeScreen(title = R.string.home_screen)
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
            SignInScreen(onEnterClicked = {navController.navigate(AppScreen.SplashScreen.name)})
        }
        composable(route = AppScreen.SplashScreen.name) {
            SplashScreen(action = {navController.navigate(AppScreen.OnBoard1.name)})
        }
        composable(route = AppScreen.OnBoard1.name) {
            OnBoard1(onButtonClick = {navController.navigate(AppScreen.OnBoard2.name)})
        }
        composable(route = AppScreen.OnBoard2.name) {
            OnBoard2(onButtonClick = {navController.navigate(AppScreen.OnBoard3.name)})
        }
        composable(route = AppScreen.OnBoard3.name) {
            OnBoard3(onButtonClick = {navController.navigate(AppScreen.HomeScreen.name)})
        }
        composable(route = AppScreen.HomeScreen.name) {
            HomeScreen()
        }
    }
}