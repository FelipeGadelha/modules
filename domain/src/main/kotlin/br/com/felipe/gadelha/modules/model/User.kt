package br.com.felipe.gadelha.modules.model

import java.time.OffsetDateTime
import java.util.Objects

data class User(
    var id: Long? = null,
    val name: String = "",
    val email: String = "",
    val password: String = "",
    val creationDate: OffsetDateTime = OffsetDateTime.now(),
    val updateDate: OffsetDateTime = OffsetDateTime.now()
) {
    fun update(updated: User) = User(
        id = if (Objects.isNull(id)) this.id else updated.id,
        name = updated.name,
        email = updated.email,
        password = if (Objects.isNull(password)) this.password else updated.password,
        creationDate = if (Objects.isNull(creationDate)) this.creationDate else updated.creationDate,
        updateDate = if (Objects.isNull(updateDate)) this.updateDate else updated.updateDate
    )
}