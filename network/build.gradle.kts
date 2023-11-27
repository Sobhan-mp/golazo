@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    id("java-library")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies{
    implementation(libs.io.ktor.client.android)
    implementation(libs.io.ktor.client.serialization)
    implementation(libs.io.ktor.client.logging.jvm)
    implementation(libs.jetbrains.kotlinx.serialization.json)
}