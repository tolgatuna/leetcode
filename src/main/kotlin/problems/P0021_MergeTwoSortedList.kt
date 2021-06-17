package problems

import helper.ListNode

class P0021_MergeTwoSortedList {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var node1 = l1
        var node2 = l2
        val merged: ListNode? = if (node1 != null || node2 != null) ListNode(0) else null
        var currentNode: ListNode? = merged

        while (node1 != null || node2 != null) {
            if (node1 != null && node2 != null) {
                val node1Val = node1.`val`
                val node2Val = node2.`val`
                if (node1Val > node2Val) {
                    currentNode?.`val` = node2Val
                    node2 = node2.next
                } else {
                    currentNode?.`val` = node1Val
                    node1 = node1.next
                }
                currentNode?.next = if (node1 != null || node2 != null) ListNode(0) else null
                currentNode = currentNode?.next
            } else if (node1 != null) {
                val node1Val = node1.`val`
                currentNode?.`val` = node1Val
                node1 = node1.next
                currentNode?.next = if (node1 != null) ListNode(0) else null
                currentNode = currentNode?.next
            } else if (node2 != null) {
                val node2Val = node2.`val`
                currentNode?.`val` = node2Val
                node2 = node2.next
                currentNode?.next = if (node2 != null) ListNode(0) else null
                currentNode = currentNode?.next
            } else {
                break
            }
        }

        return merged
    }
}
