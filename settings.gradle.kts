rootProject.name = "Hebe"

enableFeaturePreview("VERSION_CATALOGS" )

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri("https://plugins.gradle.org/m2/") }
        mavenCentral()
    }
}

include("hebe-log")
