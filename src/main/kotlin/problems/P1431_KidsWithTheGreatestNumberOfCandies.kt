package problems

class P1431_KidsWithTheGreatestNumberOfCandies {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
        val maxOrNull = candies.maxOrNull()!!
        return candies.map {
            extraCandies + it >= maxOrNull
        }.toBooleanArray()
    }
}
