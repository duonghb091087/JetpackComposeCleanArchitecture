package co.jp.core.data.analytics

import co.jp.tracking.TrackingEvent

/**
 * ・GA
 * ・Firebase
 * ・Crashlytics
 * ・Analytics
 */
interface EventTracker {

    companion object {
        const val CATEGORY_INIT = "init"

        const val ACTION_FETCHED_REMOTE_CONFIG = "fetched_remote_config"

        // Parameter
        const val PARAMETER_LABEL = "label"

        // Type
        const val TYPE_EMAIL = "email"

        // Label
        const val LABEL_SEND = "send"
        const val LABEL_REQUEST = "request"
    }

    /**
     * Track screen
     */
    fun trackScreen(screenName: String)

    fun trackScreen(screen: TrackingEvent.Screen)

    /**
     * Track UI event
     */
    fun trackEvent(category: String, action: String, label: String? = null)

    /**
     * Track UI event
     */
    fun trackEvent(category: String, action: String, parameters: Map<String, String>)

    fun trackEvent(action: TrackingEvent.Action)
}
