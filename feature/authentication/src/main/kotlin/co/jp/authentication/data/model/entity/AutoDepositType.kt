package co.jp.authentication.data.model.entity

enum class AutoDepositType(val value: Int) {
    OFF(0),
    THRESHOLD(1),
    DATE(2);

    companion object {
        fun from(value: Int) = values().firstOrNull {
            it.value == value
        } ?: OFF
    }
}
