package io.hhplus.cleanarchitecture02.infra.entity

import jakarta.persistence.*
import org.hibernate.annotations.Comment

@Entity
@Table(name = "lecture")
data class LectureEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("특강 id")
    val id: Long,
    @Column(nullable = false)
    @Comment("특강명")
    var lectureName: String,
    @Column(nullable = false)
    @Comment("교수명")
    var professorName: String,
) : BaseEntity()