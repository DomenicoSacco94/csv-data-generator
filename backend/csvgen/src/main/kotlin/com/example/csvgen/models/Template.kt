package com.example.csvgen.models

import jakarta.persistence.*

@Entity
@Table(name = "templates")
data class Template(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(nullable = false)
    val name: String,
    val description: String? = null,
)
