package com.example.demo.domain.course.dto

import com.example.demo.domain.SimpleId
import com.querydsl.core.annotations.QueryProjection

data class CourseResult @QueryProjection() constructor(
    val id: Long,
    val title: String,

    val subInstructorId: SimpleId?
)
