package com.example.musicappui.ui.theme

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicappui.R

@Preview
@Composable
fun BrowseView() {
    val category = listOf("Hits", "Happy", "Workout", "Running", "TGIF", "Yoga")
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(category){
            cat ->
                BrowserItem(cat= cat, drawable = R.drawable.ic_launcher_foreground)
        }
    }
}