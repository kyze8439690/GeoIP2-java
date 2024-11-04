@file:Suppress("MagicNumber")
plugins {
    id("com.android.library")
}

android {
    compileSdk = 34
    buildToolsVersion = "34.0.0"

    defaultConfig {
        minSdk = 21
        targetSdk = 34

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    namespace = "com.maxmind.geoip2"
}

dependencies {
    api(project(":MaxMind-DB-Reader-java"))
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.2")
    implementation("commons-codec:commons-codec:1.17.1")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.18.1")
    implementation("com.fasterxml.jackson.core:jackson-core:2.18.1")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.18.1")
    implementation("com.google.guava:guava:33.3.1-android")
    testImplementation("junit:junit:4.13.2")
    testImplementation("com.github.tomakehurst:wiremock:3.0.1")
    testImplementation("org.skyscreamer:jsonassert:1.5.3")
    testImplementation("org.slf4j:slf4j-simple:2.0.16")
    testImplementation("com.fasterxml.jackson.jr:jackson-jr-objects:2.18.1")
    testImplementation("pl.pragmatists:JUnitParams:1.1.1")
    testImplementation("com.jcabi:jcabi-matchers:1.7.0")
}
