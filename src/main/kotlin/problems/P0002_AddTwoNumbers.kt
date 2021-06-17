package problems

import helper.ListNode

class P0002_AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var head: ListNode? = ListNode(0)
        var node: ListNode? = head
        var extraNum = false
        var node1 = l1
        var node2 = l2

        while (true) {
            var sum = if (extraNum) 1 else 0
            extraNum = false

            sum += (node1?.`val` ?: 0) + (node2?.`val` ?: 0)
            if (sum >= 10) {
                sum -= 10
                extraNum = true
            }
            node?.`val` = sum
            node1 = node1?.next
            node2 = node2?.next

            if (node1 != null || node2 != null || extraNum) {
                node?.next = ListNode(0)
                node = node?.next
            } else {
                break
            }
        }

        return head
    }
}
