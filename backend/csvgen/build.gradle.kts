import com.diffplug.gradle.spotless.SpotlessExtension

plugins {
    kotlin("jvm") version "1.9.25"
    kotlin("plugin.spring") version "1.9.25"
    kotlin("plugin.jpa") version "1.9.25"
    id("org.springframework.boot") version "3.3.3"
    id("io.spring.dependency-management") version "1.1.6"
    id("com.diffplug.spotless") version "6.25.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    // PostgreSQL dependency
    runtimeOnly("org.postgresql:postgresql:42.7.3")

    // Hibernate core dependency
    implementation("org.hibernate:hibernate-core:6.5.2.Final")

    // Liquibase dependency
    implementation("org.liquibase:liquibase-core:4.29.0")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

configure<SpotlessExtension> {
    kotlin {
        target("**/*.kt")
        targetExclude("**/build/**")
        ktlint()
    }

    kotlinGradle {
        target("**/*.kts")
        targetExclude("**/build/**")
        // Apply ktlint formatting
        ktlint()
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.named("check") {
    dependsOn("spotlessApply")
}
