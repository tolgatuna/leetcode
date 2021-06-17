package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0008_StringToIntegerTest {

    @Test
    fun myAtoi() {
        val stringToInt = P0008_StringToInteger()
        assertEquals(42, stringToInt.myAtoi("42"))
        assertEquals(1, stringToInt.myAtoi("+1"))
        assertEquals(4193, stringToInt.myAtoi("4193 with words"))
        assertEquals(0, stringToInt.myAtoi("words and 987"))
        assertEquals(-42, stringToInt.myAtoi("   -42"))
        assertEquals(Int.MAX_VALUE, stringToInt.myAtoi("12312321321321312321321"))
        assertEquals(Int.MIN_VALUE, stringToInt.myAtoi("-12312321321321312321321"))
        assertEquals(Int.MAX_VALUE, stringToInt.myAtoi("9223372036854775808"))
    }
}
