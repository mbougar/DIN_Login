package com.es.din_login.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFe50914),
    onPrimary = Color.White,
    background = Color(0xFF222222),
    surface = Color(0xFF222222),
    onBackground = Color.White,
    onSurface = Color.White
)

@Composable
fun MyAppTheme(content: @Composable () -> Unit) {
    val colors = DarkColorScheme

    MaterialTheme(
        colorScheme = colors,
        typography = ProximaTypography,
        content = content
    )
}