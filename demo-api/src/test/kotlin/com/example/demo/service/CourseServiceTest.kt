package com.example.demo.service

import com.example.demo.Id
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class CourseServiceTest(
    private val courseService: CourseService,
) {
    @Nested
    inner class FindByJpaRepository {
        @DisplayName("JPA Repository")
        @Test
        fun findByJpaRepository() {
           courseService.findByJpaRepository(Id(1))
        }

    }

    @Nested
    inner class FindByQueryDslRepository {

        @DisplayName("QueryDSL Repository")
        @Test
        fun findByQueryDslRepository() {
            courseService.findByQueryDsl(Id(1))
        }
    }


}
