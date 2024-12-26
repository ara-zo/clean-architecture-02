package io.hhplus.cleanarchitecture02.infra.mapper

import io.hhplus.cleanarchitecture02.domain.lecture.LectureHistory
import io.hhplus.cleanarchitecture02.infra.entity.LectureHistoryEntity

object LectureHistoryMapper {
    fun toDomain(lectureHistoryEntity: LectureHistoryEntity): LectureHistory {
        return LectureHistory.create(
            lectureHistoryEntity.id,
            LectureScheduleMapper.toDomain(lectureHistoryEntity.lectureSchedule),
            lectureHistoryEntity.userId
        )
    }

    fun toEntity(lectureHistory: LectureHistory): LectureHistoryEntity {
        return LectureHistoryEntity(
            lectureHistory.id!!,
            LectureScheduleMapper.toEntity(lectureHistory.lectureSchedule),
            lectureHistory.userId
        )
    }
}