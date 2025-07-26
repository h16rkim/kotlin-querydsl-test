package com.example.demo

import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

@Converter
class IdConverter : AttributeConverter<Id<*>?, Long?> {
    override fun convertToDatabaseColumn(attribute: Id<*>?): Long? = attribute?.value

    override fun convertToEntityAttribute(dbData: Long?): Id<*>? = dbData?.let { Id<Any>(it) }
}
