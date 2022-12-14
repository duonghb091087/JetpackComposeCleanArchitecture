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
            buildConfigField("String", "API_ENDPOINT", "\"https://newsapi.org/v2/\"")
        }
        getByName("release") {
            isMinifyEnabled = false
            buildConfigField("String", "API_ENDPOINT", "\"https://www.google.com/\"")
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
        kotlinCompilerExtensionVersion = Dependencies.Kotlin.compilerExtensionVersion
    }

    // Allow references to generated code
    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    // depends modules
    implementation(project(":core"))
    implementation(project(":feature:main"))
    implementation(project(":feature:main-api"))
    implementation(project(":feature:authentication"))
    implementation(project(":feature:authentication-api"))

    // Libs
    implementation(Dependencies.Android.coreKtx)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.uiToolingPreview)
    implementation(Dependencies.Compose.foundation)
    implementation(Dependencies.Compose.layout)
    implementation(Dependencies.Compose.material3)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.materialIconsExtended)
    implementation(Dependencies.Compose.runtime)
    implementation(Dependencies.Compose.runtimeLivedata)
    implementation(Dependencies.Compose.uiTooling)
    implementation(Dependencies.Compose.uiUtil)
    implementation(Dependencies.Compose.viewBinding)
    implementation(Dependencies.Compose.activityCompose)
    implementation(Dependencies.Lifecycle.viewModelCompose)
    implementation(Dependencies.Compose.navigation)
    implementation(Dependencies.Lifecycle.runtimeKtx)

    // Hilt
    implementation(Dependencies.Hilt.android)
    kapt(Dependencies.Hilt.kapt)

    // LeakCanary
    debugImplementation(Dependencies.LeakCanary.leakCanary)

    // Splash Screen
    implementation(Dependencies.SplashScreen.core)

    // Timber
    implementation(Dependencies.Timber.timber)

    // Network
    implementation(Dependencies.Okhttp.okhttp)
    implementation(Dependencies.Okhttp.logging)
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.gson)

    // Test
    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.Test.extJunit)
    androidTestImplementation(Dependencies.Test.espresso)
    androidTestImplementation(Dependencies.Test.Mockk.mockk)
    androidTestImplementation(Dependencies.Test.Mockk.android)
}
