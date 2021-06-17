package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0029_DivideTwoIntegersKtTest {
    @Test
    fun testDivide() {
        assertEquals(3, divide(dividend = 10, divisor = 3))
        assertEquals(-2, divide(dividend = 7, divisor = -3))
        assertEquals(2, divide(dividend = -7, divisor = -3))
        assertEquals(-2, divide(dividend = -7, divisor = 3))
        assertEquals(Int.MAX_VALUE, divide(dividend = -2147483648, divisor = -1))
        assertEquals(1073741823, divide(dividend = 2147483647, divisor = 2))
    }
}
