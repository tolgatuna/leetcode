package problems

class P0028_ImplementStrStr {
    fun strStr(haystack: String, needle: String): Int {
        return when {
            needle.isEmpty() -> 0
            needle.isNotEmpty() && haystack.isNotEmpty() -> {
                val needleLength = needle.length
                val haystackLength = haystack.length
                if (needleLength > haystackLength) return -1

                for (index in haystack.indices) {
                    if (haystack[index] == needle[0]) {
                        if (index + needleLength > haystackLength) return -1
                        if (haystack.substring(index, index + needleLength) == needle) return index
                    }
                }
                return -1
            }

            else -> -1
        }
    }
}
