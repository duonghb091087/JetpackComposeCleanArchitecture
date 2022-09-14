package co.jp.tracking

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlin.String
import kotlin.collections.Map

object TrackingEvent {

    sealed class Screen(
        val eventName: String
    ) : Parcelable {
        /**
         * Description
         */
        @Parcelize
        object Sample1 : Screen("SCREEN_Sample1")
    }

    sealed class Action(
        val eventName: String,
        val parameters: Map<String, String>
    ) : Parcelable {
        /**
         * Description
         */
        sealed class DeepLink(
            eventName: String,
            parameters: Map<String, String>
        ) : Action(eventName, parameters) {
            /**
             * Description
             */
            @Parcelize
            data class Launch(
                val refererId: String
            ) : DeepLink(
                "EVENT_deep_link_launch",
                mapOf(
                    "referer_id" to refererId
                )
            )
        }
    }
}
