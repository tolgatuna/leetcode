package problems

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class P0038_CountAndSayTest {

    @Test
    fun countAndSay() {
        val countAndSay = P0038_CountAndSay()

        assertEquals("1", countAndSay.countAndSay(1))
        assertEquals("1211", countAndSay.countAndSay(4))
        assertEquals("111221", countAndSay.countAndSay(5))
    }
}
