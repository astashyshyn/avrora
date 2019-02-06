package com.example.avrora.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono


@RestController
class PersonController {

    @GetMapping("/")
    internal fun index(): Mono<String> {
        if (1 > 0) {
            throw RuntimeException("AAAAAAAAAAAAAA")
        }
        return Mono.just("Hello world")
    }
}