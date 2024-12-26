package io.hhplus.cleanarchitecture02.domain.lecture.service

import io.hhplus.cleanarchitecture02.domain.lecture.LectureSchedule
import io.hhplus.cleanarchitecture02.domain.lecture.repository.LectureHistoryRepository
import org.springframework.stereotype.Component

@Component
class ApplyLectureValidator(
    private val lectureHistoryRepository: LectureHistoryRepository
) : LectureValidator {
    override fun checkApplyLecture(lectureSchedule: LectureSchedule, userId: Long): Boolean {
        return lectureHistoryRepository.findLectureHistoryByLectureScheduleAndUserId(lectureSchedule, userId) != null
    }
}