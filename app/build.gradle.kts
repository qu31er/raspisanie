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
    implementation(platform("androidx.compose:compose-bom:2024.09.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.activity:activity-compose:1.9.2")
    
    // Liquid Glass library
    implementation("com.github.muhammadalkady:liquid-glass-compose:0.1.0")

    // Явно указываем рабочую версию для androidx-группы
    implementation("androidx.compose.material:material-icons-core:1.6.11")
}

// Принудительно заставляем Gradle использовать версию 1.6.11,
// даже если BOM пытается навязать несуществующую 1.7.0
configurations.all {
    resolutionStrategy {
        force("androidx.compose.material:material-icons-core:1.6.11")
    }
}