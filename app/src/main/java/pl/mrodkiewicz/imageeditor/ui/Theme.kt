package pl.mrodkiewicz.imageeditor.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

public val yellowPrimary = Color(235, 183, 22)
public val yellowLightPrimary = Color(255, 233, 83)
public val yellowDarkPrimary = Color(180, 136, 0)
public val darkAccent = Color(25, 32, 24)
public val darkLightAccent = Color(63, 71, 62)
public val darkDarkAccent = Color(0,0, 0)
public val blackTextColor = Color(0,0, 0)
public val whiteTextColor = Color(255,255,255)


private val DarkColorPalette = darkColors(
    primary = yellowPrimary,
    primaryVariant = yellowDarkPrimary,
    secondary = darkAccent,
    background = Color.Black,
    surface = Color.Black,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
)

private val LightColorPalette = lightColors(
    primary = yellowPrimary,
    primaryVariant = yellowDarkPrimary,
    secondary = darkAccent,
    background = Color.Black,
    surface = Color.Black,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,

)
public val shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp)
)

@Composable
 public fun ImageEditorTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}