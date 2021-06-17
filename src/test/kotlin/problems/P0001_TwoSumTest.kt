package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0001_TwoSumTest {

    @Test
    fun twoSum() {
        val twoSum = P0001_TwoSum().twoSum(
            nums = intArrayOf(2, 7, 11, 15),
            target = 9
        )
        assertArrayEquals(intArrayOf(0, 1), twoSum)
    }

    @Test
    fun twoSum2() {
        val twoSum = P0001_TwoSum().twoSum(
            nums = intArrayOf(3, 2, 4),
            target = 6
        )
        assertArrayEquals(intArrayOf(1, 2), twoSum)
    }
}
