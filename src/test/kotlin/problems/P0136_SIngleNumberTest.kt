package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0136_SIngleNumberTest {

    @Test
    fun singleNumber() {
        val singleNumber = P0136_SIngleNumber()
        assertEquals(1, singleNumber.singleNumber(intArrayOf(2, 2, 1)))
        assertEquals(4, singleNumber.singleNumber(intArrayOf(4, 1, 2, 1, 2)))
    }
}
