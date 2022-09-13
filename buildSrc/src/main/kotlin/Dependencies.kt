object Dependencies {

    object Android {
        const val application = "com.android.application"
        const val classpath = "com.android.tools.build:gradle:7.0.0"
        const val codeKtx = "androidx.core:core-ktx:1.7.0"
        const val appcompat = "androidx.appcompat:appcompat:1.3.0"
        const val material = "com.google.android.material:material:1.5.0-alpha05"
        const val startup = "androidx.startup:startup-runtime:1.0.0"
    }

    object Kotlin {
        const val kotlinVersion = "1.6.10"
        const val classpath = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        val reflect = "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"
        const val test = "org.jetbrains.kotlin:kotlin-test:$kotlinVersion"
        const val android = "kotlin-android"
        const val kapt = "kotlin-kapt"
        const val parcelize = "kotlin-parcelize"
    }

    object Hilt {
        const val hiltVersion = "2.37"
        const val plugin = "dagger.hilt.android.plugin"
        const val classpath = "com.google.dagger:hilt-android-gradle-plugin:$hiltVersion"
        const val android = "com.google.dagger:hilt-android:$hiltVersion"
        const val kapt = "com.google.dagger:hilt-android-compiler:$hiltVersion"
    }

    object Navigation {
        const val navigationVersion = "2.3.5"
        const val plugin = "androidx.navigation.safeargs.kotlin"
        const val classpath =
            "androidx.navigation:navigation-safe-args-gradle-plugin:$navigationVersion"
        const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$navigationVersion"
        const val uiKtx = "androidx.navigation:navigation-ui-ktx:$navigationVersion"
    }

    object Glide {
        const val glideVersion = "4.12.0"
        const val glide = "com.github.bumptech.glide:glide:$glideVersion"
        const val kapt = "com.github.bumptech.glide:compiler:$glideVersion"
    }

    object Jitpack {
        const val repository = "https://jitpack.io"
    }

    object Retrofit {
        const val retrofitVersion = "2.9.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val converterGson = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
    }

    object CropImage {
        const val cropImageVersion = "2.8.+"
        const val cropImage = "com.theartofdev.edmodo:android-image-cropper:$cropImageVersion"
    }

    object Timber {
        private const val timberVersion = "4.7.1"
        const val timber = "com.jakewharton.timber:timber:$timberVersion"
    }

    object KotPref {
        const val kotPrefVersion = "2.13.1"
        const val kotPref = "com.chibatching.kotpref:kotpref:$kotPrefVersion"
        const val initializer = "com.chibatching.kotpref:initializer:$kotPrefVersion"
    }

    object PahoMqtt {
        const val pahoMqttVersion = "1.1.0"
        const val pahoMqttServiceVersion = "1.1.1"
        const val client = "org.eclipse.paho:org.eclipse.paho.client.mqttv3:$pahoMqttVersion"
        const val initializer = "org.eclipse.paho:org.eclipse.paho.android.service:$pahoMqttServiceVersion"
        const val maven = "https://repo.eclipse.org/content/repositories/paho-releases/"
    }

    object Lottie {
        const val lottieVersion = "3.7.0"
        const val lottie = "com.airbnb.android:lottie:$lottieVersion"
    }

    object LeakCanary {
        const val leakCanaryVersion = "2.7"
        const val leakCanary = "com.squareup.leakcanary:leakcanary-android:$leakCanaryVersion"
    }

    object ConstraintLayout {
        const val constraintlayoutVersion = "2.0.4"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:$constraintlayoutVersion"
    }

    object Rx {
        const val java = "io.reactivex.rxjava3:rxjava:3.1.0"
        const val rxPermissions = "com.github.tbruyelle:rxpermissions:0.12"
    }

    object Firebase {
        const val bom = "com.google.firebase:firebase-bom:28.4.2"
        const val classpath = "com.google.firebase:firebase-plugins:2.0.0"
        const val analyticsKtx = "com.google.firebase:firebase-analytics-ktx"
    }

    object GoogleServices {
        const val classpath = "com.google.gms:google-services:4.3.10"
        const val plugin = "com.google.gms.google-services"
    }

    object DataStore {
        const val preferences = "androidx.datastore:datastore-preferences:1.0.0"
    }

    object SplashScreen {
        const val core = "androidx.core:core-splashscreen:1.0.0-alpha02"
    }

    object Test {
        const val junit = "junit:junit:4.13.2"
        const val extJunit = "androidx.test.ext:junit:1.1.2"
        const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
        const val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}
