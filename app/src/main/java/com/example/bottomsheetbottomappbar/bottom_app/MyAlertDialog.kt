package com.example.bottomsheetbottomappbar.bottom_app

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.text.font.FontWeight

@Composable
fun MyAlertDialog(openDialog: MutableState<Boolean>) {
    if (openDialog.value) {
        AlertDialog(onDismissRequest = {
            openDialog.value = false
        },
            title = {
                Text(
                    text = "Floating Action Button",
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Text(
                    text = "Loading.."
                )
            },
            confirmButton = {
                Button(onClick = {
                    openDialog.value = false
                }) {
                    Text(text = "Ok")
                }
            }
        )
    }
}