package com.kata

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class HelloWorldTest {

    @Test fun greeting() {
        assertEquals("Hello World it's 2020-01-01T00:00:00Z", HelloWorld().greeting())
    }
}