plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "me.dev06"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}