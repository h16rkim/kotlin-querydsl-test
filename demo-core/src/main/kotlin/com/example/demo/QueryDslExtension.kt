package com.example.demo

import com.querydsl.core.types.dsl.Expressions
import com.querydsl.core.types.dsl.NumberTemplate
import com.querydsl.core.types.dsl.SimplePath

val <T> SimplePath<Id<T>>.value: NumberTemplate<Long>
    get() = Expressions.numberTemplate(Long::class.java, "{0}", this)
