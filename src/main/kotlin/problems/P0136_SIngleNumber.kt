package problems

class P0136_SIngleNumber {
    fun singleNumber(nums: IntArray): Int {
        var mapOfNums = nums.map { it to 0 }.toMap().toMutableMap()
        for (num in nums) {
            mapOfNums[num] = mapOfNums[num]!! + 1
        }
        return mapOfNums.filterValues { it == 1 }.keys.first()
    }
}
