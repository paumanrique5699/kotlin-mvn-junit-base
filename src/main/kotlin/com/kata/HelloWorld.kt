package com.kata

import kotlinx.datetime.Instant

class HelloWorld {
    fun greeting(): String {
        val instant = Instant.parse("2020-01-01T00:00:00Z")
        return "Hello World it's $instant"
    }
}