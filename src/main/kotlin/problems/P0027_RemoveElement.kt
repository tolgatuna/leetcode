package problems

class P0027_RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var length = 0
        for (num in nums) {
            if (num != `val`) {
                nums[length++] = num
            }
        }
        return length
    }
}
