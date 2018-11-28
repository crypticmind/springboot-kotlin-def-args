package com.example

import org.hamcrest.Matchers.containsString
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.reactive.server.WebTestClient

@RunWith(SpringRunner::class)
@WebFluxTest
class ControllerTest {

    @Autowired
    private lateinit var webTestClient: WebTestClient

    @Test
    fun `test scalar param with default kotlin value`() {
        webTestClient.get().uri("/test-kotlin-default")
            .exchange()
            .expectStatus().isOk
            .expectBody(String::class.java).value<Nothing>(containsString("Hi, stranger"))
    }

    @Test
    fun `test scalar param with default annotated value`() {
        webTestClient.get().uri("/test-param-default")
            .exchange()
            .expectStatus().isOk
            .expectBody(String::class.java).value<Nothing>(containsString("Hi, stranger"))
    }

    @Test
    fun `test list param with default kotlin value`() {
        webTestClient.get().uri("/count-kotlin-default")
            .exchange()
            .expectStatus().isOk
            .expectBody(String::class.java).value<Nothing>(containsString("There are 0 elements"))
    }

    @Test
    fun `test list param with default annotated value`() {
        webTestClient.get().uri("/count-param-default")
            .exchange()
            .expectStatus().isOk
            .expectBody(String::class.java).value<Nothing>(containsString("There are 0 elements"))
    }
}
