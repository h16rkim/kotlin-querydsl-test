package com.example.demo.domain.user

import com.example.demo.Id
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Table

@Entity
@Table(name = "users")
class User(
    id: Id<User>,
    name: String
) {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Id<User> = id
        protected set

    @Column(name = "name")
    var name: String = name
}
