package com.example.demo.repository.dto

import com.example.demo.Id
import com.example.demo.domain.user.User

class CourseResult(
    val id: Long,
    val title: String,
    val subInstructorId: Id<User>?
)
