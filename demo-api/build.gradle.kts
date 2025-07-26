plugins {
    id("org.springframework.boot")
}

dependencies {
    implementation(project(":demo-core"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
}