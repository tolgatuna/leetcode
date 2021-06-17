package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0003_LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    fun lengthOfLongestSubstring() {
        val longestSubLength = P0003_LongestSubstringWithoutRepeatingCharacters()
        assertEquals(1, longestSubLength.lengthOfLongestSubstring("bbbbb"))
        assertEquals(3, longestSubLength.lengthOfLongestSubstring("abcabcbb"))
        assertEquals(1, longestSubLength.lengthOfLongestSubstring(" "))
        assertEquals(2, longestSubLength.lengthOfLongestSubstring("au"))
    }
}
