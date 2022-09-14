plugins {
    id(Dependencies.Android.application)
    id(Dependencies.Kotlin.android)
    id(Dependencies.Kotlin.kapt)
    id(Dependencies.Kotlin.parcelize)
    id(Dependencies.Hilt.plugin)
}

android {
    compileSdk = Versions.compileSdkVersion
    defaultConfig {
        applicationId = Versions.applicationId
        minSdk = Versions.minSdkVersion
        targetSdk = Versions.targetSdkVersion
        versionCode = Versions.versionCode
        versionName = Versions.versionName
        testInstrumentationRunner = Dependencies.Test.instrumentationRunner
    }

    buildTypes {
        getByName("debug") {
            buildConfigField("String", "BASE_URL", "\"abc\"")
        }
        getByName("release") {
            isMinifyEnabled = false
            buildConfigField("String", "BASE_URL", "\"def\"")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    packagingOptions {
        exclude("/META-INF/{AL2.0,LGPL2.1}")
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }

    // Allow references to generated code
    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.Android.codeKtx)
    implementation(Dependencies.Android.material)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.activityCompose)
    implementation(Dependencies.Compose.material3)
    implementation(Dependencies.Compose.uiToolingPreview)
    implementation(Dependencies.Lifecycle.runtimeKtx)
    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.Test.extJunit)
    androidTestImplementation(Dependencies.Test.espresso)
    debugImplementation(Dependencies.Compose.uiTooling)
    debugImplementation(Dependencies.Compose.uiTestManifest)
    androidTestImplementation(Dependencies.Compose.uiTestJunit4)

    // Hilt
    implementation(Dependencies.Hilt.android)
    kapt(Dependencies.Hilt.kapt)

    // Startup
    implementation(Dependencies.Android.startup)

    // Timber
    implementation(Dependencies.Timber.timber)

    // LeakCanary
    debugImplementation(Dependencies.LeakCanary.leakCanary)

    // Splash Screen
    implementation(Dependencies.SplashScreen.core)
}
