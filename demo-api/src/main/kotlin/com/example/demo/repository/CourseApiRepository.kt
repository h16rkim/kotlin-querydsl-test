package com.example.demo.repository

import com.example.demo.Id
import com.example.demo.domain.course.Course
import com.example.demo.domain.course.repository.CourseRepository
import com.example.demo.domain.user.User
import org.springframework.stereotype.Repository

@Repository
interface CourseApiRepository: CourseRepository, CourseApiQueryRepository {
    fun findBySubInstructorId(subInstructorId: Id<User>): List<Course>
}
