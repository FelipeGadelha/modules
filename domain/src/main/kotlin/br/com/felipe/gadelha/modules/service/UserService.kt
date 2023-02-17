package br.com.felipe.gadelha.modules.service

import br.com.felipe.gadelha.modules.entity.User
import br.com.felipe.gadelha.modules.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService @Autowired constructor(
    private val userRepository: UserRepository
) {

    fun findAll(): List<User> {
        return userRepository.findAll()
    }

    fun save(user: User): User {
        return userRepository.save(user)
    }
}