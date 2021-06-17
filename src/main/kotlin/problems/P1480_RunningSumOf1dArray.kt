package problems

class P1480_RunningSumOf1dArray {
    fun runningSum(nums: IntArray): IntArray {
        var sum = 0
        return nums.map {
            sum += it
            sum
        }.toIntArray()
    }
}
