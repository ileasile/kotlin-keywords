plugins {
    kotlin("jvm") version "1.4.31"
    id("ru.ileasile.kotlin.keywords.generator")
}

group = "ru.ileasile.kotlin"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}
