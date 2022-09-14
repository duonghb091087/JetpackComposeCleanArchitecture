buildscript {

    repositories {
        google()
        mavenCentral()
        maven(Dependencies.Jitpack.repository)
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }

    dependencies {
        classpath(Dependencies.Android.classpath)
        classpath(Dependencies.Kotlin.classpath)
        classpath(Dependencies.Hilt.classpath)
        classpath(Dependencies.Kotlin.classpath)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(Dependencies.Jitpack.repository)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
