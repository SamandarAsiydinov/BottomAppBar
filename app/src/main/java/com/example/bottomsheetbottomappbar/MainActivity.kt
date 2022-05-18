package com.example.bottomsheetbottomappbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bottomsheetbottomappbar.bottom_app.MyBottomAppBar
import com.example.bottomsheetbottomappbar.bottom_sheet.BottomSheet
import com.example.bottomsheetbottomappbar.ui.theme.BottomSheetBottomAppBarTheme

@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomSheetBottomAppBarTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    MyBottomAppBar()
                }
            }
        }
    }
}