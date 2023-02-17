package br.com.felipe.gadelha.modules.dto.request

import br.com.felipe.gadelha.modules.entity.User
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank

class UserRq(
    @field:NotBlank val name: String,
    @field:NotBlank @field:Email val email: String,
    @field:NotBlank val password: String
) {
    fun toEntity(): User {
        return User(
            name = name,
            email = email,
            password = password
        )
    }
}