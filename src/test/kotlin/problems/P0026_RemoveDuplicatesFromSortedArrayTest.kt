package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0026_RemoveDuplicatesFromSortedArrayTest {

    @Test
    fun removeDuplicates() {
        val removeDupFromSortedArr = P0026_RemoveDuplicatesFromSortedArray()
        val testNums1 = intArrayOf(1, 1, 2)
        assertEquals(2, removeDupFromSortedArr.removeDuplicates(testNums1))
        assertEquals(1, testNums1[0])
        assertEquals(2, testNums1[1])

        val testNums2 = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        assertEquals(5, removeDupFromSortedArr.removeDuplicates(testNums2))
        assertEquals(0, testNums2[0])
        assertEquals(1, testNums2[1])
        assertEquals(2, testNums2[2])
        assertEquals(3, testNums2[3])
        assertEquals(4, testNums2[4])
    }
}
