package com.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.reactive.config.EnableWebFlux

fun main(args: Array<String>) {
    SpringApplication(Application::class.java).run(*args)
}

@SpringBootApplication
@EnableWebFlux
class Application
