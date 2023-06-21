package br.com.felipe.gadelha.modules.repository

import br.com.felipe.gadelha.modules.model.User

interface UserRepository {
    fun findAll(): List<User>
    fun save(user: User): User

}