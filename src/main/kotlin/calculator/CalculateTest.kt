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
    @Test
    fun subtractInt(){
        val expected = 2
        val actual = calculate.subtract(4, 2)
        assertEquals(expected, actual)
    }
    @Test
    fun subtractDouble(){
        val expected = 2.5
        val actual = calculate.subtract(4.0, 1.5)
        assertEquals(expected, actual)
    }
    @Test
    fun divisionInt(){
        val expected = 10
        val actual = calculate.division(20, 2)
        assertEquals(expected, actual)
    }
    @Test
    fun divisionDouble(){
        val expected = 2.5
        val actual = calculate.division(5.0, 2.0)
        assertEquals(expected, actual)
    } @Test
    fun multiplicationInt(){
        val expected = 10
        val actual = calculate.multiplication(5, 2)
        assertEquals(expected, actual)
    } @Test
    fun multiplicationDouble(){
        val expected = 21.6
        val actual = calculate.multiplication(7.2, 3.0)
        assertEquals(expected, actual)
    }
}