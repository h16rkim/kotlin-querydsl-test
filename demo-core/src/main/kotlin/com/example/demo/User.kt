package com.example.demo

import jakarta.persistence.*
import jakarta.persistence.Id as JpaId

@Entity
@Table(name = "users")
class User(
    id: Id<User>,
    name: String
) {
    @JpaId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Id<User> = id
        protected set

    @Column(name = "name")
    var name: String = name
}
