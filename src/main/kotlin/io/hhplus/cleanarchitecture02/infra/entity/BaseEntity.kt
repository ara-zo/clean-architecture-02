package io.hhplus.cleanarchitecture02.infra.entity

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.Comment
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntity(
    @CreatedDate
    @Column(nullable = false, updatable = false)
    @Comment("생성일시")
    var createDateTime: LocalDateTime? = LocalDateTime.now(),
    @LastModifiedDate
    @Comment("수정일시")
    var updateDateTime: LocalDateTime? = null,
)