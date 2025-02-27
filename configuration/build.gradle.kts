plugins {
    id("org.springframework.boot") version "3.3.0"
}

dependencies {
    implementation(project(":users:users-application"))
    implementation(project(":users:users-web"))
    implementation(project(":users:users-integration-events"))

    implementation(project(":administration:administration-application"))
    implementation(project(":administration:administration-web"))
    implementation(project(":administration:administration-integration-events"))

    implementation(project(":course-enrollments:course-enrollments-application"))
    implementation(project(":course-enrollments:course-enrollments-web"))
    implementation(project(":course-enrollments:course-enrollments-integration-events"))

    implementation(project(":course-reviews:course-reviews-application"))
    implementation(project(":course-reviews:course-reviews-web"))
    implementation(project(":course-reviews:course-reviews-integration-events"))

    implementation(project(":courses:courses-application"))
    implementation(project(":courses:courses-web"))
    implementation(project(":courses:courses-integration-events"))

    implementation(project(":security:security-config"))
    implementation(project(":web"))
    implementation(project(":common"))

    implementation("org.springframework.boot", "spring-boot-starter-web")
    implementation("org.liquibase", "liquibase-core")

    testImplementation("org.junit.jupiter", "junit-jupiter-api")
    testImplementation("org.mockito", "mockito-junit-jupiter", Versions.mockito)
    testImplementation("com.tngtech.archunit", "archunit-junit5", Versions.archunit)
}

tasks.test {
    useJUnitPlatform()
}
