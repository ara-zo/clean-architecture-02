package io.hhplus.cleanarchitecture02.infra

import io.hhplus.cleanarchitecture02.domain.lecture.Lecture
import io.hhplus.cleanarchitecture02.domain.lecture.repository.LectureRepository
import io.hhplus.cleanarchitecture02.infra.mapper.LectureMapper
import jakarta.persistence.EntityNotFoundException
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Repository

@Repository
@RequiredArgsConstructor
class LectureRepositoryImpl(
    private val lectureJpaRepository: LectureJpaRepository
) : LectureRepository {
    override fun findById(lectureId: Long): Lecture {
        return lectureJpaRepository.findById(lectureId)
            .map(LectureMapper::toDomain)
            .orElseThrow { EntityNotFoundException() }
    }

    override fun findAll(): List<Lecture> {
        return lectureJpaRepository.findAll()
            .map(LectureMapper::toDomain)
    }
}