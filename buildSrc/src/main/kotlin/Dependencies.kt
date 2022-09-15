import Dependencies.Compose.composeVersion

object Dependencies {

    object Android {
        const val application = "com.android.application"
        const val library = "com.android.library"
        const val classpath = "com.android.tools.build:gradle:7.2.2"
        const val coreKtx = "androidx.core:core-ktx:1.9.0"
        const val material = "com.google.android.material:material:1.5.0-alpha04"
        const val startup = "androidx.startup:startup-runtime:1.0.0"
    }

    object Lifecycle {
        const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1"
        const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1"
    }

    object Compose {
        const val composeVersion = "1.3.0-beta02"
        const val ui = "androidx.compose.ui:ui:$composeVersion"
        const val material3 = "androidx.compose.material3:material3:1.0.0-beta02"
        const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"
        const val uiTooling = "androidx.compose.ui:ui-tooling:$composeVersion"
        val foundation = "androidx.compose.foundation:foundation:$composeVersion"
        val layout = "androidx.compose.foundation:foundation-layout:$composeVersion"
        val material = "androidx.compose.material:material:$composeVersion"
        val materialIconsExtended = "androidx.compose.material:material-icons-extended:$composeVersion"
        val runtime = "androidx.compose.runtime:runtime:$composeVersion"
        val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:$composeVersion"
        val uiUtil = "androidx.compose.ui:ui-util:$composeVersion"
        val viewBinding = "androidx.compose.ui:ui-viewbinding:$composeVersion"

        val activityComposeVersion = "1.5.1"
        val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"
    }

    object Kotlin {
        const val kotlinVersion = "1.7.10"
        const val classpath = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        const val reflect = "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"
        const val test = "org.jetbrains.kotlin:kotlin-test:$kotlinVersion"
        const val android = "kotlin-android"
        const val kapt = "kotlin-kapt"
        const val parcelize = "kotlin-parcelize"
        const val jetbrains = "org.jetbrains.kotlin.android"
        const val compilerExtensionVersion = "1.3.1"
    }

    object Hilt {
        const val hiltVersion = "2.38.1"
        const val plugin = "dagger.hilt.android.plugin"
        const val classpath = "com.google.dagger:hilt-android-gradle-plugin:$hiltVersion"
        const val android = "com.google.dagger:hilt-android:$hiltVersion"
        const val kapt = "com.google.dagger:hilt-android-compiler:$hiltVersion"
        const val navigationCompose = "androidx.hilt:hilt-navigation-compose:1.0.0"
    }

    object Landscapist {
        val landscapistVersion = "2.0.0"
        val glide = "com.github.skydoves:landscapist-glide:$landscapistVersion"
    }

    object Jitpack {
        const val repository = "https://jitpack.io"
    }

    object Timber {
        private const val timberVersion = "5.0.1"
        const val timber = "com.jakewharton.timber:timber:$timberVersion"
    }

    object LeakCanary {
        const val leakCanaryVersion = "2.9.1"
        const val leakCanary = "com.squareup.leakcanary:leakcanary-android:$leakCanaryVersion"
    }

    object SplashScreen {
        const val core = "androidx.core:core-splashscreen:1.0.0-alpha02"
    }

    object Test {
        const val junit = "junit:junit:4.13.2"
        const val extJunit = "androidx.test.ext:junit:1.1.2"
        const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
        const val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        object Mockk {
            val mockkVersion = "1.12.7"
            val mockk = "io.mockk:mockk:$mockkVersion"
            val android = "io.mockk:mockk-android:$mockkVersion"
        }

        object Compose {
            const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:$composeVersion"
            const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$composeVersion"
        }
    }
}
