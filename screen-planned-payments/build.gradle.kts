plugins {
    id("ivy.feature")
}

android {
    namespace = "com.ivy.planned"
}

dependencies {
    implementation(projects.ivyCore)
    implementation(projects.ivyResources)
    implementation(projects.ivyDesign)
    implementation(projects.ivyNavigation)
    implementation(projects.ivyLegacyCode)

    implementation(libs.eventbus)
}