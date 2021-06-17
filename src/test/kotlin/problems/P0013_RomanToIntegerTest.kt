package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0013_RomanToIntegerTest {

    @Test
    fun romanToInt() {
        val romanToInteger = P0013_RomanToInteger()
        assertEquals(3, romanToInteger.romanToInt("III"))
        assertEquals(4, romanToInteger.romanToInt("IV"))
        assertEquals(9, romanToInteger.romanToInt("IX"))
        assertEquals(58, romanToInteger.romanToInt("LVIII"))
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"))

    }
}
