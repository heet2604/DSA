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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        
        int res[] = new int[list.size()];
        for(int i=list.size()-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=list.get(i)){
                st.pop();
            }
            res[i] = st.isEmpty() ? 0 : st.peek();
            st.push(list.get(i));
        }
        return res;
    }
}