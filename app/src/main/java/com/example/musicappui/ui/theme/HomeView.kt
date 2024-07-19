package com.example.musicappui.ui.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.musicappui.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Home(){
    val category = listOf("Hits", "Happy", "Workout", "Running", "TGIF", "Yoga")
    val group = listOf<String>("New Release", "Favorites", "Top Rated").groupBy { it[0] }
    LazyColumn {
        group.forEach {
            stickyHeader {
                Text(
                    text = it.value[0],
                    modifier = Modifier.padding(16.dp)
                    )
                LazyRow {
                    items(category){
                        cat->
                        BrowserItem(cat= cat, drawable = R.drawable.ic_launcher_foreground)
                    }
                }
            }
        }
    }
}