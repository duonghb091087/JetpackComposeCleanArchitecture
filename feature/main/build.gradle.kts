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

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion =  Dependencies.Kotlin.compilerExtensionVersion
    }
}

dependencies {
    // depends modules
    implementation(project(":core:ui"))
    implementation(project(":core:data"))
    implementation(project(":feature:main-api"))

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
    implementation(Dependencies.Lifecycle.runtimeKtx)

    // Glide
    implementation(Dependencies.Landscapist.glide)
}
