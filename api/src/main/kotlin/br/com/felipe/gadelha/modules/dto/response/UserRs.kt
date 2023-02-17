package br.com.felipe.gadelha.modules.dto.response

import br.com.felipe.gadelha.modules.entity.User

class UserRs(
    val id: Long,
    val name: String,
    val email: String
) {
    constructor(user: User):
        this(
            id = user.id!!,
            name = user.name,
            email = user.email
        )
}