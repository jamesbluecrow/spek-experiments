package com.trov.spekexperiments

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertEquals
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class CalculatorSpekTest : Spek({
    val a = 2
    val b = 3

    given("a = $a and b = $b") {
        val sum = Calculator().sum(a, b)

        it("should be that x + y = 5") {
            assertEquals(5, sum)
        }
    }
})
