plugins {
    java
}

group = "org.hebe:log"
version = "0.1"

dependencies {
    implementation(libs.guava)
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}