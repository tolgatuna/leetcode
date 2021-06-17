package problems

import kotlin.math.max

class P0003_LongestSubstringWithoutRepeatingCharacters {
    // Solution - 1:
//    fun lengthOfLongestSubstring(s: String): Int {
//        val charSet = mutableSetOf<Char>()
//        var length = if (s.length < 2) s.length else 0
//        for (index in s.indices) {
//            charSet.add(s[index])
//            for (indexForSub in index + 1 until s.length) {
//                if (charSet.contains(s[indexForSub])) {
//                    length = max(length, charSet.size)
//                    charSet.clear()
//                    break
//                } else {
//                    charSet.add(s[indexForSub])
//                    length = max(length, charSet.size)
//                }
//            }
//            if (length == s.length) {
//                return length
//            }
//        }
//        return length
//    }

    // Solution - 2:
    fun lengthOfLongestSubstring(s: String): Int {
        val charSet = mutableSetOf<Char>()
        var answer = 0
        var firstIndex = 0
        var lastIndex = 0
        val length = s.length

        while (firstIndex < length && lastIndex < length) {
            if (!charSet.contains(s[lastIndex])) {
                charSet.add(s[lastIndex++])
                answer = max(answer, lastIndex - firstIndex)
            } else {
                charSet.remove(s[firstIndex++])
            }
        }
        return answer
    }
}
