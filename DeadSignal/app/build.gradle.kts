plugins { id("com.android.application") }
android {
    namespace = "com.deadsignal.game"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.deadsignal.game"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.3"
    }
    buildTypes { release { isMinifyEnabled = false } }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
}
dependencies { implementation("androidx.webkit:webkit:1.12.1") }
