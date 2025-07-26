package com.example.demo.repository.dto

import com.example.demo.Id
import com.example.demo.domain.user.User


class CourseResult(
    val id: Long,
    val title: String,

    /**
     * No constructor found for class com.example.demo.repository.dto.CourseResult with parameters: [class java.lang.Long, class java.lang.String, class com.example.demo.Id]
     *
     * 런타임에는 subInstructorId 가 Long 이지만, Id<User> 타입으로 선언되어 있어서 에러 발생
     */

    val subInstructorId: Id<User>?


    /**
     * Caused by: java.lang.ClassCastException: Cannot cast com.example.demo.Id to java.lang.Long
     * 	at java.base/java.lang.Class.cast(Class.java:4067)
     * 	at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
     * 	... 58 more
     *
     *
     * argument type mismatch
     */
    // val subInstructorId: Long?,


)
