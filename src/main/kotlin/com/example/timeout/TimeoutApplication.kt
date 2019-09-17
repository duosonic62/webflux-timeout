package com.example.timeout

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TimeoutApplication

fun main(args: Array<String>) {
	runApplication<TimeoutApplication>(*args)
}
