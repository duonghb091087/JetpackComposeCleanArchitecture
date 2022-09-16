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
        kotlinCompilerExtensionVersion = Dependencies.Kotlin.compilerExtensionVersion
    }

    // Allow references to generated code
    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    // depends modules
    implementation(project(":core:ui"))
    implementation(project(":core:data"))
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

    // Startup
    implementation(Dependencies.Android.startup)

    // LeakCanary
    debugImplementation(Dependencies.LeakCanary.leakCanary)

    // Splash Screen
    implementation(Dependencies.SplashScreen.core)

    // Timber
    implementation(Dependencies.Timber.timber)
}
