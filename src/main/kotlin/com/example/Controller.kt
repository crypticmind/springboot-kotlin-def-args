package com.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class Controller {

    @GetMapping("test-kotlin-default")
    fun greetKotlinDefault(@RequestParam(required = false) name: String? = "stranger") =
        "Hi, $name"

    @GetMapping("test-param-default")
    fun greetParamDefault(@RequestParam(defaultValue = "stranger") name: String?) =
        "Hi, $name"

    @GetMapping("count-kotlin-default")
    fun countKotlinDefault(@RequestParam(required = false) items: List<String>? = emptyList()) =
        "There are ${items?.size} elements"

    @GetMapping("count-param-default")
    fun countParamDefault(@RequestParam(defaultValue = "") items: List<String>?) =
        "There are ${items?.size} elements"
}
