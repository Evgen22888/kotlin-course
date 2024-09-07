plugins {
    kotlin("jvm") version "2.0.10"
}

group = "com.kimgem28.kotlin-course"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}