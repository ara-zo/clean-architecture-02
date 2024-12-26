package io.hhplus.cleanarchitecture02.infra

import io.hhplus.cleanarchitecture02.domain.lecture.Lecture
import io.hhplus.cleanarchitecture02.domain.lecture.LectureSchedule
import io.hhplus.cleanarchitecture02.domain.lecture.repository.LectureScheduleRepository
import io.hhplus.cleanarchitecture02.infra.mapper.LectureScheduleMapper
import jakarta.persistence.EntityNotFoundException
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Repository
import java.time.LocalDate
import java.time.LocalTime

@Repository
@RequiredArgsConstructor
class LectureScheduleRepositoryImpl(
    private val lectureScheduleJpaRepository: LectureScheduleJpaRepository
) : LectureScheduleRepository {
    override fun findById(lectureScheduleId: Long): LectureSchedule {
        return lectureScheduleJpaRepository.findById(lectureScheduleId)
            .map(LectureScheduleMapper::toDomain)
            .orElseThrow { EntityNotFoundException() }
    }

    override fun findAllLectureScheduleList(lecture: Lecture): List<LectureSchedule> {
        return lectureScheduleJpaRepository.findAll()
            .map(LectureScheduleMapper::toDomain)
    }

    override fun findLectureScheduleByCreateDate(searchDate: LocalDate): List<LectureSchedule> {
        val startOfDay = searchDate.atStartOfDay()
        val endOfDay = searchDate.atTime(LocalTime.MAX)

        return lectureScheduleJpaRepository.findByCreateDateTimeBetween(startOfDay, endOfDay)
            .map(LectureScheduleMapper::toDomain)
    }

    override fun save(lectureSchedule: LectureSchedule): LectureSchedule {
        return LectureScheduleMapper.toDomain(
            lectureScheduleJpaRepository.save(LectureScheduleMapper.toEntity(lectureSchedule))
        )
    }

}