pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")
include(":chapter01")
include(":chapter02")
include(":chapter03")
include(":chapter04")
include(":chapter07")
include(":chapter09")
include(":chapter06")
include(":chapter05")
include(":chapter08")
include(":chapter10")
