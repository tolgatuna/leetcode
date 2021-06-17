package problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0058_LengthOfLastWordTest {

    @Test
    fun lengthOfLastWord() {
        val solution = P0058_LengthOfLastWord()
//        assertEquals(5, solution.lengthOfLastWord("Hello World"))
//        assertEquals(1, solution.lengthOfLastWord("a "))
        assertEquals(1, solution.lengthOfLastWord("b a "))

    }
}
