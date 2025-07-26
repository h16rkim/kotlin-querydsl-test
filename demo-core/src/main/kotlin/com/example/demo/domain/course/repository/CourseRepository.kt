package com.example.demo.domain.course.repository

import com.example.demo.domain.course.Course
import org.springframework.data.jpa.repository.JpaRepository

interface CourseRepository: JpaRepository<Course, Long>
