package problems

import helper.ListNode
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P0021_MergeTwoSortedListTest {

    @Test
    fun mergeTwoLists() {
        val listNode1 = ListNode(1)
        listNode1.next = ListNode(2)
        listNode1.next?.next = ListNode(4)

        val listNode2 = ListNode(1)
        listNode2.next = ListNode(3)
        listNode2.next?.next = ListNode(4)

        val merged = P0021_MergeTwoSortedList().mergeTwoLists(listNode1, listNode2)

        assertEquals(1, merged?.`val` ?: 0)
        assertEquals(1, merged?.next?.`val` ?: 0)
        assertEquals(2, merged?.next?.next?.`val` ?: 0)
        assertEquals(3, merged?.next?.next?.next?.`val` ?: 0)
        assertEquals(4, merged?.next?.next?.next?.next?.`val` ?: 0)
        assertEquals(4, merged?.next?.next?.next?.next?.next?.`val` ?: 0)
    }
}
