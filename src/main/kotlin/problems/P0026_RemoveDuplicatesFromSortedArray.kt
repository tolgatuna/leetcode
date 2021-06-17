package problems

class P0026_RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var lastIndex = 0
        var lastValue = if(nums.isEmpty()) 0 else nums[0]
        for (index in 1..nums.size) {
            if (index == nums.size) {
                nums[lastIndex] = lastValue
                lastIndex++
            } else if (lastValue == nums[index]) {
                continue
            } else {
                nums[lastIndex] = lastValue
                lastValue = nums[index]
                lastIndex++
            }
        }
        return lastIndex
    }
}
