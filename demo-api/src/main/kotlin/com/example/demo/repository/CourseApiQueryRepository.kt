package com.example.demo.repository

import com.example.demo.Id
import com.example.demo.domain.user.User
import com.example.demo.repository.dto.CourseResult

interface CourseApiQueryRepository {
    fun findBySubInstuctorIdQueryDsl(subInstructorId: Id<User>): List<CourseResult>
}
