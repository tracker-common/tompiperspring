package com.pivotaltracker.tomandpiper

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TomandpiperApplication

fun main(args: Array<String>) {
    runApplication<TomandpiperApplication>(*args)
}

