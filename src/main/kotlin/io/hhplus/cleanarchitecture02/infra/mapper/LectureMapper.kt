package io.hhplus.cleanarchitecture02.infra.mapper

import io.hhplus.cleanarchitecture02.domain.lecture.Lecture
import io.hhplus.cleanarchitecture02.infra.entity.LectureEntity

object LectureMapper {
    fun toDomain(lectureEntity: LectureEntity): Lecture {
        return Lecture.create(lectureEntity.id, lectureEntity.lectureName, lectureEntity.professorName)
    }

    fun toEntity(lecture: Lecture): LectureEntity {
        return LectureEntity(lecture.id, lecture.lectureName, lecture.professorName)
    }
}