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
    // our modules
    implementation(project(":core:data"))

    // core
    implementation(Dependencies.Android.codeKtx)
    implementation(Dependencies.Android.material)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.activityCompose)
    implementation(Dependencies.Compose.material3)
    implementation(Dependencies.Compose.uiToolingPreview)
    implementation(Dependencies.Lifecycle.runtimeKtx)
    testImplementation(Dependencies.Test.junit)
    testImplementation(Dependencies.Test.Mockk.mockk)
    androidTestImplementation(Dependencies.Test.extJunit)
    androidTestImplementation(Dependencies.Test.espresso)
    debugImplementation(Dependencies.Compose.uiTooling)
    debugImplementation(Dependencies.Test.Compose.uiTestManifest)
    androidTestImplementation(Dependencies.Test.Compose.uiTestJunit4)

    // Hilt
    implementation(Dependencies.Hilt.android)
    kapt(Dependencies.Hilt.kapt)

    // Timber
    implementation(Dependencies.Timber.timber)
}
