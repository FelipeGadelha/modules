package br.com.felipe.gadelha.modules.repository

import br.com.felipe.gadelha.modules.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long> {
}