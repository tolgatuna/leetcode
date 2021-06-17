package problems

import helper.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class P0002_AddTwoNumbersTest {

    @Test
    fun addTwoNumbers() {
        val l1 = ListNode(2)
        l1.next = ListNode(4)
        l1.next!!.next = ListNode(3)

        val l2 = ListNode(5)
        l2.next = ListNode(6)
        l2.next!!.next = ListNode(4)

        val solution = P0002_AddTwoNumbers()
        val twoNumbers = solution.addTwoNumbers(l1, l2)
        assertEquals(7, twoNumbers?.`val` ?: -1)
        assertEquals(0, twoNumbers?.next?.`val` ?: -1)
        assertEquals(8, twoNumbers?.next?.next?.`val` ?: -1)
        assertNull(twoNumbers?.next?.next?.next)
    }

    @Test
    internal fun addTwoNumbersAsZero() {
        val l1 = ListNode(5)
        val l2 = ListNode(5)
        val solution = P0002_AddTwoNumbers()
        val twoNumbers = solution.addTwoNumbers(l1, l2)
        assertEquals(0, twoNumbers?.`val` ?: -1)
        assertEquals(1, twoNumbers?.next?.`val` ?: -1)
    }
}
