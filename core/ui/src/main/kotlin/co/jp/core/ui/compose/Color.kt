package co.jp.core.ui.compose

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

private const val appGray01 = 0xFF26262A
private const val appGray02 = 0xFF808084
private const val appGray04 = 0xFFE1E1E1
private const val appGray50 = 0xFFF7F8F9
private const val appGray400 = 0xFF9A9A9E
private const val appGray500 = 0xFF808084
private const val appBlue = 0xFF0D97FF
private const val appGreen = 0xFF00BD71
private const val appError = 0xFFFF6A56

val appGray01Color = Color(appGray01)
val appGray02Color = Color(appGray02)
val appGray50Color = Color(appGray50)
val appGray400Color = Color(appGray400)
val appGray500Color = Color(appGray500)
val textColorPrimary = Color(appGray01)
val appBlueColor = Color(appBlue)
val appGreenColor = Color(appGreen)

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

private const val border = 0xFFD2D2D6
val borderColor = Color(border)

private val primary = Color.White
private val primaryVariant = Color(appGray04)
private val secondary = appBlueColor
private val secondaryVariant = secondary
private val background = Color.White
private val onPrimary = Color.White
private val onSecondary = Color.White
private val onBackground = textColorPrimary
private val surface = Color.White
private val onSurface = textColorPrimary
private val error = Color(appError)
private val onError = Color.White

val appColors = Colors(
    primary = primary,
    primaryVariant = primaryVariant,
    secondary = secondary,
    secondaryVariant = secondaryVariant,
    background = background,
    surface = surface,
    error = error,
    onPrimary = onPrimary,
    onSecondary = onSecondary,
    onBackground = onBackground,
    onSurface = onSurface,
    onError = onError,
    isLight = true
)
