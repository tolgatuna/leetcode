package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P1431_KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    fun example1() {
        val kidsWithCandies = P1431_KidsWithTheGreatestNumberOfCandies()
            .kidsWithCandies(
                candies = intArrayOf(2, 3, 5, 1, 3),
                extraCandies = 3
            )
        assertArrayEquals(booleanArrayOf(true, true, true, false, true), kidsWithCandies)
    }

    @Test
    fun example2() {
        val kidsWithCandies = P1431_KidsWithTheGreatestNumberOfCandies()
            .kidsWithCandies(
                candies = intArrayOf(4, 2, 1, 1, 2),
                extraCandies = 1
            )
        assertArrayEquals(booleanArrayOf(true, false, false, false, false), kidsWithCandies)
    }

    @Test
    fun example3() {
        val kidsWithCandies = P1431_KidsWithTheGreatestNumberOfCandies()
            .kidsWithCandies(
                candies = intArrayOf(12, 1, 12),
                extraCandies = 10
            )
        assertArrayEquals(booleanArrayOf(true, false, true), kidsWithCandies)
    }
}
