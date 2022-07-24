package com.hotreload.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MvnApplication

fun main(args: Array<String>) {
    runApplication<MvnApplication>(*args)
}
