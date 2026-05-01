pluginManagement {
    repositories {
        // Allow both Android/Google plugins and others
        google()
        mavenCentral()
        gradlePluginPortal()
    }
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
