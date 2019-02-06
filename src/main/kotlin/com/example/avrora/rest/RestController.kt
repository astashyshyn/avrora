package com.example.avrora.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono


@RestController
class PersonController {

    @GetMapping("/")
    internal fun index(): Mono<String> {
        return Mono.just("Hello world")
    }
}