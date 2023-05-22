package com.example.composelistview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composelistview.ui.theme.ComposeListviewTheme

class MainActivity : ComponentActivity() {
    private val fruitList = listOf(
        "Apple",
        "Banana",
        "Cherry",
        "Durian",
        "Elderberry",
        "Fig",
        "Grape",
        "Honeydew",
        "Kiwi",
        "Lemon",
        "Mango",
        "Nectarine",
        "Orange",
        "Pineapple",
        "Quince",
        "Raspberry",
        "Strawberry",
        "Tangerine",
        "Ugli fruit",
        "Watermelon"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeListviewTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    FruitList(fruitList)
                }
            }
        }
    }
}

@Composable
fun FruitList(fruits: List<String>) {
    LazyColumn {
        items(fruits) { fruit ->
            FruitItem(name = fruit)
        }
    }
}

@Composable
fun FruitItem(name: String) {
    Text(text = name, style = MaterialTheme.typography.body1)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeListviewTheme {
        FruitList(fruits = listOf("Apple", "Banana", "Cherry"))
    }
}
