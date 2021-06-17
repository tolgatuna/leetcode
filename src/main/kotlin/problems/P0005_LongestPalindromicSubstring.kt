package problems

class P0005_LongestPalindromicSubstring {
    fun longestPalindrome(s: String): String {
        var longPalindrome = if (s.isNotEmpty()) s[0].toString() else ""
        val length = s.length

        for (index in 0 until length - 1) {
            if (s[index] == s[index + 1]) {
                val foundString = findLongestPalindromeString(s, index, true)
                longPalindrome = findLongest(foundString, longPalindrome)
            }
            if (index + 2 < length && s[index] == s[index + 2]) {
                val foundString = findLongestPalindromeString(s, index + 1, false)
                longPalindrome = findLongest(foundString, longPalindrome)
            }
        }

        return longPalindrome
    }

    private fun findLongestPalindromeString(s: String, index: Int, doubleVal: Boolean): String {
        var startIndex = index
        var endIndex = if (doubleVal) index + 1 else index
        while (true) {
            if (startIndex >= 1 && endIndex + 1 < s.length && s[startIndex - 1] == s[endIndex + 1]) {
                startIndex--
                endIndex++
            } else {
                break
            }
        }
        return s.substring(startIndex, endIndex + 1)
    }

    private fun findLongest(str1: String, str2: String) =
        if (str1.length > str2.length)
            str1
        else
            str2
}
