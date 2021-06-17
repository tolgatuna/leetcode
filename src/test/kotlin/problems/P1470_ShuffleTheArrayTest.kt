package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P1470_ShuffleTheArrayTest {

    @Test
    fun example1() {
        val shuffled = P1470_ShuffleTheArray().shuffle(
            nums = intArrayOf(2, 5, 1, 3, 4, 7),
            n = 3
        )
        assertArrayEquals(intArrayOf(2, 3, 5, 4, 1, 7), shuffled)
    }

    @Test
    fun example2() {
        val shuffled = P1470_ShuffleTheArray().shuffle(
            nums = intArrayOf(1, 2, 3, 4, 4, 3, 2, 1),
            n = 4
        )
        assertArrayEquals(intArrayOf(1, 4, 2, 3, 3, 2, 4, 1), shuffled)
    }

    @Test
    fun example3() {
        val shuffled = P1470_ShuffleTheArray().shuffle(
            nums = intArrayOf(1, 1, 2, 2),
            n = 2
        )
        assertArrayEquals(intArrayOf(1, 2, 1, 2), shuffled)
    }
}
