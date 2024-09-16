package com.example.csvgen.services

import com.example.csvgen.models.Template
import com.example.csvgen.repositories.TemplateRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class TemplateService(private val templateRepository: TemplateRepository) {
    fun getAllTemplates(): List<Template> {
        return templateRepository.findAll()
    }
}
