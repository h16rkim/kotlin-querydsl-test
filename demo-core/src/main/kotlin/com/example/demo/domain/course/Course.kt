package com.example.demo.domain.course

import com.example.demo.Id
import com.example.demo.IdConverter
import com.example.demo.domain.user.User
import jakarta.persistence.Column
import jakarta.persistence.Convert
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Table

@Entity
@Table(name = "course")
class Course(
    id: Id<Course>,
    title: String,
    instructorId: Id<User>,
    subInstructorId: Id<User>? = null,
) {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Id<Course> = id
        protected set

    @Column(name = "instructor_id")
    var instructorId: Id<User> = instructorId
        protected set

    @Column(name = "sub_instructor_id")
    @Convert(converter = IdConverter::class)
    var subInstructorId: Id<User>? = subInstructorId
        protected set


    @Column(name = "title")
    var title: String = title
}
