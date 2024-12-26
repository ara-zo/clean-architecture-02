package io.hhplus.cleanarchitecture02.domain.lecture.service

import io.hhplus.cleanarchitecture02.domain.lecture.LectureSchedule

interface LectureValidator {
    fun checkApplyLecture(lectureSchedule: LectureSchedule, userId: Long): Boolean
}