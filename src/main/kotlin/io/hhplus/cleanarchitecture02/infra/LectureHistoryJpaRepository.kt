package io.hhplus.cleanarchitecture02.infra

import io.hhplus.cleanarchitecture02.infra.entity.LectureHistoryEntity
import io.hhplus.cleanarchitecture02.infra.entity.LectureScheduleEntity
import org.springframework.data.jpa.repository.JpaRepository

interface LectureHistoryJpaRepository : JpaRepository<LectureHistoryEntity, Long> {
    fun findLectureHistoryByLectureScheduleAndUserId(lectureScheduleEntity: LectureScheduleEntity, userId: Long): List<LectureHistoryEntity>
}