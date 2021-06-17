package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class P1480_RunningSumOf1dArrayTest {

    @Test
    internal fun example1() {
        val runningSum = P1480_RunningSumOf1dArray().runningSum(intArrayOf(1, 2, 3, 4))
        assertArrayEquals(runningSum, intArrayOf(1, 3, 6, 10))
    }

    @Test
    internal fun example2() {
        val runningSum = P1480_RunningSumOf1dArray().runningSum(intArrayOf(1, 1, 1, 1, 1))
        assertArrayEquals(runningSum, intArrayOf(1, 2, 3, 4, 5))
    }

    @Test
    internal fun example3() {
        val runningSum = P1480_RunningSumOf1dArray().runningSum(intArrayOf(3, 1, 2, 10, 1))
        assertArrayEquals(runningSum, intArrayOf(3, 4, 6, 16, 17))
    }

}
