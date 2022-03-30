plugins {
    id("com.android.library")
}

android {
    compileSdk = 31
    buildToolsVersion = "30.0.3"

    defaultConfig {
        minSdk = 21
        targetSdk = 31

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
}

dependencies {
    api(project(":MaxMind-DB-Reader-java"))
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:1.1.5")
    implementation("commons-codec:commons-codec:1.15")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.1")
    implementation("com.fasterxml.jackson.core:jackson-core:2.13.1")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.13.1")
    implementation("com.google.guava:guava:31.1-android")
    testImplementation("junit:junit:4.13.2")
    testImplementation("com.github.tomakehurst:wiremock:2.27.2")
    testImplementation("org.skyscreamer:jsonassert:1.5.0")
    testImplementation("org.slf4j:slf4j-simple:1.7.32")
    testImplementation("com.fasterxml.jackson.jr:jackson-jr-objects:2.13.1")
    testImplementation("pl.pragmatists:JUnitParams:1.1.1")
    testImplementation("com.jcabi:jcabi-matchers:1.5.3")
}