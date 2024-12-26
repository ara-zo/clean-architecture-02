package io.hhplus.cleanarchitecture02.controller.dto

import io.hhplus.cleanarchitecture02.domain.lecture.Lecture

class FindLectureResponse(
    var lectureId: Long,
    var lectureName: String,
    var professorName: String
) {
    companion object {
        fun of(lecture: Lecture): FindLectureResponse {
            return FindLectureResponse(lecture.id, lecture.lectureName, lecture.professorName)
        }
    }
}