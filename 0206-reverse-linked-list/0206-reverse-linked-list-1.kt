/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }

        val list = mutableListOf<Int>()
        var node = head
        while (node != null) {
            list.add(node.`val`)
            node = node.next
        }

        val reversed = ListNode(list.last())
        var reversedNode = reversed
        for (i in list.size - 2 downTo 0) {
            reversedNode.next = ListNode(list[i])
            reversedNode = reversedNode.next
        }

        return reversed
    }
}