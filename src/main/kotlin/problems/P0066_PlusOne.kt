package problems

class P0066_PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        //TODO
        if (digits.isEmpty()) {
            return intArrayOf(1)
        }
        val lastVal = digits[digits.lastIndex] + 1
        val lastValEqualsTen = lastVal == 10
        digits[digits.lastIndex] = if (lastValEqualsTen) 0 else lastVal
        if (lastValEqualsTen) {
            plusOne(digits.toList().slice(0 until digits.lastIndex).toIntArray())
        }
        return digits
    }
}
