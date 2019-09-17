package com.example.timeout.api

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping

@Controller
class SampleController {
    @PostMapping("/api/tag/get-trend-list")
    fun delay(): ResponseEntity<Any> {
        Thread.sleep(2000000)
        return ResponseEntity.ok("success")
    }

    @PostMapping("/api/user-follow/get-following-user-list")
    fun html(): String {
        return "index"
    }
}