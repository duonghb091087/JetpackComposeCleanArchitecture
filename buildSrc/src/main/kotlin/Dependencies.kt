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
        const val lifecycleVersion = "2.5.1"
        const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
        const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion"
    }

    object Compose {
        const val composeVersion = "1.3.0-beta02"
        const val ui = "androidx.compose.ui:ui:$composeVersion"
        const val material3 = "androidx.compose.material3:material3:1.0.0-beta02"
        const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"
        const val uiTooling = "androidx.compose.ui:ui-tooling:$composeVersion"
        const val foundation = "androidx.compose.foundation:foundation:$composeVersion"
        const val layout = "androidx.compose.foundation:foundation-layout:$composeVersion"
        const val material = "androidx.compose.material:material:$composeVersion"
        const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$composeVersion"
        const val runtime = "androidx.compose.runtime:runtime:$composeVersion"
        const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:$composeVersion"
        const val uiUtil = "androidx.compose.ui:ui-util:$composeVersion"
        const val viewBinding = "androidx.compose.ui:ui-viewbinding:$composeVersion"
        const val navigation = "androidx.navigation:navigation-compose:2.5.2"
        const val activityCompose = "androidx.activity:activity-compose:1.5.1"
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
        const val hiltVersion = "2.43.2"
        const val plugin = "dagger.hilt.android.plugin"
        const val classpath = "com.google.dagger:hilt-android-gradle-plugin:$hiltVersion"
        const val android = "com.google.dagger:hilt-android:$hiltVersion"
        const val kapt = "com.google.dagger:hilt-android-compiler:$hiltVersion"
        const val navigationCompose = "androidx.hilt:hilt-navigation-compose:1.0.0"
    }

    object Landscapist {
        const val landscapistVersion = "2.0.0"
        const val glide = "com.github.skydoves:landscapist-glide:$landscapistVersion"
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

    object Okhttp {
        val okhttpVersion = "4.10.0"
        val okhttp = "com.squareup.okhttp3:okhttp:$okhttpVersion"
        val logging = "com.squareup.okhttp3:logging-interceptor:$okhttpVersion"
    }

    object Retrofit {
        const val retrofitVersion = "2.9.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val gson = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
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
            const val mockkVersion = "1.12.7"
            const val mockk = "io.mockk:mockk:$mockkVersion"
            const val android = "io.mockk:mockk-android:$mockkVersion"
        }

        object Compose {
            const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:$composeVersion"
            const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$composeVersion"
        }
    }
}
