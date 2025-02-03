/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode getmid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev!=null){
            prev.next=null;
        }
        return slow;
    }

    public ListNode merge(ListNode h1,ListNode h2){
        ListNode merged = new ListNode(-1);
        ListNode temp = merged;
        while(h1!=null && h2!=null){
            if(h1.val<=h2.val){
                temp.next = h1;
                h1 = h1.next;
                temp=temp.next;
            }
            else{
                temp.next = h2;
                h2 = h2.next;
                temp=temp.next;
            }
        }
        while(h1!=null){
            temp.next = h1;
            h1 = h1.next;
            temp=temp.next;
        }
        while(h2!=null){
            temp.next = h2;
            h2 = h2.next;
            temp=temp.next;
        }
        return merged.next;
    }
    public ListNode sortList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = getmid(head);
        ListNode righthead = mid;
        //mid.next = null;
        
        ListNode newleft = sortList(head);
        ListNode newright = sortList(righthead);
        return merge(newleft,newright);
    }
}