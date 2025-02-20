@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.chudoapplication.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chudoapplication.R
import androidx.compose.foundation.lazy.items
import com.example.chudoapplication.domain.models.Category

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
//    val viewModel: HomeViewModel = viewModel(factory = HomeViewModel.Factory)
//    val categories = viewModel.categories.collectAsState().value
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Image(painter = painterResource(R.drawable.home), contentDescription = "",
                        modifier = Modifier.fillMaxHeight())
                },
                navigationIcon = {
                    IconButton(onClick = { /* do something */ }, modifier = Modifier.fillMaxHeight()) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.poloski3),
                            contentDescription = "Localized description",
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* do something */ },modifier = Modifier.fillMaxHeight()) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.bag),
                            contentDescription = "Localized description"
                        )
                    }
                },
                modifier = modifier.background(Color(222, 222, 224))
                    .fillMaxHeight(0.08f)


                )
        },
    ) { innerPadding ->
        Column (
            modifier = Modifier.padding(innerPadding)
        ) {
            SearchField(
//                categories = categories
            )
        }
    }
}

@Composable
fun SearchField(
    modifier: Modifier = Modifier,
//    categories: List<Category>
) {
    Row (
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = { it },
            label = { Text("Поиск") },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.loopa),
                    contentDescription = "Leading Icon",
                    tint = Color.Gray
                )
            },
        )
        Image(contentDescription = "",
            painter = painterResource(R.drawable.settings)
        )
    }
    Spacer(Modifier.height(50.dp))
//    Categories(categories = categories)
    Spacer(Modifier.height(50.dp))
    Row (
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()
    ){
        Text("Популярное")
        Text("Все", color = Color.Blue)
    }
    Spacer(Modifier.height(50.dp))
    Image(painter = painterResource(id = R.drawable.mainmenu), contentDescription = "",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun Categories(
    categories: List<Category> ,
    modifier: Modifier = Modifier
) {
    LazyColumn {
        items(
            categories,
            key = { instrument -> instrument.id },
        ) { instrument ->
            Text(
                instrument.title,
                modifier = Modifier.padding(8.dp),
            )
        }
    }
}

@Preview
@Composable
fun Preview() {
    HomeScreen()
}
