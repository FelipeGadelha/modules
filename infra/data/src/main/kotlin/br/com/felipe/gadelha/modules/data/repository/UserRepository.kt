package br.com.felipe.gadelha.modules.data.repository

import br.com.felipe.gadelha.modules.data.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<UserEntity, Long>