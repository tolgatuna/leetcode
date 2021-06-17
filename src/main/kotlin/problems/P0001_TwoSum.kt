package problems

class P0001_TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numsMap = nums.mapIndexed { index, i -> i to index }.toMap()
        for (i in 0..nums.size) {
            val otherNum = target - nums[i]
            numsMap[otherNum]?.let {
                if (i != it) return intArrayOf(i, it)
            }
        }
        return intArrayOf()
    }
}
