package co.jp.core.utils.extension

import java.text.DecimalFormat

fun Int.decimalInt(): String {
    return DecimalFormat("#,###,###").format(this)
}
