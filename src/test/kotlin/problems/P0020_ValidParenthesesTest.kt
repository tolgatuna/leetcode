package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0020_ValidParenthesesTest {

    @Test
    fun isValid() {
        val validParentheses = P0020_ValidParentheses()
        assertEquals(true, validParentheses.isValid("()"))
        assertEquals(true, validParentheses.isValid("()[]{}"))
        assertEquals(false, validParentheses.isValid("(]"))
        assertEquals(false, validParentheses.isValid("([)]"))
        assertEquals(true, validParentheses.isValid("{[]}"))
        assertEquals(false, validParentheses.isValid("]"))
    }
}
