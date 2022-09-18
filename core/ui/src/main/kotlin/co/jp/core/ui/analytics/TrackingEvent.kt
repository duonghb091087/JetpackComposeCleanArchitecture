package co.jp.core.ui.analytics

import kotlin.String
import kotlin.collections.Map

sealed interface TrackingEvent {

    sealed class Screen(val eventName: String) : TrackingEvent

    sealed class Action(
        val eventName: String,
        val parameters: Map<String, String>
    ) : TrackingEvent
}
