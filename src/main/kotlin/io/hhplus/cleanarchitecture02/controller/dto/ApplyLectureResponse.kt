package io.hhplus.cleanarchitecture02.controller.dto

import io.hhplus.cleanarchitecture02.domain.lecture.LectureSchedule

class ApplyLectureResponse(
    var lectureId: Long,
    var lectureScheduleId: Long,
    var name: String
) {
    companion object {
        fun of(lectureSchedule: LectureSchedule): ApplyLectureResponse {
            val lecture = lectureSchedule.lecture
            return ApplyLectureResponse(lecture.id, lectureSchedule.id, lecture.lectureName)
        }
    }
}