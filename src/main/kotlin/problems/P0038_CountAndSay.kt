package problems

class P0038_CountAndSay {
    private val cacheMap = mutableMapOf(
        1 to "1"
    )

    fun countAndSay(n: Int): String {
        return if (cacheMap.contains(n)) {
            cacheMap[n]!!
        } else {
            val lastValue = countAndSay(n - 1)
            val calculated = calculateCountAndSay(lastValue)
            cacheMap[n] = calculated
            calculated
        }
    }

    private fun calculateCountAndSay(value: String): String {
        var newValue = ""
        var count = 1
        var index = 0
        while (index < value.length) {
            if (index + 1 < value.length && value[index] == value[index + 1]) {
                count++
            } else {
                newValue += count.toString() + value[index]
                count = 1
            }
            index++
        }
        return newValue
    }
}
