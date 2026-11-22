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
    public ListNode deleteDuplicates(ListNode head) {
        // shared references
        ListNode current = head;

        while(current != null && current.next != null){
           // checks the next value 
            if (current.val == current.next.val){
                current.next = current.next.next;
            }else{
                // else move to the next pointer
                current = current.next;
            }
        }
        // return the modified array
        return head;
    }
}