package br.com.felipe.gadelha.modules.data.entity

import br.com.felipe.gadelha.modules.model.User
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.NotBlank
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.OffsetDateTime
import java.util.Objects

@Entity
@Table(name = "users")
data class UserEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @NotBlank val name: String = "",
    @NotBlank val email: String = "",
    @NotBlank val password: String = "",

    @CreationTimestamp
    @Column(name = "creation_date", nullable = false)
    val creationDate: OffsetDateTime = OffsetDateTime.now(),

    @UpdateTimestamp @Column(name = "update_date", nullable = false)
    val updateDate: OffsetDateTime = OffsetDateTime.now()
) {
    fun update(updated: UserEntity) = UserEntity(
        id = if (Objects.isNull(id)) this.id else updated.id,
        name = updated.name,
        email = updated.email,
        password = if (Objects.isNull(password)) this.password else updated.password,
        creationDate = if (Objects.isNull(creationDate)) this.creationDate else updated.creationDate,
        updateDate = if (Objects.isNull(updateDate)) this.updateDate else updated.updateDate
    )

    fun toModel(updated: User) = User(
        id = if (Objects.isNull(id)) this.id else updated.id,
        name = updated.name,
        email = updated.email,
        password = if (Objects.isNull(password)) this.password else updated.password,
        creationDate = if (Objects.isNull(creationDate)) this.creationDate else updated.creationDate,
        updateDate = if (Objects.isNull(updateDate)) this.updateDate else updated.updateDate
    )
}