package com.example.csvgen.controllers

import com.example.csvgen.models.TemplateColumn
import com.example.csvgen.services.TemplateColumnService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/template-columns")
class TemplateColumnController(private val templateColumnService: TemplateColumnService) {
    @GetMapping
    fun getAllTemplateColumns(): ResponseEntity<List<TemplateColumn>> {
        val templates = templateColumnService.getAllTemplateColumns()
        return ResponseEntity.ok(templates)
    }
}
