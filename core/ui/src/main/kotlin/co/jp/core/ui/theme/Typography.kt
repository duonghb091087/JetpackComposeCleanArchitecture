package co.jp.core.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import kotlin.math.round

/**
 * dimens_base, styles.xmlの一部をJetpack Compose用に移植
 */
private val textXXLarge = 25.sp
private val textXLarge = 21.sp
private val textLarge = 17.sp
private val textMedium = 15.sp
private val textSmall = 13.sp
private val textXSmall = 11.sp
private val textXXSmall = 9.sp

private const val lineSpacingMultiplier = 1.2f

private fun getLineHeight(fontSize: TextUnit): TextUnit {
    return round(fontSize.value * lineSpacingMultiplier).sp
}

val textStyleTitle = TextStyle(
    color = textColorPrimary,
    fontSize = textXLarge,
    lineHeight = getLineHeight(textXLarge)
)

val textStyleTitleLarge = textStyleTitle.copy(
    fontSize = 32.sp,
    lineHeight = getLineHeight(32.sp)
)

val textStyleSubHead = TextStyle(
    color = textColorPrimary,
    fontSize = textLarge,
    lineHeight = getLineHeight(textLarge)
)

val textStyleBody = TextStyle(
    color = textColorPrimary,
    fontSize = textMedium,
    lineHeight = getLineHeight(textMedium)
)

val textStyleCaption = TextStyle(
    color = textColorPrimary,
    fontSize = textSmall,
    lineHeight = getLineHeight(textSmall)
)

