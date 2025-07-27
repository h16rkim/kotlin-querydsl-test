package com.example.demo.service

import com.example.demo.Id
import com.example.demo.domain.course.Course
import com.example.demo.domain.user.User
import com.example.demo.repository.CourseApiRepository
import org.springframework.stereotype.Service

@Service
class CourseService(
    private val courseApiRepository: CourseApiRepository,
) {
    fun findByJpaRepository(subInstructorId: Id<User>): List<Course> {

        /**
         * findBySubInstructorId-O1HwSwE(long) : java.util.List
         *
         * 런타임에서는 long 타입으로 파라미터가 들어오는데, Entity 파일에는 Id<Course> 타입으로 인식되어 에러 발생
         *
         * Argument [3] of type [java.lang.Long] did not match parameter type [com.example.demo.Id (n/a)]
         * org.hibernate.query.QueryArgumentException: Argument [3] of type [java.lang.Long] did not match parameter type [com.example.demo.Id (n/a)]
         * 	at app//org.hibernate.query.spi.QueryParameterBindingValidator.validate(QueryParameterBindingValidator.java:85)
         * 	at app//org.hibernate.query.spi.QueryParameterBindingValidator.validate(QueryParameterBindingValidator.java:32)
         * 	at app//org.hibernate.query.internal.QueryParameterBindingImpl.validate(QueryParameterBindingImpl.java:366)
         * 	at app//org.hibernate.query.internal.QueryParameterBindingImpl.setBindValue(QueryParameterBindingImpl.java:142)
         * 	at app//org.hibernate.query.spi.AbstractCommonQueryContract.setParameter(AbstractCommonQueryContract.java:1045)
         * 	at app//org.hibernate.query.spi.AbstractSelectionQuery.setParameter(AbstractSelectionQuery.java:668)
         * 	at app//org.hibernate.query.sqm.internal.QuerySqmImpl.setParameter(QuerySqmImpl.java:1127)
         *
         */
        courseApiRepository::class.java.methods
            .filter { it.name.startsWith("findBySubInstructorId") }
            .forEach {
            println("${it.name}(${it.parameterTypes.joinToString()}) : ${it.returnType.name}")
        }

      return courseApiRepository.findBySubInstructorId(subInstructorId)
    }

    fun findByQueryDsl(subInstructorId: Id<User>) = courseApiRepository.findBySubInstuctorIdQueryDsl(subInstructorId)
}
