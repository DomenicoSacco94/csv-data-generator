package com.example.csvgen.models

import jakarta.persistence.*

@Entity
@Table(name = "template_columns")
data class TemplateColumn(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "template_id", nullable = false)
    val template: Template,
    @Column(name = "column_name", nullable = false)
    val columnName: String,
    @Column(name = "data_type", nullable = false)
    val dataType: String,
    @Column(name = "position", nullable = false)
    val position: Int,
)
