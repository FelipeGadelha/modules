allOpen {
	annotation("jakarta.persistence.Entity")
	annotation("jakarta.persistence.MappedSuperclass")
//	annotation("jakarta.persistence.Embeddable")
}

springBoot {
	mainClass.set("api.src.main.kotlin.br.com.felipe.gadelha.modules.ModulesApplication")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.postgresql:postgresql")
}