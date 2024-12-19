// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
//    id("com.android.application") version "8.0.0" apply false
//    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
    id("com.google.devtools.ksp") version "1.9.22-1.0.17" apply false
}