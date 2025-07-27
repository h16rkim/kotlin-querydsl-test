package com.example.demo.domain

@JvmInline
value class SimpleId(
    val value: Long,
) {
    override fun toString(): String = value.toString()
}
