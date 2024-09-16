package com.example.csvgen.repositories

import com.example.csvgen.models.Template
import org.springframework.data.jpa.repository.JpaRepository

interface TemplateRepository : JpaRepository<Template, Long>
