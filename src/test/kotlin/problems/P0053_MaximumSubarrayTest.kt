package problems

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class P0053_MaximumSubarrayTest {

    @Test
    fun testMaxSubArray() {
        val maximumSubarray = P0053_MaximumSubarray()
        assertEquals(6, maximumSubarray.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        assertEquals(1, maximumSubarray.maxSubArray(intArrayOf(1)))
        assertEquals(0, maximumSubarray.maxSubArray(intArrayOf(0)))
        assertEquals(-1, maximumSubarray.maxSubArray(intArrayOf(-1)))
        assertEquals(-2147483647, maximumSubarray.maxSubArray(intArrayOf(-2147483647)))
    }
}
