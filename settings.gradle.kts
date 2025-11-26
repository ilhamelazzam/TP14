pluginManagement {
    repositories {
        google()
        mavenCentral()
        // Extra repo needed for ksoap2 Android artifacts
        maven { url = uri("https://oss.sonatype.org/content/repositories/ksoap2-android-releases/") }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Extra repo needed for ksoap2 Android artifacts
        maven { url = uri("https://oss.sonatype.org/content/repositories/ksoap2-android-releases/") }
    }
}

rootProject.name = "SOAPCompteApp"
include(":app")
