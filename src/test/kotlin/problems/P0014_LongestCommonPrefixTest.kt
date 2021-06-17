package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class P0014_LongestCommonPrefixTest {
    @Test
    internal fun longestCommonPrefixTest() {
        val longestCommonPrefix = P0014_LongestCommonPrefix()
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(arrayOf("flower", "flow", "flight")))
        assertEquals("", longestCommonPrefix.longestCommonPrefix(arrayOf("dog", "racecar", "car")))
    }
}
