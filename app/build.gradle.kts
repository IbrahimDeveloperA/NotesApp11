plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.ru.app.kubik.noteapp1"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.ru.app.kubik.noteapp1"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
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
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    ///Nav host
    val navVersion = "2.9.1"
    implementation ("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation ("androidx.navigation:navigation-ui-ktx:$navVersion")

    val roomVersion = "2.7.2"
    // optional - Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:$roomVersion")
    annotationProcessor ("androidx.room:room-compiler:$roomVersion")
    // See Add the KSP plugin to your project
    ksp("androidx.room:room-compiler:$roomVersion")
}