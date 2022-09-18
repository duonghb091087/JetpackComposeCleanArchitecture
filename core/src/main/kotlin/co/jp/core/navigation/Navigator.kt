package co.jp.core.navigation

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.lifecycle.LiveData

interface Navigator {
    /**
     * スタック上の画面を削除する
     *
     * @return true: popできる画面が存在する false: popできる画面が存在しない
     */
    fun pop(): Boolean

    /**
     * スタック上に新しい画面を追加する
     *
     * @param destination 遷移先画面 ex) profile, profile/{id}
     */
    fun push(destination: String)

    /**
     * スタック上の現在の画面を別の画面で置き換える
     *
     * @param destination 遷移先画面
     */
    fun replace(destination: String)

    /**
     * スタック上の画面を全て削除して、新しい画面を追加する
     *
     * @param destination 遷移先画面
     */
    fun popAllAndPush(destination: String)

    /**
     * スタック上の指定の画面までを全て削除する
     *
     * @param destination スタック上指定画面
     * @param inclusive true: destinationを含める false: destinationを含めない
     */
    fun popUntil(destination: String, inclusive: Boolean = false): Boolean

    /**
     * スタック上の指定の画面までを全て削除して、新しい画面を追加する
     *
     * @param untilDestination スタック上指定画面
     * @param pushDestination 遷移先画面
     * @param inclusive true: untilDestinationを含める false: untilDestinationを含めない
     */
    fun popUntilAndPush(
        untilDestination: String,
        pushDestination: String,
        inclusive: Boolean = false
    )

    fun popWithResult(key: String, value: Any?): Boolean

    fun <T> observeResult(key: String): LiveData<T>?
}

/**
 * appContent遷移用
 */
val AppNavigator = staticCompositionLocalOf<Navigator> {
    error("AppNavigator not found")
}
