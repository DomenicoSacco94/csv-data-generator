package com.example.csvgen.repositories

import com.example.csvgen.models.TemplateColumn
import org.springframework.data.jpa.repository.JpaRepository

interface TemplateColumnRepository : JpaRepository<TemplateColumn, Long> {
    fun findByTemplateId(templateId: Long): List<TemplateColumn>
}