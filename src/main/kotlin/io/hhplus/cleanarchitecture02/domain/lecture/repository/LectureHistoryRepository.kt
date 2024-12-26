package io.hhplus.cleanarchitecture02.domain.lecture.repository

import io.hhplus.cleanarchitecture02.domain.lecture.LectureHistory
import io.hhplus.cleanarchitecture02.domain.lecture.LectureSchedule

interface LectureHistoryRepository {
    fun findLectureHistoryByLectureScheduleAndUserId(lectureSchedule: LectureSchedule, userId: Long): List<LectureHistory>

    fun save(lectureHistory: LectureHistory): LectureHistory
}