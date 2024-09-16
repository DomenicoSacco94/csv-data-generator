package com.example.csvgen.services

import com.example.csvgen.models.TemplateColumn
import com.example.csvgen.repositories.TemplateColumnRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
@Transactional
class TemplateColumnService(private val templateColumnRepository: TemplateColumnRepository) {
    fun getAllTemplateColumns(): List<TemplateColumn> {
        return templateColumnRepository.findAll()
    }
}
