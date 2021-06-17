package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0004_MedianOfTwoSortedArraysTest {

    @Test
    fun findMedianSortedArrays() {
        val median = P0004_MedianOfTwoSortedArrays()
        assertEquals(2.00, median.findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)))
        assertEquals(2.50, median.findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 4)))
    }
}
