package problems

class P0014_LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }
        var longestCommonPrefix = strs[0]
        for (index in 1 until strs.size) {
            longestCommonPrefix = findLongestCommonPrefixForTwoStr(longestCommonPrefix, strs[index])
            if (longestCommonPrefix == "") {
                return longestCommonPrefix
            }
        }
        return longestCommonPrefix
    }

    private fun findLongestCommonPrefixForTwoStr(s1: String, s2: String): String {
        var longestCommonPrefix = ""
        val length = if (s1.length > s2.length) {
            s2.length
        } else {
            s1.length
        }
        for (i in 0 until length) {
            if (s1[i] == s2[i]) {
                longestCommonPrefix += s1[i]
            } else {
                break
            }
        }
        return longestCommonPrefix
    }
}
