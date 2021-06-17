package problems

class P1470_ShuffleTheArray {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val shuffled = IntArray(nums.size)
        var count = 0

        for (i in 0 until n) {
            for (j in i until nums.size step n) {
                shuffled[count++] = nums[j]
            }
        }
        return shuffled
    }
}


