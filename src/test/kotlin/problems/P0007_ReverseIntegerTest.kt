package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0007_ReverseIntegerTest {

    @Test
    fun reverse() {
        val reverseFun = P0007_ReverseInteger()
        assertEquals(321, reverseFun.reverse(123))
        assertEquals(-321, reverseFun.reverse(-123))
        assertEquals(21, reverseFun.reverse(120))
        assertEquals(0, reverseFun.reverse(1534236469))
    }
}
