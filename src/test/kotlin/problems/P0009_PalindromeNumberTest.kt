package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0009_PalindromeNumberTest {

    @Test
    fun isPalindrome() {
        val palindrome = P0009_PalindromeNumber()
        assertEquals(true, palindrome.isPalindrome(121))
        assertEquals(false, palindrome.isPalindrome(-121))
        assertEquals(false, palindrome.isPalindrome(10))
    }
}
