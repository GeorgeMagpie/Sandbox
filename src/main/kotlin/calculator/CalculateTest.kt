package calculator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculateTest {
    private val calculate: Calculate = Calculate()


    @Test
    fun sumDouble(){
        val expected = 4.0
        val actual = calculate.sum(3.0, 1.0)
        assertEquals(expected, actual)
    }
    @Test
    fun sumInt(){
        val expected = 6
        val actual = calculate.sum(4, 2)
        assertEquals(expected, actual)
    }
}