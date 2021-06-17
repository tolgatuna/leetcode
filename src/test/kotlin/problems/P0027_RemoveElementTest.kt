package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0027_RemoveElementTest {

    @Test
    fun testRemoveElement() {
        val removeElement = P0027_RemoveElement()
        val nums = intArrayOf(3, 2, 2, 3)
        assertEquals(2, removeElement.removeElement(nums, 3))
        assertEquals(2, nums[0])
        assertEquals(2, nums[1])
    }

    @Test
    fun testRemoveElementForLongArray() {
        val removeElement = P0027_RemoveElement()
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        assertEquals(5, removeElement.removeElement(nums, 2))
        assertEquals(0, nums[0])
        assertEquals(1, nums[1])
        assertEquals(3, nums[2])
        assertEquals(0, nums[3])
        assertEquals(4, nums[4])
    }
}
