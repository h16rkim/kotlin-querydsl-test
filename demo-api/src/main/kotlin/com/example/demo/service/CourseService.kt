package com.example.demo.service

import com.example.demo.Id
import com.example.demo.domain.user.User
import com.example.demo.repository.CourseApiRepository
import org.springframework.stereotype.Service

@Service
class CourseService(
    private val courseApiRepository: CourseApiRepository,
) {
    fun findByJpaRepository(subInstructorId: Id<User>) = courseApiRepository.findBySubInstructorId(subInstructorId)

    fun findByQueryDsl(subInstructorId: Id<User>) = courseApiRepository.findBySubInstuctorIdQueryDsl(subInstructorId)
}
