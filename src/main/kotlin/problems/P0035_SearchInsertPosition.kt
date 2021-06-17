package problems

class P0035_SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var min = 0
        var max = nums.size - 1
        var mid: Int

        while (min <= max) {
            mid = (max + min) / 2
            when {
                nums[mid] == target -> return mid
                nums[mid] > target -> max = mid - 1
                else -> min = mid + 1
            }
        }

        return min
    }
}
