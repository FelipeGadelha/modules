package br.com.felipe.gadelha.modules.v1.controller

import br.com.felipe.gadelha.modules.dto.request.UserRq
import br.com.felipe.gadelha.modules.dto.response.UserRs
import br.com.felipe.gadelha.modules.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController @Autowired constructor(
    private val userService: UserService
) {

    @GetMapping
    fun findAll(): ResponseEntity<List<UserRs>> {
        return userService.findAll()
            .map { UserRs(it) }
            .run { ResponseEntity.ok().body(this) }
    }

    @PostMapping
    fun save(userRq: UserRq): ResponseEntity<UserRs> {
        return userService.save(userRq.toEntity())
            .run { UserRs(this) }
            .run { ResponseEntity.ok().body(this) }
    }
}