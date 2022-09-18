package co.jp.core.data.entity

/**
 * この例外を送出すると、ユーザーに表示するエラーメッセージに `errorMessage` プロパティが直接利用されます。
 *
 * エラーレスポンスのdetailCodeをチェックして例外を振り分けるユースケースに利用します。
 * OkHttpのResponseBodyは一度読み込むとcloseされてしまうため、そのままHttpExceptionとして再送出しても
 * エラーメッセージをパースできないためです。
 */
open class ErrorMessageException(val errorMessage: String) : RuntimeException(errorMessage)
