package com.example.demo

@JvmInline
value class Id<out T>(
    val value: Long,
) {
    override fun toString(): String = value.toString()
}