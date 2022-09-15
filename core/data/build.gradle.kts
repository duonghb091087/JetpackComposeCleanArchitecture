plugins {
    id(Dependencies.Android.library)
    id(Dependencies.Kotlin.android)
    id(Dependencies.Kotlin.kapt)
    id(Dependencies.Kotlin.parcelize)
    id(Dependencies.Hilt.plugin)
}

android {
    compileSdk = Versions.compileSdkVersion
    defaultConfig {
        minSdk = Versions.minSdkVersion
        targetSdk = Versions.targetSdkVersion
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    // Libs
    implementation(Dependencies.Android.coreKtx)

    // Hilt
    implementation(Dependencies.Hilt.android)
    kapt(Dependencies.Hilt.kapt)

    // Timber
    implementation(Dependencies.Timber.timber)
}
