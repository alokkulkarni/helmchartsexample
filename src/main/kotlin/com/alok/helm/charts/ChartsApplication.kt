package com.alok.helm.charts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class ChartsApplication

fun main(args: Array<String>) {
	runApplication<ChartsApplication>(*args)
}

@RestController
@RequestMapping("/api/v1")
class ChartsController {

	@GetMapping("/hello")
	fun hello(): String {
		return "Hello World"
	}
}
