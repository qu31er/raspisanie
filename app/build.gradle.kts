plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.example.schoolbell"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.schoolbell"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    // Убрали BOM, указываем версии явно
    implementation("androidx.compose.ui:ui:1.7.0")
    implementation("androidx.compose.material3:material3:1.3.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.7.0")
    implementation("androidx.activity:activity-compose:1.9.2")
    
    // Liquid Glass library
    implementation("com.github.muhammadalkady:liquid-glass-compose:0.1.0")

    // Рабочая версия иконок (не из BOM)
    implementation("org.jetbrains.compose.material:material-icons-core:1.6.11")
}