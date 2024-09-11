class Solution {
    // Helper function to find the middle node of the linked list
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        
        // Find the middle of the linked list
        ListNode mid = middleNode(head);
        
        // Reverse the second half of the list
        ListNode curr = mid;
        ListNode prev = null;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        // Now, `prev` points to the head of the reversed second half
        ListNode left = prev; // reversed second half
        ListNode right = head; // first half
        
        // Compare the two halves
        while (left != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        
        return true;
    }

}