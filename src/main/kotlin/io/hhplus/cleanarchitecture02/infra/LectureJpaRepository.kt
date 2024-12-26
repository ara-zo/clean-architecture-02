package io.hhplus.cleanarchitecture02.infra

import io.hhplus.cleanarchitecture02.infra.entity.LectureEntity
import org.springframework.data.jpa.repository.JpaRepository

interface LectureJpaRepository : JpaRepository<LectureEntity, Long>