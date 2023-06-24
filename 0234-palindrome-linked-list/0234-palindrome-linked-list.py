# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if not head:
            return True
        
        arr = []
        node = head
        while node is not None:
            arr.append(node.val)
            node = node.next
        
        if arr == arr[::-1]:
            return True
        
        return False