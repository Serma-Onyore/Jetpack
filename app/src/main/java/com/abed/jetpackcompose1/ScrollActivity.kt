package com.abed.jetpackcompose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abed.jetpackcompose1.ui.theme.JetpackCompose1Theme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val Students = listOf("Mercy", "Okari", "Mark","James", "Valary", "Tanisha",
                        "Becky", "Serma", "Blaise", "Blaire", "Blakely", "Brianna", "Bernice",
                        "Kaelin", "Kyrah", "Kaelin", "Kaiser", "Kai", "Kyle", "Tylah")
                    DashboardScreen(Students)

                }
            }
        }
    }
}
@Composable
fun RowCards(name: String){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(100.dp)
            .aspectRatio(3f),
             colors = CardDefaults.cardColors(containerColor = Color.Cyan)
    ){
        Box (
            modifier = Modifier
                .padding(15.dp)
                .fillMaxSize()
        ){
            Text(text = name)
        }
    }
}
@Composable
fun DashboardScreen(Students:List<String>){
    Box (
        modifier = Modifier.fillMaxSize()
    ){
        Image(painter = painterResource(id = R.drawable.card1),
            contentDescription = "My image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize(),
            )
    }
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        LazyRow (contentPadding = PaddingValues(20.dp)){
            items(items=Students)
            {
                    item ->
                RowCards(name = item)
            }
        }

    }
}
//