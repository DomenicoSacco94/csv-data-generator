package com.example.csvgen

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CsvgenApplication

fun main(args: Array<String>) {
	runApplication<CsvgenApplication>(*args)
}
