plugins {
    id(Dependencies.Android.library)
    id(Dependencies.Kotlin.android)
    id(Dependencies.Kotlin.parcelize)
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
}
