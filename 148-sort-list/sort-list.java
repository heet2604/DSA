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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }     
        int size=0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        int arr[]=new int[size];
        temp = head;
        int i = 0;
        while(temp!=null){
            arr[i]=temp.val;
            i++;
            temp=temp.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode newNode = dummy;
        Arrays.sort(arr);
        for(int j=0;j<size;j++){
            newNode.next = new ListNode(arr[j]);
            newNode = newNode.next;
        }
        return dummy.next;
    }
}