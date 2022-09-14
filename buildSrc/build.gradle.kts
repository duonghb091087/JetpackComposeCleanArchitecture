repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
    maven {
        url = uri("https://plugins.gradle.org/m2/")
    }
}

plugins {
    `kotlin-dsl`
}
