package io.hhplus.cleanarchitecture02.infra

import io.hhplus.cleanarchitecture02.infra.entity.LectureEntity
import io.hhplus.cleanarchitecture02.infra.entity.LectureScheduleEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface LectureScheduleJpaRepository : JpaRepository<LectureScheduleEntity, Long> {
    fun findAllByLecture(lectureEntity: LectureEntity): List<LectureScheduleEntity>

    fun findByCreateDateTimeBetween(startDate: LocalDateTime, endDate: LocalDateTime): List<LectureScheduleEntity>
}