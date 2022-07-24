package com.hotreload.api

import com.hotreload.lib.SayHello
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingController {
    @GetMapping("/ping")
    fun ping(): String {
        return SayHello().hello()
    }
}
