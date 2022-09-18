package co.jp.core.analytics

import android.os.Bundle
import timber.log.Timber

/**
 * ・GA
 * ・Firebase
 * ・Crashlytics
 * ・Analytics
 */
open class EventTrackerImpl(
    // TODO
    // private val firebaseTracker: FirebaseAnalytics
) : EventTracker {

    /**
     * スクリーントラッキング
     */
    override fun trackScreen(screenName: String) {
        logFirebaseEvent("SCREEN_$screenName", null)
    }

    override fun trackScreen(screen: TrackingEvent.Screen) {
        logFirebaseEvent(screen.eventName, null)
    }

    /**
     * イベントトラッキング
     */
    override fun trackEvent(category: String, action: String, label: String?) {
        trackEvent(
            category,
            action,
            if (label == null) emptyMap() else mapOf(EventTracker.PARAMETER_LABEL to label)
        )
    }

    override fun trackEvent(category: String, action: String, parameters: Map<String, String>) {
        logFirebaseEvent("EVENT_${category}_$action", parameters)
    }

    override fun trackEvent(action: TrackingEvent.Action) {
        logFirebaseEvent(action.eventName, action.parameters)
    }

    private fun logFirebaseEvent(event: String, parameters: Map<String, String>?) {
        val params = parameters?.takeIf { it.isNotEmpty() }
        val bundle = params?.let {
            Bundle().apply {
                it.forEach { putString(it.key, it.value) }
            }
        }

        // TODO
        // firebaseTracker.logEvent(event, bundle)

        val tail = params?.let { " : $it" }.orEmpty()
        Timber.i("[Firebase Event] $event$tail")
    }
}
