pluginManagement {
    repositories {
        // Allow both Android/Google plugins and others
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // Needed for Firebase + AndroidX
        google()
        // Needed for WebRTC and other external libraries
        mavenCentral()
    }
}

rootProject.name = "FluxTalk"
include(":app")
