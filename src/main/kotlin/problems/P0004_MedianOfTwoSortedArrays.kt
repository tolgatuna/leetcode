package problems

class P0004_MedianOfTwoSortedArrays {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val length = nums1.size + nums2.size
        val i1 = 0
        val i2 = 0
        val merged = intArrayOf(*nums1, *nums2)
        merged.sort()
        if (merged.size % 2 == 0) {
            val mid = merged.size / 2
            return (merged[mid - 1] + merged[mid]).toDouble() / 2
        } else {
            return merged[merged.size / 2].toDouble()
        }
    }
}
