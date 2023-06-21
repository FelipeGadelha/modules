package br.com.felipe.gadelha.modules.service

import br.com.felipe.gadelha.modules.model.User
import br.com.felipe.gadelha.modules.repository.UserRepository

class UserService constructor(
    private val userRepository: UserRepository
) {

    fun findAll(): List<User> {
        return userRepository.findAll()
    }

    fun save(user: User): User {
        return userRepository.save(user)
    }
}