package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0028_ImplementStrStrTest {

    @Test
    fun strStr() {
        val strStr = P0028_ImplementStrStr()
        assertEquals(2, strStr.strStr("hello", "ll"))
        assertEquals(-1, strStr.strStr("aaaaa", "bba"))
        assertEquals(0, strStr.strStr("asdasdas", ""))
        assertEquals(0, strStr.strStr("abcdfghjklm", "abcdfghjklm"))
        assertEquals(-1, strStr.strStr("abcdfghjklm", "abcdfghjklmxx"))
        assertEquals(4, strStr.strStr("abcdfghjklm", "fghjklm"))
    }
}
