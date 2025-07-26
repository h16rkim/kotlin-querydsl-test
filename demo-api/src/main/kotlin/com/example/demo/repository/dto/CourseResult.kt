package com.example.demo.repository.dto

import com.example.demo.Id
import com.example.demo.domain.user.User


/**
 * No constructor found for class com.example.demo.repository.dto.CourseResult with parameters: [class java.lang.Long, class java.lang.String, class com.example.demo.Id]
 *
 * 런타임에는 subInstructorId 가 Long 이지만, Id<User> 타입으로 선언되어 있어서 에러 발생
 */
class CourseResult(
    val id: Long,
    val title: String,
    val subInstructorId: Long?,
//    val subInstructorId: Id<User>?
)
