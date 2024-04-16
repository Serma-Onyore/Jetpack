package com.abed.jetpackcompose1

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.abed.jetpackcompose1.ui.theme.JetpackCompose1Theme

class TopAppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TopApp()
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopApp(){
    val context = LocalContext.current.applicationContext
    TopAppBar(
        title = { Text(text = "eMobilis") },
        navigationIcon = {
            IconButton(onClick = { Toast.makeText(context,"You have clicked a home icon",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Home, contentDescription ="Home Icon" )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Magenta,
            titleContentColor = Color.Cyan,
            navigationIconContentColor = Color.Yellow
        ),
        actions = {
            IconButton(onClick = { Toast.makeText(context,"You have clicked a search icon",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search", tint = Color.DarkGray )
            }
            IconButton(onClick = { Toast.makeText(context,"You have clicked a share icon",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Share, contentDescription = "Share", tint = Color.DarkGray)
            }
            IconButton(onClick = { Toast.makeText(context,"You have clicked an Menu icon",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "Menu", tint = Color.DarkGray)
            }
            IconButton(onClick = { Toast.makeText(context,"You have clicked a Email icon",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Email", tint = Color.DarkGray)
            }
        }
        )
}
@Preview
@Composable
fun TopAppPreview(){
    TopApp()
}
