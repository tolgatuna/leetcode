package problems

class P0009_PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        val stringVal = x.toString()
        val reversed = stringVal.reversed()
        return reversed == stringVal
    }
}
