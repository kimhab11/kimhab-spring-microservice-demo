plugins {
    id("org.springframework.boot")
    kotlin("jvm")
    kotlin("plugin.spring")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-gateway:3.1.3")
    implementation("org.springframework.boot:spring-boot-starter-actuator:2.7.3")

    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:3.1.4")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    developmentOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}