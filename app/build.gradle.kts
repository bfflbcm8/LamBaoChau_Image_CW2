plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.LamBaoChauImageCW2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.LamBaoChauImageCW2"
        minSdk = 24
        //noinspection OldTargetApi
        targetSdk = 32
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        multiDexEnabled = true

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
}

dependencies {



    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.google.firebase:firebase-messaging:23.3.1")
    implementation ("com.google.android.play:core:1.10.3")

    // view model
    implementation("androidx.lifecycle:lifecycle-livedata:2.6.2")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    //liveData
    implementation("androidx.lifecycle:lifecycle-livedata:2.6.2")
    implementation("androidx.lifecycle:lifecycle-common-java8:2.6.2")

    //room
    implementation("androidx.room:room-migration:2.6.0")
    annotationProcessor("androidx.room:room-compiler:2.6.0")



}