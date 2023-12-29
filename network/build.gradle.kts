import org.jetbrains.kotlin.ir.builders.declarations.buildVariable

@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.org.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

ext{
    val apiToken = hasProperty("GOLAZO_API_TOKEN")
}

dependencies{
    implementation(libs.io.ktor.client.android)
    implementation(libs.io.ktor.client.serialization)
    implementation(libs.io.ktor.client.logging.jvm)
    implementation(libs.io.ktor.client.logging)
    testImplementation(libs.ktor.client.mock)
    implementation(libs.ktor.server.default.headers)
    implementation(libs.jetbrains.kotlinx.serialization.json)
    implementation(libs.koin.core)

    testImplementation(libs.junit)
    testImplementation (libs.koin.test.junit4)
}