package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0035_SearchInsertPositionTest {

    @Test
    fun testSearchInsert() {
        val searchInsertPosition = P0035_SearchInsertPosition()
        assertEquals(2, searchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 5))
        assertEquals(1, searchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 2))
        assertEquals(4, searchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 7))
        assertEquals(0, searchInsertPosition.searchInsert(intArrayOf(1, 3, 5, 6), 0))
    }
}
