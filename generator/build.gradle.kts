plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
}

val kotlinCompilerVersion: String by project
val kotlinPoetVersion: String by project

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("compiler-embeddable", kotlinCompilerVersion))
    implementation("com.squareup:kotlinpoet:$kotlinPoetVersion")
}

gradlePlugin {
    plugins {
        create("dependencies") {
            id = "ru.ileasile.kotlin.keywords.generator"
            implementationClass = "ru.ileasile.kotlin.keywords.KeywordsGeneratorPlugin"
        }
    }
}
