package com.es.din_login.ui.components

import android.app.Activity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Header(navController: NavController) {
    IconButton(onClick = { navController.navigateUp() }) {
        Icon(imageVector = Icons.Sharp.ArrowBack, contentDescription = "Go back", tint = MaterialTheme.colorScheme.primary, modifier = Modifier.size(25.dp))
    }
}