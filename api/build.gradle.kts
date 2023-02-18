import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
	id("application")
}

dependencies {
	implementation(project(":domain"))
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-validation")
}
tasks.withType<BootJar> {
	archiveBaseName.set("application")
	destinationDirectory.set(file("${rootProject.buildDir}/libs"))
}