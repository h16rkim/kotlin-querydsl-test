package com.example.demo.repository

import com.example.demo.Id
import com.example.demo.domain.course.QCourse.course
import com.example.demo.domain.user.User
import com.example.demo.repository.dto.CourseResult
import com.example.demo.value
import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQueryFactory

class CourseApiQueryRepositoryImpl(
    private val query: JPAQueryFactory,
    ): CourseApiQueryRepository {
    override fun findBySubInstuctorIdQueryDsl(subInstructorId: Id<User>): List<CourseResult>
        = query
            .select(
                Projections.constructor(
                    CourseResult::class.java,
                    course.id,
                    course.title,
//                    course.subInstructorId,
                    course.subInstructorId.value,
                )
            )
            .from(course)
            .where(course.subInstructorId.eq(subInstructorId))
            .fetch()


}
