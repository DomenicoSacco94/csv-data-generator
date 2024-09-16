package com.example.csvgen.controllers

import com.example.csvgen.models.Template
import com.example.csvgen.services.TemplateService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/templates")
class TemplateController(private val templateService: TemplateService) {
    @GetMapping
    fun getAllTemplates(): ResponseEntity<List<Template>> {
        val templates = templateService.getAllTemplates()
        return ResponseEntity.ok(templates)
    }
}
