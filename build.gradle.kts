plugins {
    // Java support
    id("java")
    // Kotlin support
    id("org.jetbrains.kotlin.jvm") version "1.7.21"
    // Gradle Changelog Plugin
    id("org.jetbrains.changelog") version "2.0.0"
}


group = "a.b.c"
version = "101.0.0"

repositories {
    mavenCentral()
}

dependencies {
}

// Set the JVM language level used to build the project. Use Java 11 for 2020.3+, and Java 17 for 2022.2+.
kotlin {
    jvmToolchain(11)
}


// Configure Gradle Changelog Plugin - read more: https://github.com/JetBrains/gradle-changelog-plugin
changelog {
    groups.set(emptyList())
}