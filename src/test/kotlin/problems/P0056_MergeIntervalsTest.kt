package problems

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class P0056_MergeIntervalsTest {

    @Test
    fun testMerge() {
        val mergeIntervals = P0056_MergeIntervals()

        val intervals = arrayOf(
            intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)
        )
        assertEquals(
            arrayOf(intArrayOf(1, 6), intArrayOf(8, 100), intArrayOf(15, 18)),
            mergeIntervals.merge(intervals)
        )

        val intervals2 = arrayOf(
            intArrayOf(1, 4), intArrayOf(4, 5)
        )
        assertEquals(
            arrayOf(intArrayOf(1, 5)),
            mergeIntervals.merge(intervals2)
        )

        val intervals3 = arrayOf(
            intArrayOf(1, 4), intArrayOf(1, 4)
        )
        assertEquals(
            arrayOf(intArrayOf(1, 4)),
            mergeIntervals.merge(intervals3)
        )
    }
}
