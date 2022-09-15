package co.jp.core.ui.utils.extension

import java.text.DecimalFormat

fun Int.decimalInt(): String {
    return DecimalFormat("#,###,###").format(this)
}
